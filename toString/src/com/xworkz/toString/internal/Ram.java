package com.xworkz.toString.internal;

public class Ram {
    private String model;
    private int capacity;
    private String type;

    public Ram(String model, int capacity, String type) {
        this.model = model;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "Model='" + model + '\'' +
                ", Capacity=" + capacity + "GB" +
                ", Type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Ram) {
                Ram otherRam = (Ram) obj;
                return this.model.equals(otherRam.model) &&
                        this.capacity == otherRam.capacity &&
                        this.type.equals(otherRam.type);
            }
        }
        return false;
    }
}
