package test;

import domain.Lion;

public class Main {
    public static void main(String[] args) {
        Lion simba = new Lion("Сімба", 5);

        simba.move();
        simba.eat();
        simba.sleep();
        simba.makeSound();
        simba.roar();
    }
}
