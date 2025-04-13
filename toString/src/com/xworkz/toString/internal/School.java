package com.xworkz.toString.internal;

public class School {
    private String name;
    private int numberOfStudents;
    private String location;

    public School(String name, int numberOfStudents, String location) {
        this.name = name;
        this.numberOfStudents = numberOfStudents;
        this.location = location;
    }

    @Override
    public String toString() {
        return "School{" +
                "Name='" + name + '\'' +
                ", Number of Students=" + numberOfStudents +
                ", Location='" + location + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof School) {
                School otherSchool = (School) obj;
                return this.name.equals(otherSchool.name) &&
                        this.numberOfStudents == otherSchool.numberOfStudents &&
                        this.location.equals(otherSchool.location);
            }
        }
        return false;
    }
}
