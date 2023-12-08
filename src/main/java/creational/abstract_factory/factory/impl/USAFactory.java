package creational.abstract_factory.factory.impl;

import creational.abstract_factory.factory.interfaces.TransportFactory;
import creational.abstract_factory.transport.impl.aircraft.Boeing747;
import creational.abstract_factory.transport.impl.car.Porsche;
import creational.abstract_factory.transport.interfaces.Aircraft;
import creational.abstract_factory.transport.interfaces.Car;

public class USAFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Porsche();
    }

    @Override
    public Aircraft createAircraft() {
        return new Boeing747();
    }
}
