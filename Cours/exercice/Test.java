import java.sql.*;

public class Test {
    public static void insererProduit (Connection conn,String req){
        try{
        Statement stat=conn.createStatement();
        stat.executeUpdate(req);

    }
    catch(Exception e){
        System.out.println( e.getMessage());
    }
}
public static void rechProduit(Connection conn,String req){
    try{
        PreparedStatement stat=conn.prepareStatement(req);
        stat.executeQuery();
    }
    catch(Exception e){
        System.out.println(e.getMessage());
    }
}

    public static void main(String[] args) {
        ConnexionBD conn=new ConnexionBD();
        Connection stat=conn.getConn();
        /* Produit p1=new Produit("x1", "Smile", "Biscuit", 1200f); */
        String req="INSERT INTO produit" + "VALUES ('p1','Smile','Biscuit',1200)";
        insererProduit(stat,req);

        }
}
