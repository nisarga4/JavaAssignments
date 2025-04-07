package com.xworkz.isRelation;
import com.xworkz.inheritance.House;
import com.xworkz.inheritance.Roof;

    public class HouseRunner {
        public static void main(String[] args) {
            Roof roof = new Roof();
            roof.build();
            roof.paint();
            roof.lockDoors();
            roof.clean();
            roof.decorate();

            System.out.println("--------------------------------------");

            House house = new Roof();
            house.build();
            house.paint();
            house.lockDoors();
            house.clean();
            house.decorate();
        }
    }
