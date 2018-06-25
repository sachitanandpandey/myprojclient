package com.b1strudio.sdabba.model;

/**
 * Created by sachitanand on 20/05/18.
 */

public class Food {

    private String Name, image, Description, price, Discount, Menuid;

    public Food() {
    }

    public Food(String name, String image, String description, String price, String discount, String menuid) {
        Name = name;
        this.image = image;
        Description = description;
        this.price = price;
        Discount = discount;
        Menuid = menuid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDiscount() {
        return Discount;
    }

    public void setDiscount(String discount) {
        Discount = discount;
    }

    public String getMenuid() {
        return Menuid;
    }

    public void setMenuid(String menuid) {
        Menuid = menuid;
    }
}
