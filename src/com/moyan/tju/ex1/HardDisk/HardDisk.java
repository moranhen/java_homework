package com.moyan.tju.ex1.HardDisk;

public abstract class HardDisk {
    private String name;
    private int price;
    private int volume;
    public abstract String getName();
    public abstract int getPrice();
    public  abstract int getVolume();
    public abstract void work();
}
