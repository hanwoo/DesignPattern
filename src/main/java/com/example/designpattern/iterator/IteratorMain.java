package com.example.designpattern.iterator;

import java.util.HashMap;
import java.util.Map;

public class IteratorMain {
    public static void main(String[] args) {

        UserAggregate userAggregate = new UserAggregate(5);

        userAggregate.addUser(new User(1, "aa"));
        userAggregate.addUser(new User(2, "bb"));
        userAggregate.addUser(new User(3, "cc"));
        userAggregate.addUser(new User(4, "dd"));
        userAggregate.addUser(new User(5, "ee"));

        Iterator iterator = userAggregate.interator();

        while (iterator.hasNext()) {
            User user = (User) iterator.next();
            System.out.println("id : " + user.getId());
            System.out.println("name : " + user.getName());
            System.out.println("------------------------");
        }
    }
}
