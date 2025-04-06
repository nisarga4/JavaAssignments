package com.xworkz.isRelation;

import com.xworkz.inheritance.Chair;
import com.xworkz.inheritance.Desk;

    public class DeskRunner {
        public static void main(String[] args) {
            Chair chair = new Chair();
            chair.openDrawer();
            chair.closeDrawer();
            chair.cleanSurface();
            chair.organizeItems();
            chair.lockDesk();

            System.out.println("--------------------------------------");

            Desk desk = new Chair(); // Polymorphic reference
            desk.openDrawer();
            desk.closeDrawer();
            desk.cleanSurface();
            desk.organizeItems();
            desk.lockDesk();
        }
    }
