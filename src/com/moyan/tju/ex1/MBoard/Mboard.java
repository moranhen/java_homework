package com.moyan.tju.ex1.MBoard;

public abstract class Mboard {
    private String name;
    private int price;
    private int speed;
    public abstract String getName();
    public abstract int getPrice();
    public abstract void work();
}
