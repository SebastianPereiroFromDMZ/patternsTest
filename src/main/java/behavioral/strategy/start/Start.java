package behavioral.strategy.start;

import behavioral.strategy.auth.UserChecker;
import behavioral.strategy.strategy.DBAuth;
import behavioral.strategy.strategy.FileAuth;

import java.io.File;

public class Start {

    public static void main(String[] args) {

        UserChecker userChecker = new UserChecker();

        userChecker.check(new DBAuth("jdbc//etc"));

        userChecker.check(new FileAuth(new File("c://file.txt")));
    }
}
