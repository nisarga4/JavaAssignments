package com.xworkz.toString.external;

import com.xworkz.toString.internal.School;

    public class SchoolRunner {
        public static void main(String[] args) {
            School school1 = new School("Greenwood High", "Bangalore", 1500, false);
            School school2 = new School("Government Model School", "Mysore", 1200, true);

            System.out.println(school1);
            System.out.println(school2);
        }
    }
