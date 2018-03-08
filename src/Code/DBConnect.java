package Code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public Connection getConnection() throws ClassNotFoundException, SQLException {
        // TODO Auto-generated method stub
        Class.forName("com.mysql.jdbc.Driver");

        return DriverManager.getConnection("jdbc:mysql://localhost:3306/travelexperts", "Sam", "password");
    }
}
