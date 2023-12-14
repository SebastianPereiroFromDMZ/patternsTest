package structural.decorator;

import structural.decorator.decorators.BorderDecorator;
import structural.decorator.decorators.ColorDecorator;
import structural.decorator.obgects.Component;
import structural.decorator.obgects.TextView;
import structural.decorator.obgects.Window;

public class Start {
    public static void main(String[] args) {
        Component window = new Window();
        window.draw();

        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();

        Component windowInBorderInColorDecorator = new ColorDecorator(new BorderDecorator(new Window()));
        windowInBorderInColorDecorator.draw();

        Component textView = new ColorDecorator(new TextView());
        textView.draw();

        //Отдельно создаюся компоненты
        //отдельно поведение (пакет декораторс)
    }
}
