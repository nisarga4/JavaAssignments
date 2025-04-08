package com.xworkz.Runner;

import com.xworkz.Casting.HeroService;
import com.xworkz.Casting.IronMan;
import com.xworkz.Casting.Superhero;

public class HeroMain {
        public static void main(String[] args) {
            Superhero superhero = new IronMan(); // Upcasting
            HeroService service = new HeroService();
            service.useHero(superhero);
        }
    }

