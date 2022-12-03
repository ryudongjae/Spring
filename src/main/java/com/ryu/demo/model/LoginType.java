package com.ryu.demo.model;

public enum LoginType {
    USER(1,"user"),ADMIN(2,"admin"),COMPANY(3,"company");

    private long id;
    private String name;

    LoginType(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
