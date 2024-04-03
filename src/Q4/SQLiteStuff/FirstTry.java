package Q4.SQLiteStuff;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class FirstTry {
    public static void main(String[] args) {
        Connection conn = null;
        try {
            String url = "jdbc:sqlite:ap2/SQLite/sqlite-amalgamation-3450200 (1).zip";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to SQLite has been established");
        }
        catch (SQLException e) {
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
