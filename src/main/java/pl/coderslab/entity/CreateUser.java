package pl.coderslab.entity;

public class CreateUser {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.setUserName("Jan");
//        user1.setEmail("jankowalski@gmail.com");
//        user1.setPassword("testpassword");

        UserDao userDao = new UserDao();
//        User firstCreatedUser = userDao.create(user1);

        User user3 = new User();
        user3.setUserName("Maksymilian");
        user3.setEmail("maxIksinski@gmail.com");
        user3.setPassword("testpassword3");

        User createdUser = userDao.create(user3);

    }
}
