package com.xworkz.hybridlevel;

class Person {
    void speak() {
        System.out.println("Person speaking.");
    }
}

class Teacher extends Person {
    void teach() {
        System.out.println("Teaching students.");
    }
}

interface OnlineInstructor {
    void hostWebinar();
}

class VirtualTeacher extends Teacher implements OnlineInstructor {
    public void hostWebinar() {
        System.out.println("Hosting webinar online.");
    }
}
