import java.sql.*;

public class JDBC_Read
{
    public static void main(String[] args)
    {
        try
        {
            // Load the MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the PPA54 database on localhost
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PPA54", "root", "");

            // Create statement and execute query
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            // Iterate through the result set and print student details
            while (rs.next())
            {
                System.out.println("Roll No: " + rs.getInt("rno"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("City    : " + rs.getString("city"));
                System.out.println("Marks   : " + rs.getInt("marks"));
                System.out.println("----------------------------");
            }

            // Close all resources
            rs.close();
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}


