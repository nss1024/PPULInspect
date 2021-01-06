
package ppul;
import java.sql.*;

public class dbConnect {
    
    private Connection conn;
     dbConnect(){
     conn = connect();
     }
    
    private Connection connect() {
        // SQLite connection string
        String url = "jdbc:sqlite:../Pesticide.db";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connected to database.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    public Connection getConnection(){
    return conn;
    }
}
