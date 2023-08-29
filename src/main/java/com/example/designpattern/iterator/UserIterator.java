package com.example.designpattern.iterator;

public class UserIterator implements Iterator {
    private UserAggregate userAggregate;
    private int index;

    public UserIterator(UserAggregate userAggregate) {
        this.userAggregate = userAggregate;
    }

    @Override
    public boolean hasNext() {
        return this.userAggregate.getLength() > index;
    }

    @Override
    public Object next() {
        return userAggregate.getUser(index++);
    }
}
