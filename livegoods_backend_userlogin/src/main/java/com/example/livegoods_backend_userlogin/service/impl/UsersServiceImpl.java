
package com.example.livegoods_backend_userlogin.service.impl;

import com.codingapi.txlcn.tc.annotation.TccTransaction;
import com.example.livegoods_backend_userlogin.dao.UserDao;
import com.example.livegoods_backend_userlogin.service.UsersService;
import com.liangxin.pojo.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UserDao usersDao;
    @Override
    public Users selectByUsername(String username) {
        return usersDao.selectByUsername(username);
    }

    @Override

    @TccTransaction
    public int insert(Users user) {
        Users result = usersDao.insert(user);
        if(result!=null){
            return 1;
        }
        return 0;
    }

    /**
     * 把新增的数据进行删除
     * @param user
     */
    public void cancelInsert(Users user){
        System.out.println("cancel---------------");
        usersDao.deleteByUsername(user.getUsername());
    }
}
