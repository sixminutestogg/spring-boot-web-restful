package com.example.springbootwebrestful.entities;

import java.sql.Timestamp;

public class User {
    private String fullName;
    private String shirtName;
    private String passWord;
    private Timestamp update;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getShirtName() {
        return shirtName;
    }

    public void setShirtName(String shirtName) {
        this.shirtName = shirtName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public Timestamp getUpdate() {
        return update;
    }

    public void setUpdate(Timestamp update) {
        this.update = update;
    }

    @Override
    public String toString() {
        return "User{" +
                "fullName='" + fullName + '\'' +
                ", shirtName='" + shirtName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", update=" + update +
                '}';
    }
}
