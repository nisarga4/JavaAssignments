package com.xworkz.toString.external;
import com.xworkz.toString.internal.Fashion;

    public class FashionRunner {
        public static void main(String[] args) {
            Fashion fashion1 = new Fashion("Streetwear", "Summer", true, "Unisex");
            Fashion fashion2 = new Fashion("Formal", "Winter", false, "Men");

            System.out.println(fashion1);
            System.out.println(fashion2);
        }
    }

