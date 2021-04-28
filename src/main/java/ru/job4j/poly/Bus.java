package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void move() {
        System.out.println("Едем!");
    }

    @Override
    public void Passengers(int count) {
        System.out.println("Число пассажиров " + count);
    }

    @Override
    public int Fuel(int fuel) {
        return fuel * 100;
    }
}
