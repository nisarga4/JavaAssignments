package com.xworkz.hierarchiallevel;
class Employee {
    void attendMeeting() {
        System.out.println("Employee attends meeting.");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager manages the team.");
    }
}

class Developer extends Employee {
    void writeCode() {
        System.out.println("Developer writes code.");
    }
}

class Designer extends Employee {
    void designUI() {
        System.out.println("Designer creates UI.");
    }
}
