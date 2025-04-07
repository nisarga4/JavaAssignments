package com.xworkz.Casting;
public class Chair extends Furniture {
    @Override
    public void design() {
        System.out.println("Designing a chair...");
    }
    @Override
    public void build() {
        System.out.println("Building a chair...");
    }
    @Override
    public void paint() {
        System.out.println("Painting the chair...");
    }
    @Override
    public void polish() {
        System.out.println("Polishing the chair...");
    }
    @Override
    public void move() {
        System.out.println("Moving the chair...");
    }

    public void fold() {
        System.out.println("Chair is foldable.");
    }
}

