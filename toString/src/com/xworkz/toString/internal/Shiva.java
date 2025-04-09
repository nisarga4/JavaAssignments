package com.xworkz.toString.internal;
    public class Shiva {
        private String consort;
        private String weapon;
        private String abode;
        private boolean isTridev;

        public Shiva(String consort, String weapon, String abode, boolean isTridev) {
            this.consort = consort;
            this.weapon = weapon;
            this.abode = abode;
            this.isTridev = isTridev;
        }

        @Override
        public String toString() {
            return "Shiva{" +
                    "Consort='" + consort + '\'' +
                    ", Weapon='" + weapon + '\'' +
                    ", Abode='" + abode + '\'' +
                    ", PartOfTridev=" + (isTridev ? "Yes" : "No") +
                    '}';
        }
    }

