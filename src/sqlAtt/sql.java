package sqlAtt;

import java.sql.*;

public class sql {
    public static void main(String[] args) {
        String id = "id1";
        String pwd = "pwd1";
        String fullname = "why is why";
        String email = "jonahsookraj@gmail.com";


        try {
            java.sql.Connection con = DriverManager.getConnection("https://organic-invention-q7qx59gqp6wgh99vv.github.dev/", "login1", "pwd1");
            Statement stmt = con.createStatement();
            String q1 = "insert into userid values('" +id+ "', '" + pwd+ "', '" +fullname+ "', '" +email+ "')";
            int x = stmt.executeUpdate(q1);
            if (x > 0) {
                System.out.println("Successfully Inserted");
            } else {
                System.out.println("Insertion Failed");
            }
            con.close();
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
