package com.snakeandladder.model;

public class User {
    private final String id;
    private String name;
    private int position;

    public User(String id, String name) {
        this.id = id;
        this.name = name;
        position = 1;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
