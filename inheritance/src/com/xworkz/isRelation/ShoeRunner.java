package com.xworkz.isRelation;


import com.xworkz.inheritance.Laces;
import com.xworkz.inheritance.Shoe;

    public class ShoeRunner {
        public static void main(String[] args) {
            Laces laces = new Laces();
            laces.wear();
            laces.remove();
            laces.clean();
            laces.polish();
            laces.store();

            System.out.println("--------------------------------------");

            Shoe shoe = new Laces(); // Polymorphic reference
            shoe.wear();
            shoe.remove();
            shoe.clean();
            shoe.polish();
            shoe.store();
        }
    }


