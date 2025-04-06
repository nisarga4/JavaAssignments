package com.xworkz.isRelation;

import com.xworkz.inheritance.Paper;
import com.xworkz.inheritance.Pen;

    public class PenRunner {
        public static void main(String[] args) {
            Paper paper = new Paper();
            paper.write();
            paper.openCap();
            paper.closeCap();
            paper.refillInk();
            paper.store();

            System.out.println("--------------------------------------");

            Pen pen = new Paper();
            pen.write();
            pen.openCap();
            pen.closeCap();
            pen.refillInk();
            pen.store();
        }
    }


