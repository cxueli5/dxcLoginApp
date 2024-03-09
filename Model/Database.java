package Model;

import java.util.Arrays;
import java.util.List;

public class Database {
   private List<User> users = Arrays.asList(
        new User("jennie", "jennie273", "Jennie Kim", "manager"),
        new User("johnny", "johnny145", "Johnny Lim", "user")
    );

    public User getUserDatabase(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }
}
