package com.xworkz.Runner;

import com.xworkz.Casting.Anushka;
import com.xworkz.Casting.Manager;
import com.xworkz.Casting.Virat;

public class CelebrityRunner {
        public static void main(String[] args) {
            Anushka anushka = new Virat(); // Upcasting
            Manager manager = new Manager();
            manager.manageCelebrity(anushka); // Using parent reference
        }
    }
