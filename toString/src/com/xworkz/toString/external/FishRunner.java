package com.xworkz.toString.external;

import com.xworkz.toString.internal.Fish;

public class FishRunner {
    public static void main(String[] args) {
        Fish fish1 = new Fish("Salmon", 5.2, "River");
        System.out.println(fish1);

        int hash = fish1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(fish1));

        Fish fish2 = new Fish("Salmon", 5.2, "River");
        Fish fish3 = new Fish("Trout", 3.0, "Lake");

        System.out.println("Checking same location: " + (fish1 == fish2));
        boolean same = fish1.equals(fish2);
        System.out.println("Fish1 is same as Fish2: " + same);

        System.out.println("Fish1 is same as Fish3: " + fish1.equals(fish3));
    }
}
