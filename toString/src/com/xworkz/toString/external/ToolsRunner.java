package com.xworkz.toString.external;

import com.xworkz.toString.internal.Tools;

public class ToolsRunner {
    public static void main(String[] args) {
        Tools t1 = new Tools("Drill", "Boring holes", true);
        Tools t2 = new Tools("Hammer", "Nailing", false);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("HashCode1: " + t1.hashCode());
        System.out.println("HashCode2: " + t2.hashCode());
        System.out.println(new Tools("Saw", "Cutting wood", false).hashCode());
    }
}
