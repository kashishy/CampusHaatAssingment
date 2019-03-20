package com.example.campushaat;

import android.provider.ContactsContract;

public class DataHold {

    String name,address,image;
    String phone;

    public enum DataType {
        ONE_ITEM, TWO_ITEM,THREE_ITEM;
    }
    public DataHold() {
    }

    DataType type;
    public DataHold(String address, String image,String name,String phone,DataType type) {
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

    public DataType getType() {
        return type;
    }

    public void setType(DataType type) {
        this.type = type;
    }
}
