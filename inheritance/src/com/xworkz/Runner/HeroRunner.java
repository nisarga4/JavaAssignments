package com.xworkz.Runner;

import com.xworkz.Casting.Hero;
import com.xworkz.Casting.HeroHandler;
import com.xworkz.Casting.SpiderMan;

public class HeroRunner {
        public static void main(String[] args) {
            Hero hero = new SpiderMan(); // Upcasting
            HeroHandler handler = new HeroHandler();
            handler.handleHero(hero); // Runtime polymorphism & casting
        }
    }

