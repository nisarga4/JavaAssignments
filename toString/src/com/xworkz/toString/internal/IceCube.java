package com.xworkz.toString.internal;

    public class IceCube {
        private String shape;
        private double sizeInCm;
        private boolean isTransparent;
        private String madeFrom;

        public IceCube(String shape, double sizeInCm, boolean isTransparent, String madeFrom) {
            this.shape = shape;
            this.sizeInCm = sizeInCm;
            this.isTransparent = isTransparent;
            this.madeFrom = madeFrom;
        }

        @Override
        public String toString() {
            return "IceCube{" +
                    "Shape='" + shape + '\'' +
                    ", Size=" + sizeInCm + " cm" +
                    ", Transparent=" + (isTransparent ? "Yes" : "No") +
                    ", MadeFrom='" + madeFrom + '\'' +
                    '}';
        }
    }
