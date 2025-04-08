package com.xworkz.Runner;

import com.xworkz.Casting.Newton;
import com.xworkz.Casting.ScienceClub;
import com.xworkz.Casting.Scientist;

public class ScientistRunner {
        public static void main(String[] args) {
            Scientist scientist = new Newton(); // Upcasting
            ScienceClub club = new ScienceClub();
            club.inviteScientist(scientist); // Runtime polymorphism + safe casting
        }
    }
