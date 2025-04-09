package com.xworkz.toString.external;
import com.xworkz.toString.internal.Wall;

    public class WallRunner {
        public static void main(String[] args) {
            Wall wall1 = new Wall("Brick", 2.5, 4.0, "White");
            Wall wall2 = new Wall("Concrete", 3.0, 5.5, "Grey");

            System.out.println(wall1);
            System.out.println(wall2);
        }
    }
