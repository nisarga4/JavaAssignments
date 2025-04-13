package com.xworkz.toString.internal;

public class Danger {
    private String dangerType;
    private int level;  // scale of danger (1 to 10)
    private String cause;

    public Danger(String dangerType, int level, String cause) {
        this.dangerType = dangerType;
        this.level = level;
        this.cause = cause;
    }

    @Override
    public String toString() {
        return "Danger{Type='" + dangerType + "', Level=" + level + ", Cause='" + cause + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 99;  // Returning a fixed hash code for simplicity
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Danger) {
                System.out.println("Ref is Danger, will compare...");
                Danger danger1 = this;
                Danger danger2 = (Danger) obj;
                if (danger1.dangerType.equals(danger2.dangerType) && danger1.level == danger2.level && danger1.cause.equals(danger2.cause)) {
                    System.out.println("Both dangers are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
