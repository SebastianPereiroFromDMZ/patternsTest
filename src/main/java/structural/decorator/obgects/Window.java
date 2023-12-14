package structural.decorator.obgects;

public class Window implements Component {
    @Override
    public void draw() {
        System.out.println("draw window");
    }
}
