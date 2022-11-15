public class Delegation{
    private String nom;
    private int nbrH; 
    public Delegation(String nom,int nbrH){
        this.nom=nom;
        this.nbrH=nbrH;
    }
    public void setnbrH(int nbr){
        nbrH=nbr;
    }
    public String getNom(){
        return nom;
    }
    public int getnbrH(){
        return nbrH;
    }
    public String toString(){
        return "Nom :"+nom+"\tNombre d'habitants :"+nbrH+"\n";
    }
}
