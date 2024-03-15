package sqlite.connect.net.sqliteTut;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connect {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:C:Project/sookraj.j/ap2/SQLite/db/chinook.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }
}
//jdbc:sqlite:C:/sqlite/db/chinook.db