package com.moyan.tju.ex1.RAM;

public abstract class RAM {
    private String name;
    private int price;
    private int volume;

    public abstract String getName();

    public abstract int getPrice();

    public abstract int getVolume();

    public abstract void work();
}
