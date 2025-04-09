package com.xworkz.toString.internal;
    public class Nature {
        private String element;
        private String color;
        private boolean isSoothing;
        private String foundIn;

        public Nature(String element, String color, boolean isSoothing, String foundIn) {
            this.element = element;
            this.color = color;
            this.isSoothing = isSoothing;
            this.foundIn = foundIn;
        }

        @Override
        public String toString() {
            return "Nature{" +
                    "Element='" + element + '\'' +
                    ", Color='" + color + '\'' +
                    ", Soothing=" + (isSoothing ? "Yes" : "No") +
                    ", FoundIn='" + foundIn + '\'' +
                    '}';
        }
}
