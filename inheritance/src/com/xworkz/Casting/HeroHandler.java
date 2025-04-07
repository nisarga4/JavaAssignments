package com.xworkz.Casting;

public class HeroHandler {


        public void handleHero(Hero hero) {
            hero.savePeople();
            hero.fightCrime();
            hero.patrolCity();
            hero.usePower();
            hero.hideIdentity();

            if (hero instanceof SpiderMan) {
                SpiderMan spidey = (SpiderMan) hero;
                spidey.swing(); // Subclass unique method
            }
        }
    }

