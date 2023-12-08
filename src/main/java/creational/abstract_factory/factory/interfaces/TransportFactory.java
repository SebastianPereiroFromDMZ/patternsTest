package creational.abstract_factory.factory.interfaces;

import creational.abstract_factory.transport.interfaces.Aircraft;
import creational.abstract_factory.transport.interfaces.Car;

//фабрика по созданию транспортных средств
public interface TransportFactory {

    //что фабрика будет создавать

    //автомобили
    Car createCar();
    //самолеты
    Aircraft createAircraft();
}
