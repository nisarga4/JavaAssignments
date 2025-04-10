package com.xworkz.toString.external;

import com.xworkz.toString.internal.Number;

public class NumberRunner {
    public static void main(String[] args) {
        Number num1 = new Number(8, true, "Natural");
        Number num2 = new Number(7, false, "Prime");

        System.out.println(num1);
        System.out.println(num2);

        System.out.println("HashCode1: " + num1.hashCode());
        System.out.println("HashCode2: " + num2.hashCode());
        System.out.println(new Number(100, true, "Whole").hashCode());
    }
}
