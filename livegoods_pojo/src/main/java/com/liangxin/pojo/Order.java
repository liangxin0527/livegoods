package com.liangxin.pojo;

public class Order {
    private String id;
    private String title;
    private String houseType;
    private String price;
    private String rentType;
    private Integer commentState;
    private String img;
    private String user;
    // 评论
    private String feelback;

    @Override
    public String toString() {
        return "Order{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", houseType='" + houseType + '\'' +
                ", price='" + price + '\'' +
                ", rentType='" + rentType + '\'' +
                ", commentState=" + commentState +
                ", img='" + img + '\'' +
                ", user='" + user + '\'' +
                ", feelback='" + feelback + '\'' +
                '}';
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

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
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

    public Integer getCommentState() {
        return commentState;
    }

    public void setCommentState(Integer commentState) {
        this.commentState = commentState;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getFeelback() {
        return feelback;
    }

    public void setFeelback(String feelback) {
        this.feelback = feelback;
    }
}

