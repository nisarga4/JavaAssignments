package com.xworkz.isRelation;

import com.xworkz.inheritance.Leaf;
import com.xworkz.inheritance.Tree;

    public class TreeRunner {
        public static void main(String[] args) {
            Leaf leaf = new Leaf();
            leaf.grow();
            leaf.photosynthesize();
            leaf.shedLeaves();
            leaf.provideShade();
            leaf.absorbWater();

            System.out.println("--------------------------------------");

            Tree tree = new Leaf(); // Polymorphic reference
            tree.grow();
            tree.photosynthesize();
            tree.shedLeaves();
            tree.provideShade();
            tree.absorbWater();
        }
    }

