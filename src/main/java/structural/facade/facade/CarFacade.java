package structural.facade.facade;

import structural.facade.parts.Door;
import structural.facade.parts.Ignition;
import structural.facade.parts.Wheel;

public class CarFacade {

    private Door door = new Door();
    private Ignition ignition = new Ignition();
    private Wheel wheel = new Wheel();

    public void go(){
        door.open();
        ignition.fire();
        wheel.turn();
    }
}
