package creational.singleton;

public class StartSingleton {

    public static void main(String[] args) {
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
        TestSingleton.getInstance().print();
    }

}
