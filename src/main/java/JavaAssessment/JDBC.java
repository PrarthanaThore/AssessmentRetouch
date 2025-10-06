package JavaAssessment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBC {

    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/school";
        String user = "root";
        String password = "root";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            // 1. Load JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");

            // 3. Create statement
            stmt = conn.createStatement();

            // 4. Execute query
            String sql = "SELECT * FROM students";
            rs = stmt.executeQuery(sql);

            // 5. Process result set
            System.out.println("ID  Name    Age");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + "  " + name + "  " + age);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 6. Close resources safely
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (stmt != null) stmt.close(); } catch (Exception e) {}
            try { if (conn != null) conn.close(); } catch (Exception e) {}
        }
    }
}
