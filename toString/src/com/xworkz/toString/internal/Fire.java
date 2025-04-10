package com.xworkz.toString.internal;

    public class Fire {
        private String type;
        private int temperature;
        private boolean isControlled;

        public Fire(String type, int temperature, boolean isControlled) {
            this.type = type;
            this.temperature = temperature;
            this.isControlled = isControlled;
        }

        @Override
        public String toString() {
            return "Fire{" +
                    "Type='" + type + '\'' +
                    ", Temperature=" + temperature + "°C" +
                    ", Controlled=" + (isControlled ? "Yes" : "No") +
                    '}';
        }

        @Override
        public int hashCode() {
            System.out.println("Default hashcode: " + super.hashCode());
            return 48048;
        }
    }


