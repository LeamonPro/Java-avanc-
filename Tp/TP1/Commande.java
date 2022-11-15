import java.util.LinkedList;
public class Commande {
    private LinkedList<Produit> liste ;
    private float Prixtt=0;
    public Commande(){
        liste=new LinkedList<Produit>();
    }
    public void ajouterProduit(Produit p){
        liste.add(p);
    }
    public void retirerProduit(Produit p){
        liste.remove(p);
    }
    public int nombreProduit(){
        return liste.size();
    }
    public String toString(){
        return "Prix de commande :"+this.calculerPrix();
    }
    public float calculerPrix(){
        for(int i=0;i<liste.size();i++){
            Prixtt+=liste.get(i).getPrixProd();
        }
        return Prixtt;
    }
    public String estPresent(Produit p){
        if(liste.contains(p))
            return "Existe";
        return "n'existe pas";
    }
}
