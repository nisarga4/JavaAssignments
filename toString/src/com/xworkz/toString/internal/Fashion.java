package com.xworkz.toString.internal;

    public class Fashion {
        private String style;
        private String season;
        private boolean isTrending;
        private String genderTargeted;

        public Fashion(String style, String season, boolean isTrending, String genderTargeted) {
            this.style = style;
            this.season = season;
            this.isTrending = isTrending;
            this.genderTargeted = genderTargeted;
        }

        @Override
        public String toString() {
            return "Fashion{" +
                    "Style='" + style + '\'' +
                    ", Season='" + season + '\'' +
                    ", Trending=" + (isTrending ? "Yes" : "No") +
                    ", GenderTargeted='" + genderTargeted + '\'' +
                    '}';
        }
    }
