package com.snakeandladder.model;

import java.util.*;

public class SnakeAndLadderGame implements Game{
    private final Board board;
    private final Dice dice;
    private final List<User> users;
    private final List<User> winners;
    public SnakeAndLadderGame(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
        users = new ArrayList<>();
        winners = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        if (users.stream().map(User::getId).toList().contains(user.getId())) {
            System.out.println("User already exists!");
            return;
        }
        users.add(user);
        System.out.println("User " + user.getName() + " was added.");
    }

    @Override
    public boolean move(User user, int roll) {
        if (user.getPosition() + roll > board.getSize()) {
            System.out.println("Invalid roll. Please roll the dice again!");
            return false;
        }
        int newPosition = user.getPosition() + roll;
        if (board.getLadder().isPresent(newPosition)) {
            newPosition = board.getLadder().get(newPosition);
            System.out.println(user.getName() + " got the ladder to " + newPosition + "!");
        }
        else if (board.getSnake().isPresent(newPosition)) {
            newPosition = board.getSnake().get(newPosition);
            System.out.println(user.getName() + " got bitten by a snake, moved back to " + newPosition + "!");
        }

        user.setPosition(newPosition);
        System.out.println(user.getName() + " has reached position " + user.getPosition());

        if (newPosition == board.getSize()) {
            winners.add(user);
            System.out.println(user.getName() + " has finished with rank " + winners.size() + "!");
        }

        return true;
    }

    public void simulate() {
        int ite = 0;
        while(winners.size() != users.size()) {
            int roll = 0;
            User user = users.get(ite);
            if (!winners.contains((user))) {
                do {
                    roll = dice.roll();
                    System.out.println(user.getName() + " has rolled a " + roll);
                } while(!move(users.get(ite), roll));
            }

            ite = (ite + 1) % users.size();
        }
    }

    public List<User> getWinners() {
        return winners;
    }
}
