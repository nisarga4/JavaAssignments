package com.xworkz.toString.internal;

public class Tree {
    private String species;
    private double height;
    private int age;

    public Tree(String species, double height, int age) {
        this.species = species;
        this.height = height;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Tree{Species='" + species + "', Height=" + height + " meters, Age=" + age + " years}";
    }

    @Override
    public int hashCode() {
        System.out.println("Default hash code: " + super.hashCode());
        return 150;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            if (obj instanceof Tree) {
                Tree tree1 = this;
                Tree tree2 = (Tree) obj;
                if (tree1.species.equals(tree2.species) && tree1.height == tree2.height && tree1.age == tree2.age) {
                    return true;
                }
            }
        }
        return false;
    }
}
