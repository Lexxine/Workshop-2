package Testing;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class ShowAllUsers {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
       User[] users = userDao.findAll();
            for (User user : users) {
                System.out.println(user.toString());
           }
    }
}
