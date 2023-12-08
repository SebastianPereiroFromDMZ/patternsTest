package creational.factory_method;

import creational.factory_method.Car;

public class Jeep implements Car {

    @Override
    public void drive() {
        System.out.println("Drive on jeep");
    }

    @Override
    public void stop() {
        System.out.println("Stopped on jeep");
    }
}
