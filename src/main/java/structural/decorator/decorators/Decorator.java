package structural.decorator.decorators;

import structural.decorator.obgects.Component;

public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    public abstract void afterDraw();

    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
