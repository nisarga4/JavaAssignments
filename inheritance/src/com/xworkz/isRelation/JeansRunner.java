package com.xworkz.isRelation;


import com.xworkz.inheritance.Jacket;
import com.xworkz.inheritance.Jeans;

    public class JeansRunner {
        public static void main(String[] args) {
            Jacket jacket = new Jacket();
            jacket.wear();
            jacket.wash();
            jacket.fold();
            jacket.iron();
            jacket.hang();

            System.out.println("--------------------------------------");

            Jeans jeans = new Jacket(); // Polymorphic reference
            jeans.wear();
            jeans.wash();
            jeans.fold();
            jeans.iron();
            jeans.hang();
        }
    }
