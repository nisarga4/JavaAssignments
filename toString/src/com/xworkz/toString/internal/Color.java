package com.xworkz.toString.internal;
    public class Color {
        private String name;
        private String hexCode;
        private boolean isPrimary;
        private String type; // e.g., Warm, Cool, Neutral

        public Color(String name, String hexCode, boolean isPrimary, String type) {
            this.name = name;
            this.hexCode = hexCode;
            this.isPrimary = isPrimary;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Color{" +
                    "Name='" + name + '\'' +
                    ", HexCode='" + hexCode + '\'' +
                    ", Primary=" + (isPrimary ? "Yes" : "No") +
                    ", Type='" + type + '\'' +
                    '}';
        }
    }
