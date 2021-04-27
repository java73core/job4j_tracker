package ru.job4j.poly;

public class VehicleUsage {
    public static void main(String[] args) {
        Vehicle airPlane = new AirPlane();
        Vehicle train = new Train();
        Vehicle autoBus = new AutoBus();
        Vehicle[] array = new Vehicle[]{airPlane, train, autoBus};
        for (Vehicle a: array) {
            a.move();
        }
    }
}
