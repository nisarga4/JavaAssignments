package com.xworkz.toString.external;
import com.xworkz.toString.internal.Alaram;

public class AlaramRunner {
    public static void main(String[] args) {
        Alaram alaram = new Alaram("Sony", 80, "Buzzer");
        System.out.println(alaram);

        int hash = alaram.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(alaram));

        Alaram alaram1 = new Alaram("Sony", 80, "Buzzer");
        Alaram alaram2 = new Alaram("Sony", 90, "Buzzer");

        System.out.println("Checking same location: " + (alaram1 == alaram2));
        boolean same = alaram1.equals(alaram2);
        System.out.println("Alarm1 is same as Alarm2: " + same);
    }
}
