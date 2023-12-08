package creational.abstract_factory.start;

import creational.abstract_factory.factory.impl.RussianFactory;
import creational.abstract_factory.factory.impl.USAFactory;
import creational.abstract_factory.factory.interfaces.TransportFactory;
import creational.abstract_factory.transport.interfaces.Aircraft;

public class Start {
    public static void main(String[] args) {
        TransportFactory russianFactory = new RussianFactory();
        TransportFactory usaFactory = new USAFactory();
        Aircraft tu134 = russianFactory.createAircraft();
        tu134.flight();

        Aircraft boeing747 = usaFactory.createAircraft();
        boeing747.flight();
    }
}
