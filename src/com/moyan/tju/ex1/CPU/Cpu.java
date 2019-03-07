package com.moyan.tju.ex1.CPU;

public abstract class Cpu {
    private String name;
    private int price;
    private int coreNum;
    public abstract String getName();
    public abstract int getPrice();
    public abstract int getCoreNum();
    public abstract void work();
}
