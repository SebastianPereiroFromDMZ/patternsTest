package structural.facade.objects;

import structural.facade.facade.CarFacade;
import structural.facade.parts.Door;
import structural.facade.parts.Ignition;
import structural.facade.parts.Wheel;

public class Client {

    public static void main(String[] args) {
        //вызов без фасада
        Door door = new Door();
        door.open();

        Ignition ignition = new Ignition();
        ignition.fire();

        Wheel wheel = new Wheel();
        wheel.turn();

        System.out.println("**********");

        //вызов с фасадом
        CarFacade carFacade = new CarFacade();
        carFacade.go();
    }
}
