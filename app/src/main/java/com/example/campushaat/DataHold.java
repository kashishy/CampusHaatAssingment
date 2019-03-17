package com.example.campushaat;

public class DataHold {

    String name,type,address,image;
    String phone;

    public DataHold() {
    }

    public DataHold(String address, String image,String name,String phone,String type) {
        this.name = name;
        this.type = type;
        this.phone = phone;
        this.address = address;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String  getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
