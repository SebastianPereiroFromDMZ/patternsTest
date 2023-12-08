package creational.abstract_factory.factory.impl;

import creational.abstract_factory.factory.interfaces.TransportFactory;
import creational.abstract_factory.transport.impl.aircraft.TU134;
import creational.abstract_factory.transport.impl.car.Niva;
import creational.abstract_factory.transport.interfaces.Aircraft;
import creational.abstract_factory.transport.interfaces.Car;

public class RussianFactory implements TransportFactory {

    @Override
    public Car createCar() {
        return new Niva();
    }

    @Override
    public Aircraft createAircraft() {
        return new TU134();
    }
}
