package com.moyan.tju.ex1;

import com.moyan.tju.ex1.CPU.Cpu;
import com.moyan.tju.ex1.HardDisk.HardDisk;
import com.moyan.tju.ex1.MBoard.Mboard;
import com.moyan.tju.ex1.RAM.RAM;

public class Computer {
    private String name;
    private Cpu cpu;
    private RAM ram;
    private HardDisk hardDisk;
    private Mboard mboard;

    public Computer(String name, Cpu cpu, RAM ram, HardDisk hardDisk, Mboard mboard) {
        this.name = name;
        this.cpu = cpu;
        this.hardDisk = hardDisk;
        this.mboard = mboard;
        this.ram = ram;
    }

    public void description() {
        System.out.println("这是一个叫做" + name + "的计算机其构建CPU：" + cpu.getName() + " com.moyan.tju.ex1.RAM.com.moyan.tju.ex1.RAM:" + ram.getName() + " 硬盘:" + hardDisk.getName() + " 主板:" + mboard.getName());
    }

    public void totalPrice() {
        int total = cpu.getPrice() + ram.getPrice() + hardDisk.getPrice() + mboard.getPrice();
        System.out.println("计算机总价格为：" + total + " CPU价格为" + cpu.getPrice() + " RAM价格为" + ram.getPrice() + " 硬盘价格：" + hardDisk.getPrice() + " 主板价格" + mboard.getPrice());

    }

    public void work() {
        System.out.println("计算机工作并且其部件工作如下：");
        cpu.work();
        ram.work();
        hardDisk.work();
        mboard.work();
    }
}
