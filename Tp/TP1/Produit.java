class Produit {
    private String Libelle;
    private String designation;
    private int NumProd;
    private Float PrixProd;
    public Produit(String Libelle,String designation,int NumProd,float PrixProd){
        this.Libelle=Libelle;
        this.designation=designation;
        this.NumProd=NumProd;
        this.PrixProd=PrixProd;
    }
    public String getLibelle() {
        return Libelle;
    }
    public void setLibelle(String libelle) {
        Libelle = libelle;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public int getNumProd() {
        return NumProd;
    }
    public void setNumProd(int numProd) {
        NumProd = numProd;
    }
    public Float getPrixProd() {
        return PrixProd;
    }
    public void setPrixProd(Float prixProd) {
        PrixProd = prixProd;
    }
    public String toString(){
        return "Libelle :"+Libelle+"\tDesignation :"+designation+"\tNumero produit :"+NumProd+"\tPrix produit :"+PrixProd;
    }


}