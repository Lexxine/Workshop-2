package Testing;

import pl.coderslab.entity.UserDao;

public class DeleteUser {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        userDao.delete(1);

    }
}
