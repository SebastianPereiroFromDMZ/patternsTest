package structural.decorator.decorators;

import structural.decorator.obgects.Component;

public class BorderDecorator extends Decorator{

    @Override
    public void afterDraw() {
        System.out.println("...added border");
    }

    public BorderDecorator(Component component) {
        super(component);

    }
}
