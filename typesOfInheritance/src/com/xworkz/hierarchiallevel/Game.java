package com.xworkz.hierarchiallevel;
class Game {
    void startGame() {
        System.out.println("Game has started.");
    }
}

class Cricket extends Game {
    void bat() {
        System.out.println("Cricket: Batting.");
    }
}

class Football extends Game {
    void kick() {
        System.out.println("Football: Kicking.");
    }
}

class Tennis extends Game {
    void serve() {
        System.out.println("Tennis: Serving.");
    }
}
