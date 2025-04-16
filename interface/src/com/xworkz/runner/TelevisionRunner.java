package com.xworkz.runner;

import com.xworkz.intenal.SmartTV;
import com.xworkz.internal.TV;

public class TelevisionRunner {
    public static void main(String[] args) {
        TV tv = new SmartTV();
        tv.switchOn();
        tv.changeChannel();
        tv.switchOff();
    }
}
