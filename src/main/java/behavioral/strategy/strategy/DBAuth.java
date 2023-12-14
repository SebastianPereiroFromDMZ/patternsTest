package behavioral.strategy.strategy;

public class DBAuth implements AuthStrategy{

    private Object dbRef; //ссылка на базу данных
    private String dbURL;

    public DBAuth(String dbURL) {
        this.dbURL = dbURL;
    }

    private void createConnection(String dbURL){
        // dbRef ...
    }

    @Override
    public boolean checkLogin(String name, String password) {

        System.out.println("Checking with db...");

        String userHash = getHash(name);
        String passHash = getHash(password);

        return false;
    }

    private boolean checkUser(String name, String password){
        //проверка в дб через  dbRef
        return true;
    }

    private String getHash(String value){
        //хэширование
        return "223KKD33";
    }
}
