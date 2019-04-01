package com.tju.edu.test;

public class Person implements  IPerson {
    private String string="person field";
    private int i = 2019;
    @Override
    public void skill() {
        System.out.println("com.tju.edu.test.Person skill");
    }
}
