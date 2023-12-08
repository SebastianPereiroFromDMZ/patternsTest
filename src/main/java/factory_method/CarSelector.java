package factory_method;

//этот класс является фабрикой по созданию автомобилей
public class CarSelector {

    private static CarSelector instance;

    private CarSelector(){

    }

    public static synchronized CarSelector getInstance(){
        if (instance == null){
            instance = new CarSelector();
        }
        return instance;
    }

    //фабричный метод который создает нужный автомобиль
    public Car getCar(RoadType roadType) {
        Car car = null;
        switch (roadType) {
            case CITY:
                car = new Porsche();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case GAZON:
                car = new NewJeep();
                break;
        }
        return car;
    }
}
