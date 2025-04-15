package com.xworkz.hybridlevel;

class Employee {
    void work() {
        System.out.println("Employee working.");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println("Developer is coding.");
    }
}

interface TeamPlayer {
    void collaborate();
}

class FullStackDev extends Developer implements TeamPlayer {
    public void collaborate() {
        System.out.println("FullStack developer collaborating.");
    }
}
