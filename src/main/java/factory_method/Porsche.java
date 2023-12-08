package factory_method;

public class Porsche implements Car{

    @Override
    public void drive() {
        System.out.println("Drive on Porsche");
    }

    @Override
    public void stop() {
        System.out.println("Stopped on Porsche");
    }
}
