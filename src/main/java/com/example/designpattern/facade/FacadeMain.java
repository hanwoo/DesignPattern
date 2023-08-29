package com.example.designpattern.facade;

import com.example.designpattern.iterator.Iterator;
import com.example.designpattern.iterator.User;
import com.example.designpattern.iterator.UserAggregate;

public class FacadeMain {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.login(1);
    }
}
