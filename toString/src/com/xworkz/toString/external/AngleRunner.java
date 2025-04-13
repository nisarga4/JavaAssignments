package com.xworkz.toString.external;

import com.xworkz.toString.internal.Angle;

public class AngleRunner {
    public static void main(String[] args) {
        // Creating two instances of Angle with three properties
        Angle angle1 = new Angle(90.0, "Right", "Blue");
        System.out.println(angle1);

        // Printing the hash code of angle1
        int code = angle1.hashCode();
        System.out.println("Code: " + code);

        // Creating a new Angle object and printing its hash code
        System.out.println(new Angle(90.0, "Right", "Blue").hashCode());


        Angle angle2 = new Angle(45.0, "Acute", "Red");
        Angle angle3 = new Angle(90.0, "Right", "Blue");

        // Checking if the two Angle instances are the same based on reference location
        System.out.println("Checking same location: " + (angle2 == angle3));

        // Comparing angle2 and angle3 using the equals() method
        Boolean same = angle3.equals(angle2);
        System.out.println("Angle3 is same as Angle2: " + same);
    }
}
