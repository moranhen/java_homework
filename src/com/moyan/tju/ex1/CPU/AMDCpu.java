package com.moyan.tju.ex1.CPU;

public class AMDCpu extends Cpu {
    private String name;
    private int price;
    private int coreNum;
    public AMDCpu(){
        this.name = "com.moyan.tju.ex1.CPU.AMDCpu";
        this.price = 222;
        this.coreNum = 7;
    }
    @Override
    public void work() {
        System.out.println("AMD com.moyan.tju.ex1.CPU.Cpu Work");
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getCoreNum() {
        return coreNum;
    }


}
