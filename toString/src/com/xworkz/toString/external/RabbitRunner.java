package com.xworkz.toString.external;

import com.xworkz.toString.internal.Rabbit;

public class RabbitRunner {
    public static void main(String[] args) {
        Rabbit r1 = new Rabbit("White", 2, true);
        Rabbit r2 = new Rabbit("Brown", 1, false);

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("HashCode1: " + r1.hashCode());
        System.out.println("HashCode2: " + r2.hashCode());
        System.out.println(new Rabbit("Black", 3, true).hashCode());
    }
}
