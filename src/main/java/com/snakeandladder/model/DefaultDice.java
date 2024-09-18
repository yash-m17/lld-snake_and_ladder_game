package com.snakeandladder.model;

import java.util.Random;

public class DefaultDice implements Dice{
    private final Random dice;
    public DefaultDice(Random dice) {
        this.dice = dice;
    }
    @Override
    public int roll() {
        return 1 + dice.nextInt(6);
    }
}
