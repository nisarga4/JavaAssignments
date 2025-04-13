package com.xworkz.toString.internal;
    public class Tshirt {
        private String color;
        private String material;
        private double length;

        public Tshirt(String color, String material, double length) {
            this.color = color;
            this.material = material;
            this.length = length;
        }

        @Override
        public String toString() {
            return "Towel{" +
                    "Color='" + color + '\'' +
                    ", Material='" + material + '\'' +
                    ", Length=" + length + "cm" +
                    '}';
        }

        @Override
        public int hashCode() {
            System.out.println("Default hashcode: " + super.hashCode());
            return 42042;
        }

        @Override
        public boolean equals(Object obj) {
            if(obj!=null)
            {
                System.out.println("ref is not null");
                if(obj instanceof Tshirt){
                    System.out.println("ref is tshirt,will compare");
                    Tshirt tshirt1=this;
                    Tshirt tshirt2(Tshirt)obj;
                    if(tshirt1.price==)
                }
            }
        }
    }

