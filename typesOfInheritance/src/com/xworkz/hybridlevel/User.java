package com.xworkz.hybridlevel;
class User {
    void login() {
        System.out.println("User logged in.");
    }
}

class Admin extends User {
    void accessPanel() {
        System.out.println("Accessing admin panel.");
    }
}

interface PermissionHandler {
    void grantAccess();
}

class SuperAdmin extends Admin implements PermissionHandler {
    public void grantAccess() {
        System.out.println("SuperAdmin grants access.");
    }
}

