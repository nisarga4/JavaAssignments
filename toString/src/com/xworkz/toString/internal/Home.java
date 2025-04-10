package com.xworkz.toString.internal;

public class Home {
    private String location;
    private int rooms;
    private boolean hasGarden;

    public Home(String location, int rooms, boolean hasGarden) {
        this.location = location;
        this.rooms = rooms;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "Home{" +
                "Location='" + location + '\'' +
                ", Rooms=" + rooms +
                ", HasGarden=" + (hasGarden ? "Yes" : "No") +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashcode: " + super.hashCode());
        return 12012;
    }
}
