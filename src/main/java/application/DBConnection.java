package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    public static final DBConnection DBCONNECTION = new DBConnection();
    public static Connection con;

    static {
        try {
            con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/cardb", "postgres", "tiger");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private DBConnection() {
    }

    public static DBConnection createDBconnection() {
        return DBCONNECTION;
    }
}
