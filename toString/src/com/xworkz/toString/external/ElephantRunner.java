package com.xworkz.toString.external;
import com.xworkz.toString.internal.Elephant;

    public class ElephantRunner {
        public static void main(String[] args) {
            Elephant elephant1 = new Elephant("Appu", 25, 5400.0, "Karnataka");
            Elephant elephant2 = new Elephant("Gaja", 30, 5800.5, "Kerala");

            System.out.println(elephant1);
            System.out.println(elephant2);
        }
    }
