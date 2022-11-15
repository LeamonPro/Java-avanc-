public class Produit{
    private int id;
    private String Libelle;
    private double prix;
    public Produit(String libelle, double prix) {
        Libelle = libelle;
        this.prix = prix;
    }
    public Produit(int id, String libelle, double prix) {
        this.id = id;
        Libelle = libelle;
        this.prix = prix;
    }
    public Produit() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getLibelle() {
        return Libelle;
    }
    public void setLibelle(String libelle) {
        Libelle = libelle;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    
}