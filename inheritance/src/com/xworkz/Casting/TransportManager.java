package com.xworkz.Casting;
    public class TransportManager {

        public void operateTransport(Vehicle vehicle) {
            vehicle.start();
            vehicle.accelerate();
            vehicle.brake();
            vehicle.refuel();
            vehicle.stop();

            if (vehicle instanceof Bus) {
                Bus bus = (Bus) vehicle;
                bus.announceStop(); // Safe casting and new method
            }
        }
    }

