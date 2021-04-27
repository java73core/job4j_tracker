package ru.job4j.poly;

public class AirPlane implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " Летает по воздуху. ");
    }
}
