package com.moyan.tju.ex1.MBoard;

public class AsusMboard extends Mboard {
    private String name;
    private int price;
    private int speed;
    @Override
    public String getName() {
        return name;
    }
    @Override
    public int getPrice() {
        return price;
    }
    public AsusMboard(){
        this.name="com.moyan.tju.ex1.MBoard.AsusMboard";
        this.price=443;
        this.speed=555555;
    }
    @Override
    public void work() {
        System.out.println("Asus com.moyan.tju.ex1.MBoard.Mboard Work");
    }
}
