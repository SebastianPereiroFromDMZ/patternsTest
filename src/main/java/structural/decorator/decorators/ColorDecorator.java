package structural.decorator.decorators;

import structural.decorator.obgects.Component;

public class ColorDecorator extends Decorator{

    public ColorDecorator(Component component) {
        super(component);
    }

    @Override
    public void afterDraw() {
        System.out.println("...added color");
    }
}
