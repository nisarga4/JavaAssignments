package com.xworkz.isRelation;

import com.xworkz.inheritance.Nail;
import com.xworkz.inheritance.Hammer;

    public class HammerRunner {
        public static void main(String[] args) {
            Nail nail = new Nail();
            nail.hit();
            nail.lift();
            nail.drop();
            nail.clean();
            nail.store();

            System.out.println("--------------------------------------");

            Hammer hammer = new Nail(); // Polymorphic reference
            hammer.hit();
            hammer.lift();
            hammer.drop();
            hammer.clean();
            hammer.store();
        }
    }
