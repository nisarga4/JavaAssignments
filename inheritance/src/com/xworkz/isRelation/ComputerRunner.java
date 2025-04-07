package com.xworkz.isRelation;
import com.xworkz.inheritance.Computer;
import com.xworkz.inheritance.Processor;

    public class ComputerRunner {
        public static void main(String[] args) {
            Processor processor = new Processor();
            processor.start();
            processor.shutdown();
            processor.compute();
            processor.connectToInternet();
            processor.storeData();

            System.out.println("--------------------------------------");

            Computer computer = new Processor();
            computer.start();
            computer.shutdown();
            computer.compute();
            computer.connectToInternet();
            computer.storeData();
        }
    }

