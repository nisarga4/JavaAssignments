package com.xworkz.Casting;
    public class RosePlant extends Plant {
        @Override
        public void grow() {
            System.out.println("Rose plant is growing beautifully...");
        }

        @Override
        public void absorbWater() {
            System.out.println("Rose plant is absorbing water efficiently...");
        }

        @Override
        public void photosynthesize() {
            System.out.println("Rose plant is photosynthesizing with its green leaves...");
        }

        @Override
        public void bloom() {
            System.out.println("Rose plant is blooming red roses...");
        }

        @Override
        public void shedLeaves() {
            System.out.println("Rose plant is shedding old leaves...");
        }

        public void smellFragrance() {
            System.out.println("Smelling the sweet fragrance of rose...");
        }
    }

