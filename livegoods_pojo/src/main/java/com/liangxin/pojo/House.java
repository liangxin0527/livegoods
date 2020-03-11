package com.liangxin.pojo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.Map;

public class House implements Serializable {
    private String id;
    private String title;
    private String price;
    private String rentType;
    private String houseType;
    private Map<String, String> info;
    private String[] imgs;
    private String city;
    private Date time;
    // 是否被预订，如果是1 表示已出租 0表示未出租
    private Integer status;
    private String user;

    public String getUser() {
        return user;
    }

    @Override
    public String toString() {
        return "House{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", rentType='" + rentType + '\'' +
                ", houseType='" + houseType + '\'' +
                ", info=" + info +
                ", imgs=" + Arrays.toString(imgs) +
                ", city='" + city + '\'' +
                ", time=" + time +
                ", status=" + status +
                ", user='" + user + '\'' +
                '}';
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }

    public Map<String, String> getInfo() {
        return info;
    }

    public void setInfo(Map<String, String> info) {
        this.info = info;
    }

    public String[] getImgs() {
        return imgs;
    }

    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
