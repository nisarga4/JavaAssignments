package com.xworkz.toString.internal;

public class John {
    private String occupation;
    private int age;
    private String city;

    public John(String occupation, int age, String city) {
        this.occupation = occupation;
        this.age = age;
        this.city = city;
    }

    @Override
    public String toString() {
        return "John{Occupation='" + occupation + "', Age=" + age + ", City='" + city + "'}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 321;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof John) {
                John john1 = this;
                John john2 = (John) obj;
                if (john1.occupation.equals(john2.occupation) && john1.age == john2.age && john1.city.equals(john2.city)) {
                    return true;
                }
            }
        }
        return false;
    }
}
