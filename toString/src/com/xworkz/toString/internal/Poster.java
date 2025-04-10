package com.xworkz.toString.internal;

public class Poster {
    private String theme;
    private String size;
    private boolean laminated;

    public Poster(String theme, String size, boolean laminated) {
        this.theme = theme;
        this.size = size;
        this.laminated = laminated;
    }

    @Override
    public String toString() {
        return "Poster{" +
                "Theme='" + theme + '\'' +
                ", Size='" + size + '\'' +
                ", Laminated=" + (laminated ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 30030;
    }
}
