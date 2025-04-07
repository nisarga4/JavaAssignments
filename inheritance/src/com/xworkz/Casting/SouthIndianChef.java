package com.xworkz.Casting;

    public class SouthIndianChef {

        public void makeDish(Idli idli) {
            idli.prepareBatter();
            idli.steam();
            idli.serveWithChutney();
            idli.serveWithSambar();
            idli.enjoy();

            if (idli instanceof Dosa) {
                Dosa dosa = (Dosa) idli;
                dosa.foldDosa(); // Unique dosa method
            }
        }
    }
