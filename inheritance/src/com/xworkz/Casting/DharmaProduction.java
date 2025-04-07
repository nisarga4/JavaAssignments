package com.xworkz.Casting;

    public class DharmaProduction {

        public void promoteStar(KaranJohar karan) {
            karan.launchTalent();
            karan.directMovie();
            karan.hostShow();
            karan.writeScript();
            karan.attendAwardFunction();

            if (karan instanceof AliaBhatt) {
                AliaBhatt alia = (AliaBhatt) karan;
                alia.singSong(); // Unique to Alia
            }
        }
    }