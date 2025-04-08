package com.xworkz.Runner;

import com.xworkz.Casting.King;
import com.xworkz.Casting.RoyalAdvisor;
import com.xworkz.Casting.Shivaji;

public class KingRunner {
        public static void main(String[] args) {
            King king = new Shivaji(); // Upcasting
            RoyalAdvisor advisor = new RoyalAdvisor();
            advisor.assistKing(king);
        }
    }

