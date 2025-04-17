package com.xworkz.runner;


import com.xworkz.intenal.SmartTV;
import com.xworkz.interfacee.Television;

public class TelevisionRunner {
    public static void main(String[] args) {
        Television tv = new SmartTV();
        tv.powerOn();
        tv.changeChannel();
        tv.powerOff();
    }
}
