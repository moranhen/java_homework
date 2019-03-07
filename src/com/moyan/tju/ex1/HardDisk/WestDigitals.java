package com.moyan.tju.ex1.HardDisk;

public class WestDigitals extends HardDisk{
    private String name;
    private int price;
    private int volume;
    public WestDigitals(){
        this.name="com.moyan.tju.ex1.HardDisk.WestDigitals";
        this.price=334;
        this.volume=256;
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

    @Override
    public void work() {
        System.out.println("com.moyan.tju.ex1.HardDisk.WestDigitals Hard Disk Work");
    }
}
