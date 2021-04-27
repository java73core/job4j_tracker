package ru.job4j.poly;

public class Bus implements Transport{
    @Override
    public void move() {

    }

    @Override
    public void Passengers(int count) {
    count++;
    }

    @Override
    public int Fuel(int fuel) {
        int price = fuel * 100;
        return price;
    }
}
