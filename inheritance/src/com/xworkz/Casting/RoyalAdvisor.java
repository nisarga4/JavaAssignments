package com.xworkz.Casting;

    public class RoyalAdvisor {
        public void assistKing(King king) {
            king.rule();
            king.makeLaw();
            king.leadArmy();
            king.holdCourt();
            king.manageTreasury();

            if (king instanceof Shivaji) {
                Shivaji shivaji = (Shivaji) king;
                shivaji.buildForts(); // Unique method
            }
        }
    }
