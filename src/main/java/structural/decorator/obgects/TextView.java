package structural.decorator.obgects;

public class TextView implements Component {

    @Override
    public void draw() {
        System.out.println("draw textview");
    }
}
