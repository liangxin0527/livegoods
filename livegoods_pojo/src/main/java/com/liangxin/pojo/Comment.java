
package com.liangxin.pojo;

public class Comment {
    private String id;
    private String username;
    private String comment;
    private int star;
    private String hid;

    @Override
    public String toString() {
        return "Comment{" +
                "id='" + id + '\'' +
                ", username='" + username + '\'' +
                ", comment='" + comment + '\'' +
                ", star=" + star +
                ", hid='" + hid + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getHid() {
        return hid;
    }

    public void setHid(String hid) {
        this.hid = hid;
    }
}
