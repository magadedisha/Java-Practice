import java.sql.*;

public class JDBC_Update {
    public static void main(String[] args) {
        try {
            // 1. Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Establish connection
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");

            // 3. Use PreparedStatement (Required for the "?" placeholder)
            // Fix: con.prepareStatement() instead of con.Statement()
            String sql = "DELETE FROM student WHERE Rno = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);

            // 4. Bind the value to the "?"
            pstmt.setInt(1, 4); // This targets Rno = 4

            // 5. Execute the update
            // Fix: No SQL string inside executeUpdate() for PreparedStatements
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Data has been deleted/updated!");
            } else {
                System.out.println("Cannot find given record.");
            }

            // 6. Close resources
            pstmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Exception occured : " + e);
        }
    }
}
