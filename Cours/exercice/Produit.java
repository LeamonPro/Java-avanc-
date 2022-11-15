public class Produit {
    private String reference;
    private String nom;
    private String desc;
    private Float prix;
    public Produit(String reference,String nom,String desc,Float prix){
        this.reference=reference;
        this.nom=nom;
        this.desc=desc;
        this.prix=prix;

    }
    public String getReference() {
        return reference;
    }
    public void setReference(String reference) {
        this.reference = reference;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Float getPrix() {
        return prix;
    }
    public void setPrix(Float prix) {
        this.prix = prix;
    }
    
}
