import java.sql.*;

public class JDBC_Create
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

            String sql = "INSERT INTO student (Rno,Name,City,Marks) VALUES (?, ?, ?, ?)";

            // Prepared statemnet for insert query
            PreparedStatement pstmt = con.prepareStatement(sql);

            pstmt.setInt(1, 8);
            pstmt.setString(2, "Disha");
            pstmt.setString(3, "Goa");
            pstmt.setInt(4, 78);
              
            pstmt.executeUpdate();
            System.out.println("Recrd has been inserted!!");

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