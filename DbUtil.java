public class DbUtil {
    public class DbUtil {
        private static final String DB_URL = "jdbc:mysql://localhost:3306/workshop2?useSSL=false&characterEncoding=utf8";
        private static final String DB_USER = "root";
        private static final String DB_PASS = "Ola_4112!";

        public static Connection getConnection() throws SQLException {
            return DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
        }
    }


}
