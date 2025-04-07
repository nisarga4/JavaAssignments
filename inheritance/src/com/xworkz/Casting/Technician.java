package com.xworkz.Casting;

    public class Technician {
        public void testDevice(Device device) {
            device.start();
            device.stop();
            device.charge();
            device.restart();
            device.update();

            if (device instanceof Laptop) {
                Laptop laptop = (Laptop) device;
                laptop.runIDE();  // calling unique method from subclass
            }
        }
    }
