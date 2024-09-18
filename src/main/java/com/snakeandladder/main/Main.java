package com.snakeandladder.main;

import com.snakeandladder.model.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Snake snake = new Snake(new HashMap<>());
        Ladder ladder = new Ladder(new HashMap<>());
        Board board = new Board(100, snake, ladder);
        board.addSnake(98, 2);
        board.addSnake(55, 17);
        board.addLadder(6, 55);
        board.addLadder(8, 19);
        board.addLadder(16, 69);

        Dice dice = new DefaultDice(new Random());
        User u1 = new User("1", "Yash");
        User u2 = new User("2", "Shreyash");
        User u3 = new User("3", "Pranjal");

        SnakeAndLadderGame game = new SnakeAndLadderGame(board, dice);
        game.addUser(u1);
        game.addUser(u2);
        game.addUser(u3);

        game.simulate();
        System.out.println("Thanks for playing!");
    }
}