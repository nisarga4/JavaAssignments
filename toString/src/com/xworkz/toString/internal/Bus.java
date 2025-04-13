package com.xworkz.toString.internal;

public class Bus {
    private String route;
    private int capacity;
    private String type;

    public Bus(String route, int capacity, String type) {
        this.route = route;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bus{Route='" + route + "', Capacity=" + capacity + " passengers, Type='" + type + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 123;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Bus) {
                System.out.println("Ref is Bus, will compare...");
                Bus bus1 = this;
                Bus bus2 = (Bus) obj;
                if (bus1.route.equals(bus2.route) && bus1.capacity == bus2.capacity && bus1.type.equals(bus2.type)) {
                    System.out.println("Both Buses are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
