import java.sql.*;
import java.util.List;
import java.util.ArrayList;
public class Traitement {
    private Connection conn=Connect.getConnection();
    private final String SELECT_ALL = "select * from produit";
    private final String SELECT_BY_ID = "select * from produit where id like ?";
    private final String FILTER_BY_NAME = "select * from catalogue.produit where libelle = ?";
    private final String INSERT_PRODUCT = "insert into produit values(?,?,?)";
    private final String UPDATE_PRODUCT = "update produit set libelle = ?, prix=? where id = ?";
    private final String DELETE_PRODUCT = "delete from produit where id = ?";
    public void save(Produit p) {
        try {
            PreparedStatement pd = conn.prepareStatement(INSERT_PRODUCT);
            pd.setInt(1, p.getId());
            pd.setString(2, p.getLibelle());
            pd.setDouble(3, p.getPrix());
            pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Produit> produitsParMC(String mc) {
        List<Produit> listProduit = new ArrayList<>();
        try {
            PreparedStatement pd = conn.prepareStatement(FILTER_BY_NAME);
            pd.setString(1, "%"+mc+"%");
            System.out.println(pd.toString());
            ResultSet rs = pd.executeQuery();
            while (rs.next()) {
                Produit p = new Produit(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                listProduit.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduit;
    }
    public Produit getProduit(int id) {
        Produit p = null;
        try {
            PreparedStatement pd = conn.prepareStatement(SELECT_BY_ID);
            pd.setInt(1, id);
            ResultSet rs = pd.executeQuery();
            while(rs.next()){
                p = new Produit(rs.getInt(1), rs.getString(2), rs.getDouble(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return p;
    }
    public void updateProduit(Produit p){
        try {
            PreparedStatement pd = conn.prepareStatement(UPDATE_PRODUCT);
            pd.setString(1, p.getLibelle());
            pd.setDouble(2, p.getPrix());
            pd.setInt(3, p.getId());
            pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteProduit(int id){
        try {
            PreparedStatement pd = conn.prepareStatement(DELETE_PRODUCT);
            pd.setInt(1, id);
            pd.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Produit> getAllProduits() {
        List<Produit> listProduit = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(SELECT_ALL);
            while (rs.next()) {
                Produit p = new Produit(rs.getInt(1), rs.getString(2), rs.getDouble(3));
                listProduit.add(p);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listProduit;
    } 
}

