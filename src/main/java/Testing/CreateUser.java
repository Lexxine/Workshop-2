package Testing;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class CreateUser {
    public static void main(String[] args) {
        User user1 = new User();
        user1.setUserName("Jan");
        user1.setEmail("jan22@gmail.com");
        user1.setPassword("testpasswordtset");

        UserDao userDao = new UserDao();
        User CreatedUser = userDao.create(user1);


    }
}
