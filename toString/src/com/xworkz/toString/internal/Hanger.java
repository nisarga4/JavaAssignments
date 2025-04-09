package com.xworkz.toString.internal;
    public class Hanger {
        private String material;
        private String type; // e.g., Clothes, Pants, Multi-purpose
        private boolean isFoldable;
        private int capacity; // how many clothes it can hold

        public Hanger(String material, String type, boolean isFoldable, int capacity) {
            this.material = material;
            this.type = type;
            this.isFoldable = isFoldable;
            this.capacity = capacity;
        }

        @Override
        public String toString() {
            return "Hanger{" +
                    "Material='" + material + '\'' +
                    ", Type='" + type + '\'' +
                    ", Foldable=" + (isFoldable ? "Yes" : "No") +
                    ", Capacity=" + capacity +
                    '}';
        }
    }