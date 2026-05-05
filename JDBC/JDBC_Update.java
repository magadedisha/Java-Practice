import java.sql.*;

public class JDBC_Update
{
    public static void main(String[] args)
    {
        try
        {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/PPA54";

            // Establish connection to the PPA54 database on localhost
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");

            String sql = "UPDATE student SET Rno = ?,Marks = ? WHERE Name = ?";

            // Prepared statemnet for insert query
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 9);
            pstmt.setInt(2, 98);
            pstmt.setString(3, "Disha");

            
            int rowsAffected = pstmt.executeUpdate();

            if (rowsAffected > 0)
            {
                System.out.println("Data has been updated!");
            } 
            else
            {
                System.out.println("Cannot find given record.");
            }

            // Close all resources
            pstmt.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}