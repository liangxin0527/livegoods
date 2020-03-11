package com.example.livegoods_backend_search.pojo;


import jdk.nashorn.internal.ir.annotations.Ignore;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "house_index", type = "house_type", shards = 1, replicas = 1)
public class ESHouse {
    @Id
    private String id;
    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;
    @Field(type = FieldType.Keyword, index = false)
    private String houseType;
    @Field(type = FieldType.Keyword, index = false)
    private String price;
    @Field(type = FieldType.Keyword, index = false)
    private String rentType;
    @Field(type = FieldType.Keyword, index = false)
    private String img;
    @Ignore
    @Field(type = FieldType.Keyword)
    private String city;

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

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "ESHouse{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", houseType='" + houseType + '\'' +
                ", price='" + price + '\'' +
                ", rentType='" + rentType + '\'' +
                ", img='" + img + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
