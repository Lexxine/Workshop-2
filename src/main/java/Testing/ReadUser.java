package Testing;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class ReadUser {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user = userDao.read(9);
        if (user != null) {
            System.out.println("Imię: " + user.getUserName());
            System.out.println("email: " + user.getEmail());
            System.out.println("hasło: " + user.getPassword());
        } else {
            System.out.println("Użytkownik o podanym ID nie istnieje.");
       }

    }
}
