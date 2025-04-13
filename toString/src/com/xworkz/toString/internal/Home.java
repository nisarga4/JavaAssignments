package com.xworkz.toString.internal;

public class Home {
    private String address;
    private int numberOfRooms;
    private boolean hasGarden;

    public Home(String address, int numberOfRooms, boolean hasGarden) {
        this.address = address;
        this.numberOfRooms = numberOfRooms;
        this.hasGarden = hasGarden;
    }

    @Override
    public String toString() {
        return "Home{Address='" + address + "', Number of Rooms=" + numberOfRooms + ", Has Garden=" + hasGarden + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 300;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Home) {
                Home home1 = this;
                Home home2 = (Home) obj;
                if (home1.address.equals(home2.address) && home1.numberOfRooms == home2.numberOfRooms && home1.hasGarden == home2.hasGarden) {
                    return true;
                }
            }
        }
        return false;
    }
}
