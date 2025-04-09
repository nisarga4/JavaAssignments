package com.xworkz.toString.external;

import com.xworkz.toString.internal.Novel;

    public class NovelRunner {
        public static void main(String[] args) {
            Novel novel1 = new Novel("The Alchemist", "Paulo Coelho", "Fiction", 208);
            Novel novel2 = new Novel("1984", "George Orwell", "Dystopian", 328);

            System.out.println(novel1);
            System.out.println(novel2);
        }
    }
