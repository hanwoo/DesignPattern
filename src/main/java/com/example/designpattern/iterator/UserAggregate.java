package com.example.designpattern.iterator;

public class UserAggregate implements Aggregate {
    private User[] Users;
    int num = 0;

    @Override
    public Iterator interator() {
        return new UserIterator(this);
    }

    public UserAggregate(int num) {
        this.Users = new User[num];
    }

    public void addUser(User User) {
        this.Users[num++] = User;
    }

    public User getUser(int num) {
        return this.Users[num];
    }

    public int getLength() {
        return this.num;
    }

}
