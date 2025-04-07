package com.xworkz.Runner;

import com.xworkz.Casting.Deepika;
import com.xworkz.Casting.MediaAgency;
import com.xworkz.Casting.Ranveer;

public class BollywoodRunner {
        public static void main(String[] args) {
            Ranveer star = new Deepika(); // Upcasting
            MediaAgency agency = new MediaAgency();
            agency.coverStar(star); // Polymorphic behavior
        }
    }

