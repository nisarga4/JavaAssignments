package com.xworkz.isRelation;
import com.xworkz.inheritance.Mind;
import com.xworkz.inheritance.Thought;

    public class MindRunner {
        public static void main(String[] args) {
            Thought thought = new Thought();
            thought.think();
            thought.imagine();
            thought.remember();
            thought.focus();
            thought.relax();

            System.out.println("--------------------------------------");

            Mind mind = new Thought();
            mind.think();
            mind.imagine();
            mind.remember();
            mind.focus();
            mind.relax();
        }
    }
