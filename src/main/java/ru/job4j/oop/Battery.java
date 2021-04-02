package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int power) {
        this.load = power;
    }

    public void exchange(Battery another) {
       another.load = this.load + another.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(80);
        Battery secondBattery = new Battery(20);
        System.out.println("first : " + firstBattery.load + ". second : " + secondBattery.load);
        firstBattery.exchange(secondBattery);
        System.out.println("first : " + firstBattery.load + ". second : " + secondBattery.load);
    }
}
