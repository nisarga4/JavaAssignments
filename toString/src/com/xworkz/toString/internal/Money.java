package com.xworkz.toString.internal;

    public class Money {
        private String currency;
        private double amount;
        private String country;
        private boolean isDigital;

        public Money(String currency, double amount, String country, boolean isDigital) {
            this.currency = currency;
            this.amount = amount;
            this.country = country;
            this.isDigital = isDigital;
        }

        @Override
        public String toString() {
            return "Money{" +
                    "Currency='" + currency + '\'' +
                    ", Amount=" + amount +
                    ", Country='" + country + '\'' +
                    ", Digital=" + (isDigital ? "Yes" : "No") +
                    '}';
        }
    }
