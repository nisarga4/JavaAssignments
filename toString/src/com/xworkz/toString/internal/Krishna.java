package com.xworkz.toString.internal;
    public class Krishna {
        private String placeOfBirth;
        private String motherName;
        private String weapon;
        private boolean isAvatarOfVishnu;

        public Krishna(String placeOfBirth, String motherName, String weapon, boolean isAvatarOfVishnu) {
            this.placeOfBirth = placeOfBirth;
            this.motherName = motherName;
            this.weapon = weapon;
            this.isAvatarOfVishnu = isAvatarOfVishnu;
        }

        @Override
        public String toString() {
            return "Krishna{" +
                    "PlaceOfBirth='" + placeOfBirth + '\'' +
                    ", MotherName='" + motherName + '\'' +
                    ", Weapon='" + weapon + '\'' +
                    ", AvatarOfVishnu=" + (isAvatarOfVishnu ? "Yes" : "No") +
                    '}';
        }
    }
