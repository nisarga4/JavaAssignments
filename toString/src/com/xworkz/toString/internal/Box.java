package com.xworkz.toString.internal;
    public class Box {
        private String material;
        private double volume;
        private boolean hasLid;

        public Box(String material, double volume, boolean hasLid) {
            this.material = material;
            this.volume = volume;
            this.hasLid = hasLid;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "Material='" + material + '\'' +
                    ", Volume=" + volume + "L" +
                    ", HasLid=" + (hasLid ? "Yes" : "No") +
                    '}';
        }

        @Override
        public int hashCode() {
            System.out.println("Default hashcode: " + super.hashCode());
            return 50050;
        }
    }

