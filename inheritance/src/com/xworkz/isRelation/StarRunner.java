package com.xworkz.isRelation;

import com.xworkz.inheritance.Star;
import com.xworkz.inheritance.Sparkle;

    public class StarRunner {
        public static void main(String[] args) {
            Sparkle sparkle = new Sparkle();
            sparkle.shine();
            sparkle.twinkle();
            sparkle.emitLight();
            sparkle.burn();
            sparkle.stayInGalaxy();

            System.out.println("--------------------------------------");

            Star star = new Sparkle(); // Polymorphic reference
            star.shine();
            star.twinkle();
            star.emitLight();
            star.burn();
            star.stayInGalaxy();
        }
    }
