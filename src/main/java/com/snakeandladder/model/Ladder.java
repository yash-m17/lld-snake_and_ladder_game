package com.snakeandladder.model;

import java.util.HashMap;

public class Ladder implements Item{
    private final HashMap<Integer, Integer> map;

    public Ladder(HashMap<Integer, Integer> map) {
        this.map = map;
    }

    @Override
    public void add(int from, int to) {
        map.put(from, to);
    }
    public boolean isPresent(int from) {
        return map.containsKey((from));
    }

    public int get(int from) {
        return map.get(from);
    }
}
