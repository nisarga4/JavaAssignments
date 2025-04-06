package com.xworkz.isRelation;


import com.xworkz.inheritance.Fork;
import com.xworkz.inheritance.Knife;

    public class KnifeRunner {
        public static void main(String[] args) {
            Fork fork = new Fork();
            fork.cut();
            fork.sharpen();
            fork.clean();
            fork.store();
            fork.inspectBlade();

            System.out.println("--------------------------------------");

            Knife knife = new Fork(); // Polymorphism in action
            knife.cut();
            knife.sharpen();
            knife.clean();
            knife.store();
            knife.inspectBlade();
        }
    }


