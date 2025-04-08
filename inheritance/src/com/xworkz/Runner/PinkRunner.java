package com.xworkz.Runner;

import com.xworkz.Casting.Color;
import com.xworkz.Casting.Green;
import com.xworkz.Casting.Pink;

public class PinkRunner {
        public static void main(String[] args) {
            Color color = new Green(); // Upcasting
            Pink pink = new Pink();
            pink.useColor(color); // Using parent reference
        }
    }

