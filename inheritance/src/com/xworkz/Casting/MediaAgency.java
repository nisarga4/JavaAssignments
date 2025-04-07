package com.xworkz.Casting;

    public class MediaAgency {

        public void coverStar(Ranveer ranveer) {
            ranveer.act();
            ranveer.dance();
            ranveer.promote();
            ranveer.attendShow();
            ranveer.endorseBrand();

            if (ranveer instanceof Deepika) {
                Deepika deepika = (Deepika) ranveer;
                deepika.walkOnRamp(); // Safe casting
            }
        }
    }
