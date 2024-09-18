package com.snakeandladder.model;

public interface Game {

    void addUser(User user);
    boolean move(User user, int roll);
}
