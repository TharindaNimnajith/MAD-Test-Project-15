package com.demo.testapp.Other;

class singleton {
    private static final singleton ourInstance = new singleton();

    private singleton() {
    }

    static singleton getInstance() {
        return ourInstance;
    }
}
