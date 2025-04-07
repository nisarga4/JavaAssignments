package com.xworkz.Runner;

import com.xworkz.Casting.AliaBhatt;
import com.xworkz.Casting.DharmaProduction;
import com.xworkz.Casting.KaranJohar;

public class BollywoodMain {
        public static void main(String[] args) {
            KaranJohar kj = new AliaBhatt(); // Upcasting
            DharmaProduction dharma = new DharmaProduction();
            dharma.promoteStar(kj); // Using parent ref & safe casting
        }

}
