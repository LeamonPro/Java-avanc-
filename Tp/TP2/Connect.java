import java.sql.DriverManager;
import java.sql.*;
public class Connect {
    private static Connection conn;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver Ok");
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/catalogue","root","LeamonDev2022");
            System.out.println("Connected");

        }catch(Exception e){
            e.getStackTrace();
        }}
        public static Connection getConnection(){
            return conn;
        }}

/*         try{
            String url="jdbc:mysql://localhost:3306/catalogue";
            String user="root";
            String pwd="LeamonDev2022";
            Connection conn=DriverManager.getConnection(url,user,pwd);
            String req="INSERT INTO `produit`(`id`,`Libelle`,`prix`) VALUES (1,'Smile',1200)";
            Statement stat=conn.createStatement();
            stat.executeUpdate(req);

        }
    catch(Exception e){
        System.out.println( e.getMessage());
    } */
    

