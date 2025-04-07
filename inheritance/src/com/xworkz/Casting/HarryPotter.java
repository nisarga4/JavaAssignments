package com.xworkz.Casting;

    public class HarryPotter extends Wizard {

        @Override
        public void castSpell() {
            System.out.println("Harry casts Expelliarmus!");
        }

        @Override
        public void brewPotion() {
            System.out.println("Harry is struggling with potion class...");
        }

        @Override
        public void rideBroom() {
            System.out.println("Harry is flying a Nimbus 2000 in Quidditch!");
        }

        @Override
        public void useWand() {
            System.out.println("Harry uses the Elder Wand.");
        }

        @Override
        public void studyMagic() {
            System.out.println("Harry is learning Defense Against the Dark Arts.");
        }

        // Unique method
        public void summonPatronus() {
            System.out.println("Harry summons a stag Patronus to fight Dementors!");
        }
    }

