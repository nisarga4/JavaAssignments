package com.xworkz.Casting;

    public class Supporter {
        public void followLeader(Leader leader) {
            leader.inspire();
            leader.leadMovement();
            leader.makeSpeech();
            leader.organizeRally();
            leader.negotiate();

            if (leader instanceof Gandhi) {
                Gandhi gandhi = (Gandhi) leader;
                gandhi.spinCharkha(); // unique method
            }
        }
    }
