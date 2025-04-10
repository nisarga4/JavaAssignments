package com.xworkz.toString.internal;

public class Fashion {
    private String style;
    private String season;
    private boolean isTrending;

    public Fashion(String style, String season, boolean isTrending) {
        this.style = style;
        this.season = season;
        this.isTrending = isTrending;
    }

    @Override
    public String toString() {
        return "Fashion{" +
                "Style='" + style + '\'' +
                ", Season='" + season + '\'' +
                ", Trending=" + (isTrending ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 6060;
    }
}
