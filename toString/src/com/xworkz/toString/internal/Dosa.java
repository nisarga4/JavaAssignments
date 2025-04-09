package com.xworkz.toString.internal;

    public class Dosa {
        private String type;
        private boolean isCrispy;
        private boolean hasMasala;
        private double price;

        public Dosa(String type, boolean isCrispy, boolean hasMasala, double price) {
            this.type = type;
            this.isCrispy = isCrispy;
            this.hasMasala = hasMasala;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Dosa{" +
                    "Type='" + type + '\'' +
                    ", Crispy=" + (isCrispy ? "Yes" : "No") +
                    ", HasMasala=" + (hasMasala ? "Yes" : "No") +
                    ", Price=₹" + price +
                    '}';
        }
    }

