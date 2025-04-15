package com.xworkz.singlelevel;
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
}

class Manager extends Employee {
    void manageTeam() {
        System.out.println("Manager is managing the team.");
    }
}
