package com.moyan.tju.ex1;

import com.moyan.tju.ex1.CPU.AMDCpu;
import com.moyan.tju.ex1.CPU.IntelCpu;
import com.moyan.tju.ex1.HardDisk.Seagate;
import com.moyan.tju.ex1.HardDisk.WestDigitals;
import com.moyan.tju.ex1.MBoard.AsusMboard;
import com.moyan.tju.ex1.MBoard.GigabyteMboard;
import com.moyan.tju.ex1.RAM.KingstonRAM;
import com.moyan.tju.ex1.RAM.SamsungRAM;

import java.util.ArrayList;
import java.util.List;

public class ComputerStore {
    public static void main(String[] args) {
        Computer dell = new Computer("Dell", new AMDCpu(), new SamsungRAM(), new Seagate(), new AsusMboard());
        Computer hasee = new Computer("Hasee", new IntelCpu(), new KingstonRAM(), new WestDigitals(), new GigabyteMboard());
        Computer mac = new Computer("Mac", new IntelCpu(), new KingstonRAM(), new Seagate(), new AsusMboard());
        List<Computer> computerList = new ArrayList<>();
        computerList.add(dell);
        computerList.add(hasee);
        computerList.add(mac);
        for (Computer cp : computerList) {
            cp.description();
            cp.totalPrice();
            cp.work();
        }
    }


}
