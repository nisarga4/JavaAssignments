package com.xworkz.Casting;

    public class Cake extends IceCream {

        @Override
        public void freeze() {
            System.out.println("Chilling the cake base slightly...");
        }

        @Override
        public void addFlavors() {
            System.out.println("Adding vanilla sponge and choco layers...");
        }

        @Override
        public void scoop() {
            System.out.println("Slicing the cake instead of scooping...");
        }

        @Override
        public void serve() {
            System.out.println("Serving cake with frosting on top...");
        }

        @Override
        public void eat() {
            System.out.println("Devouring a delicious slice of cake!");
        }

        public void addIcing() {
            System.out.println("Adding creamy icing to the cake...");
        }
}
