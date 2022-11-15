import java.sql.*;
public class Test{
    public static void main(String[] args) {
        try {
            Connection cnx = null;
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "LeamonDev2022");
            if(cnx!=null) System.out.println("workiing");
            else System.out.println("not working");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    }
