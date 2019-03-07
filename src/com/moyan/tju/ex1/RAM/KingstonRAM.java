package com.moyan.tju.ex1.RAM;

public class KingstonRAM extends RAM {
    private String name;
    private int price;
    private int volume;
    public KingstonRAM() {
        this.name = "com.moyan.tju.ex1.RAM.KingstonRAM";
        this.price = 115;
        this.volume = 8;
    }
    @Override
    public void work() {
        System.out.println("Kingston com.moyan.tju.ex1.RAM.com.moyan.tju.ex1.RAM Work");
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
