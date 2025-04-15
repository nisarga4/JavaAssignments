package com.xworkz.hierarchiallevel;
public class MainHierarchicalInheritance {
    public static void main(String[] args) {

        // Example 1
        Car car = new Car();
        car.move();
        car.drive();

        Bike bike = new Bike();
        bike.move();
        bike.ride();

        Truck truck = new Truck();
        truck.move();
        truck.load();
        System.out.println("------");

        // Example 2
        Cat cat = new Cat();
        cat.eat();
        cat.meow();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Elephant elephant = new Elephant();
        elephant.eat();
        elephant.trumpet();
        System.out.println("------");

        // Example 3
        Circle circle = new Circle();
        circle.draw();
        circle.area();

        Square square = new Square();
        square.draw();
        square.area();

        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.area();
        System.out.println("------");

        // Example 4
        Manager manager = new Manager();
        manager.attendMeeting();
        manager.manageTeam();

        Developer developer = new Developer();
        developer.attendMeeting();
        developer.writeCode();

        Designer designer = new Designer();
        designer.attendMeeting();
        designer.designUI();
        System.out.println("------");

        // Example 5
        Fan fan = new Fan();
        fan.switchOn();
        fan.spin();

        Light light = new Light();
        light.switchOn();
        light.glow();

        Heater heater = new Heater();
        heater.switchOn();
        heater.heat();
        System.out.println("------");

        // Example 6
        Laptop laptop = new Laptop();
        laptop.boot();
        laptop.code();

        Tablet tablet = new Tablet();
        tablet.boot();
        tablet.draw();

        Phone phone = new Phone();
        phone.boot();
        phone.call();
        System.out.println("------");

        // Example 7
        Student student = new Student();
        student.speak();
        student.study();

        Teacher teacher = new Teacher();
        teacher.speak();
        teacher.teach();

        Principal principal = new Principal();
        principal.speak();
        principal.lead();
        System.out.println("------");

        // Example 8
        SavingAccount sa = new SavingAccount();
        sa.open();
        sa.save();

        CurrentAccount ca = new CurrentAccount();
        ca.open();
        ca.businessTransaction();

        LoanAccount la = new LoanAccount();
        la.open();
        la.loanDetails();
        System.out.println("------");

        // Example 9
        PDF pdf = new PDF();
        pdf.open();
        pdf.readPDF();

        Word word = new Word();
        word.open();
        word.editWord();

        Excel excel = new Excel();
        excel.open();
        excel.calculate();
        System.out.println("------");

        // Example 10
        Parrot parrot = new Parrot();
        parrot.fly();
        parrot.talk();

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.hunt();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.sing();
        System.out.println("------");

        // Example 11
        Cricket cricket = new Cricket();
        cricket.startGame();
        cricket.bat();

        Football football = new Football();
        football.startGame();
        football.kick();

        Tennis tennis = new Tennis();
        tennis.startGame();
        tennis.serve();
    }
}

