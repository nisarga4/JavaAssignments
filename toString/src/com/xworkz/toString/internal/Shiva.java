package com.xworkz.toString.internal;

public class Shiva {
    private String deityName;
    private String element;
    private String mantra;

    public Shiva(String deityName, String element, String mantra) {
        this.deityName = deityName;
        this.element = element;
        this.mantra = mantra;
    }

    @Override
    public String toString() {
        return "Shiva{" +
                "deityName='" + deityName + '\'' +
                ", element='" + element + '\'' +
                ", mantra='" + mantra + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("Default hashCode: " + super.hashCode());
        return 789;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Ref is not null");
            if (obj instanceof Shiva) {
                System.out.println("Ref is Shiva, comparing...");
                Shiva shiva1 = this;
                Shiva shiva2 = (Shiva) obj;
                if (shiva1.deityName.equals(shiva2.deityName) && shiva1.element.equals(shiva2.element) && shiva1.mantra.equals(shiva2.mantra)) {
                    System.out.println("Both Shiva objects are identical");
                    return true;
                }
            }
        }
        return false;
    }
}
