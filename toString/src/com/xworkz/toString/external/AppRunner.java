package com.xworkz.toString.external;
import com.xworkz.toString.internal.App;

public class AppRunner {
    public static void main(String[] args) {
        App app1 = new App("WhatsApp", "Meta", 2.23);
        System.out.println(app1);

        int hash = app1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(app1));

        App app2 = new App("WhatsApp", "Meta", 2.23);
        App app3 = new App("Instagram", "Meta", 3.0);

        System.out.println("Checking same location: " + (app2 == app3));
        boolean same = app2.equals(app3);
        System.out.println("App2 is same as App3: " + same);
    }
}
