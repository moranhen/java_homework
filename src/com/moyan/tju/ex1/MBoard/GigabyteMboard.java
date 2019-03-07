package com.moyan.tju.ex1.MBoard;

public class GigabyteMboard extends Mboard {
    private String name;
    private int price;
    private int speed;
    public GigabyteMboard(){
        this.name="com.moyan.tju.ex1.MBoard.GigabyteMboard";
        this.price=444;
        this.speed=555555;
    }
    @Override
    public void work() {
        System.out.println("Gigabyte com.moyan.tju.ex1.MBoard.Mboard Work");
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }
}
