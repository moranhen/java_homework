package com.moyan.tju.ex1.CPU;

public class IntelCpu extends Cpu {
    private String name;
    private int price;
    private int coreNum;
    public IntelCpu(){
        this.name="com.moyan.tju.ex1.CPU.IntelCpu";
        this.coreNum =8;
        this.price=223;
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
    public int getCoreNum() {
        return coreNum;
    }

    @Override
    public void work() {
        System.out.println("Intel com.moyan.tju.ex1.CPU Work");
    }
}
