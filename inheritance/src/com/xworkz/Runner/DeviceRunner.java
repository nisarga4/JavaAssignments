package com.xworkz.Runner;

import com.xworkz.Casting.Device;
import com.xworkz.Casting.Laptop;
import com.xworkz.Casting.Technician;

public class DeviceRunner {
        public static void main(String[] args) {
            Device device = new Laptop(); // upcasting
            Technician tech = new Technician();
            tech.testDevice(device); // safe casting & call
        }
    }
