package com.snakeandladder.model;

public class Board {
    private final int size;
    private final Snake snake;
    private final Ladder ladder;
    public Board(int size, Snake snake, Ladder ladder) {
        this.size = size;
        this.snake = snake;
        this.ladder = ladder;
    }
    public void addSnake(int from, int to) {
        this.snake.add(from, to);
    }
    public void addLadder(int from, int to) {
        this.ladder.add(from, to);
    }
    public int getSize() {
        return size;
    }

    public Snake getSnake() {
        return snake;
    }

    public Ladder getLadder() {
        return ladder;
    }
}
