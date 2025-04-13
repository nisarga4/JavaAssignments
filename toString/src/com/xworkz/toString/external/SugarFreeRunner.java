package com.xworkz.toString.external;

import com.xworkz.toString.internal.SugarFree;

public class SugarFreeRunner {
    public static void main(String[] args) {
        SugarFree sugarFree1 = new SugarFree("Stevia", "Mint", 100);
        System.out.println(sugarFree1);

        int hash = sugarFree1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(sugarFree1));

        SugarFree sugarFree2 = new SugarFree("Stevia", "Mint", 100);
        SugarFree sugarFree3 = new SugarFree("Equal", "Vanilla", 50);

        System.out.println("Checking same location: " + (sugarFree1 == sugarFree2));
        boolean same = sugarFree1.equals(sugarFree2);
        System.out.println("SugarFree1 is same as SugarFree2: " + same);

        boolean sameSugarFree3 = sugarFree1.equals(sugarFree3);
        System.out.println("SugarFree1 is same as SugarFree3: " + sameSugarFree3);
    }
}
