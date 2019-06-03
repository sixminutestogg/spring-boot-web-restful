package com.example.springbootwebrestful.entities;

import java.sql.Timestamp;

public class User {
    private Integer id;
    private String fullName;
    private String shirtName;
    private String passWord;
    private String creatdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getCreatdate() {
        return creatdate;
    }

    public void setCreatdate(String creatdate) {
        this.creatdate = creatdate;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", shirtName='" + shirtName + '\'' +
                ", passWord='" + passWord + '\'' +
                ", creatdate='" + creatdate + '\'' +
                '}';
    }
}
