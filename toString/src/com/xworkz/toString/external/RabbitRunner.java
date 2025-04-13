package com.xworkz.toString.external;

import com.xworkz.toString.internal.Rabbit;

public class RabbitRunner {
    public static void main(String[] args) {
        Rabbit rabbit1 = new Rabbit("Himalayan", 2.5, "White");
        System.out.println(rabbit1);

        int hash = rabbit1.hashCode();
        System.out.println("Hash Code: " + hash);

        Rabbit rabbit2 = new Rabbit("Himalayan", 2.5, "White");
        Rabbit rabbit3 = new Rabbit("Angora", 3.0, "Gray");

        System.out.println("Checking same location: " + (rabbit1 == rabbit2));
        boolean same = rabbit1.equals(rabbit2);
        System.out.println("Rabbit1 is same as Rabbit2: " + same);

        boolean different = rabbit1.equals(rabbit3);
        System.out.println("Rabbit1 is same as Rabbit3: " + different);
    }
}
