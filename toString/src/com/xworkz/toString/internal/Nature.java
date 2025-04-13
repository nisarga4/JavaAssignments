package com.xworkz.toString.internal;

public class Nature {
    private String element;
    private String environment;
    private String season;

    public Nature(String element, String environment, String season) {
        this.element = element;
        this.environment = environment;
        this.season = season;
    }

    @Override
    public String toString() {
        return "Nature{" +
                "Element='" + element + '\'' +
                ", Environment='" + environment + '\'' +
                ", Season='" + season + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return element.hashCode() + environment.hashCode() + season.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Nature) {
                Nature otherNature = (Nature) obj;
                return this.element.equals(otherNature.element) &&
                        this.environment.equals(otherNature.environment) &&
                        this.season.equals(otherNature.season);
            }
        }
        return false;
    }
}
