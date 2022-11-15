import java.sql.*;
public class ConnexionBD{
    private Connection conn=null;
    public ConnexionBD(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock", "root", "LeamonDev2022");
            if(conn!=null) System.out.println("workiing");
            else System.out.println("not working");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public Connection getConn(){
        return conn;
    }
}