package com.xworkz.toString.external;


import com.xworkz.toString.internal.Laptop;

    public class LaptopRunner {
        public static void main(String[] args) {
            Laptop dell = new Laptop("Dell", "Intel i7", 16, 84999.50);
            Laptop hp = new Laptop("HP", "Ryzen 5", 8, 59999.99);

            System.out.println(dell);
            System.out.println(hp);
        }
    }
