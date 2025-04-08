package com.xworkz.Casting;

    public class JuiceMaker {

        public void prepareJuice(Juice juice) {
            juice.extract();
            juice.filter();
            juice.addSugar();
            juice.chill();
            juice.serve();

            if (juice instanceof OrangeJuice) {
                OrangeJuice oj = (OrangeJuice) juice;
                oj.addVitaminC(); // Unique method
            }
        }
    }