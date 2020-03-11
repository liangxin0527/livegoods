package com.liangxin.pojo;

public class Product {
    // 主键
    private String id;
    // 标题
    private String title;
    // 商品图片
    private String img;
    // 点击跳转
    private String link;
    // 销量
    private Integer sales;
    // 是否为热门
    private Boolean recommendation;
    // 热门排序
    private Integer recoSort;
    // 所属城市
    private String city;

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", img='" + img + '\'' +
                ", link='" + link + '\'' +
                ", sales=" + sales +
                ", recommendation=" + recommendation +
                ", recoSort=" + recoSort +
                ", city='" + city + '\'' +
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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Boolean getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Boolean recommendation) {
        this.recommendation = recommendation;
    }

    public Integer getRecoSort() {
        return recoSort;
    }

    public void setRecoSort(Integer recoSort) {
        this.recoSort = recoSort;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
