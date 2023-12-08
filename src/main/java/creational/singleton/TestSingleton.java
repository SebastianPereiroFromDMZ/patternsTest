package creational.singleton;

public class TestSingleton {

    private static TestSingleton instance;

    //приватный конструктор что бы создать обьект одиночки через специальный метод и переменную
    private TestSingleton() {
    }

    public static TestSingleton getInstance() {
        if (instance == null) {
            instance = new TestSingleton();
        }
        return instance;
    }

    public void print(){
        System.out.println(this);
    }
}
