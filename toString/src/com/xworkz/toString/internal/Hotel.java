package com.xworkz.toString.internal;

public class Hotel {
    private String name;
    private String location;
    private int rating;

    public Hotel(String name, String location, int rating) {
        this.name = name;
        this.location = location;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Hotel{Name='" + name + "', Location='" + location + "', Rating=" + rating + " stars}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 1001;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Hotel) {
                Hotel hotel1 = this;
                Hotel hotel2 = (Hotel) obj;
                if (hotel1.name.equals(hotel2.name) && hotel1.location.equals(hotel2.location) && hotel1.rating == hotel2.rating) {
                    return true;
                }
            }
        }
        return false;
    }
}
