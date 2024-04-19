package Testing;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

public class ChangeUser {
    public static void main(String[] args) {
        User user = new User();
        user.setId(7);
        user.setUserName("Maksymilian");
        user.setEmail("Max1117@gmail.com");
        user.setPassword("testpasswordtest2");
        UserDao userDao = new UserDao();
        userDao.update(user);
    }
}
