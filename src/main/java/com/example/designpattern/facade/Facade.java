package com.example.designpattern.facade;

public class Facade {
    private UserDB userDB = new UserDB();
    private UserSession userSession = new UserSession();

    public void login(int id) {
        String user = userDB.getUser(id);
        userSession.setSession(user);
    }
}
