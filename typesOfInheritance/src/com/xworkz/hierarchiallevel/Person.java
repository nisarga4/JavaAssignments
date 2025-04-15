package com.xworkz.hierarchiallevel;
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

class Teacher extends Person {
    void teach() {
        System.out.println("Teacher is teaching.");
    }
}

class Principal extends Person {
    void lead() {
        System.out.println("Principal is leading school.");
    }
}
