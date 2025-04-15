package com.xworkz.multilevel;
    public class MainMultiLevel {
        public static void main(String[] args) {

            CollegeStudent student = new CollegeStudent();
            student.speak();
            student.study();
            student.attendLecture();
            System.out.println("--------");

            SmartPhone phone = new SmartPhone();
            phone.powerOn();
            phone.call();
            phone.browseInternet();
            System.out.println("--------");

            Dog dog = new Dog();
            dog.grow();
            dog.move();
            dog.bark();
            System.out.println("--------");

            Triangle triangle = new Triangle();
            triangle.draw();
            triangle.sides();
            triangle.triangleType();
            System.out.println("--------");

            Microwave microwave = new Microwave();
            microwave.plugIn();
            microwave.use();
            microwave.heatFood();
            System.out.println("--------");

            Violin violin = new Violin();
            violin.play();
            violin.tuneStrings();
            violin.bow();
            System.out.println("--------");

            Car car = new Car();
            car.move();
            car.wheels();
            car.drive();
            System.out.println("--------");

            Mango mango = new Mango();
            mango.eat();
            mango.vitamins();
            mango.taste();
            System.out.println("--------");

            Television tv = new Television();
            tv.power();
            tv.output();
            tv.showChannels();
            System.out.println("--------");

            Java java = new Java();
            java.communicate();
            java.writeCode();
            java.compile();
            System.out.println("--------");

            MangoTree mangoTree = new MangoTree();
            mangoTree.grow();
            mangoTree.provideShade();
            mangoTree.bearFruit();
        }
    }

