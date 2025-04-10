package com.xworkz.toString.external;

import com.xworkz.toString.internal.Tree;

public class TreeRunner {
    public static void main(String[] args) {
        Tree t1 = new Tree("Mango", 30, true);
        Tree t2 = new Tree("Neem", 25, false);

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("HashCode1: " + t1.hashCode());
        System.out.println("HashCode2: " + t2.hashCode());
        System.out.println(new Tree("Banyan", 50, false).hashCode());
    }
}
