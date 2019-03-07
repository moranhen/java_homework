package com.moyan.tju.ex1.RAM;

public class SamsungRAM extends RAM {
    private String name;
    private int price;
    private int volume;

    public SamsungRAM() {
        this.name = "com.moyan.tju.ex1.RAM.SamsungRAM";
        this.price = 111;
        this.volume = 8;
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
        System.out.println("Samsung Ram Work");
    }
}
