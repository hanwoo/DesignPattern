package com.example.designpattern.facade;


public class UserDB {

    public String getUser(int id) {
        return "select id : " + id;
    }
}
