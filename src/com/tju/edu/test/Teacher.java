package com.tju.edu.test;

public class Teacher extends Person {
    public String string ="com.tju.edu.test.Teacher field";
    private int i =2018;
    public Teacher (){
        System.out.println("无参构造方法执行了");
    }
    private Teacher(int i){
        this.i=i;
        System.out.println("private的有参数构造方法执行了且i = "+this.i);
    }
    @Override
    public void  skill(){
        System.out.println("com.tju.edu.test.Teacher skill");
    }
    private void teach(String temp,int i){
        System.out.println("com.tju.edu.test.Teacher can teach!");
    }
}
