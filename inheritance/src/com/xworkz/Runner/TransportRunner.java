package com.xworkz.Runner;

import com.xworkz.Casting.Bus;
import com.xworkz.Casting.TransportManager;
import com.xworkz.Casting.Vehicle;

public class TransportRunner {
        public static void main(String[] args) {
            Vehicle vehicle = new Bus(); // Upcasting
            TransportManager manager = new TransportManager();
            manager.operateTransport(vehicle);
        }
    }

