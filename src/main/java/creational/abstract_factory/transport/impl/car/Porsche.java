package creational.abstract_factory.transport.impl.car;

import creational.abstract_factory.transport.interfaces.Car;

public class Porsche implements Car {

    @Override
    public void drive() {
        System.out.println("Porsche drive");
    }

    @Override
    public void stop() {
        System.out.println("Porsche stopped");
    }
}
