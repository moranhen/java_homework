package com.moyan.tju.ex1.HardDisk;

public class Seagate extends HardDisk  {
    private String name;
    private int price;
    private int volume;
    public Seagate(){
        this.name="com.moyan.tju.ex1.HardDisk.Seagate";
        this.price=333;
        this.volume=256;
    }
    @Override
    public void work() {
        System.out.println("com.moyan.tju.ex1.HardDisk.Seagate Hard Disk Work");
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public int getVolume() {
        return volume;
    }
}
