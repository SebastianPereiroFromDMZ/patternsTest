package creational.factory_method;

import creational.factory_method.Car;

public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Drive on Porsche");
    }

    @Override
    public void stop() {
        System.out.println("Stopped on Porsche");
    }
}
