package com.xworkz.toString.external;

import com.xworkz.toString.internal.Engine;

public class EngineRunner {
    public static void main(String[] args) {
        Engine engine1 = new Engine("V8", 500, 450.5);
        System.out.println(engine1);

        int hash = engine1.hashCode();
        System.out.println("Hash Code: " + hash);
        System.out.println("Original Code: " + System.identityHashCode(engine1));

        Engine engine2 = new Engine("V8", 500, 450.5);
        Engine engine3 = new Engine("V6", 400, 350.0);

        System.out.println("Checking same location: " + (engine1 == engine2));
        boolean same = engine1.equals(engine2);
        System.out.println("Engine1 is same as Engine2: " + same);

        System.out.println("Engine1 is same as Engine3: " + engine1.equals(engine3));
    }
}
