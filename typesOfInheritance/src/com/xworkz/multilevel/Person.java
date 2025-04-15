package com.xworkz.multilevel;
class Person {
    void speak() {
        System.out.println("Person is speaking.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying.");
    }
}

class CollegeStudent extends Student {
    void attendLecture() {
        System.out.println("College student is attending a lecture.");
    }
}
