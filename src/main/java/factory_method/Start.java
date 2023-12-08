package factory_method;

public class Start {

    public static void main(String[] args) {

        //обычные варианты создания обьектов
        Car jeep = new Jeep();
        jeep.drive();

        Car porsche = new Porsche();
        porsche.drive();

        //ниже вариант создания обьектов через фабричный метод, также класс CarSelector у нас сделан под шаблон одиночка
        //пример использования двух шаблонов для простоты кода
        //также метод getCar класс CarSelector сделан синхронизированным для многопоточной среды
        Car porsche2 = CarSelector.getInstance().getCar(RoadType.CITY);
        porsche2.drive();
        porsche2.stop();

        Car jeep2 = CarSelector.getInstance().getCar(RoadType.OFF_ROAD);
        jeep2.drive();
        jeep2.stop();

        Car newJeep = CarSelector.getInstance().getCar(RoadType.GAZON);
        newJeep.drive();
        newJeep.stop();
    }

}
