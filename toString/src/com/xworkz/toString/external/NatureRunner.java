package com.xworkz.toString.external;

import com.xworkz.toString.internal.Nature;

public class NatureRunner {
    public static void main(String[] args) {
        Nature nature1 = new Nature("Earth", "Forest", "Spring");
        System.out.println(nature1);

        int hash = nature1.hashCode();
        System.out.println("Hash Code: " + hash);

        Nature nature2 = new Nature("Earth", "Forest", "Spring");
        Nature nature3 = new Nature("Water", "Ocean", "Summer");

        System.out.println("Checking same location: " + (nature1 == nature2));
        boolean same = nature1.equals(nature2);
        System.out.println("Nature1 is same as Nature2: " + same);

        boolean different = nature1.equals(nature3);
        System.out.println("Nature1 is same as Nature3: " + different);
    }
}
