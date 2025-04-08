package com.xworkz.Casting;

    public class HeroService {
        public void useHero(Superhero hero) {
            hero.fight();
            hero.fly();
            hero.savePeople();
            hero.train();
            hero.hideIdentity();

            if (hero instanceof IronMan) {
                IronMan ironMan = (IronMan) hero;
                ironMan.upgradeSuit(); // Unique method
            }
        }
    }
