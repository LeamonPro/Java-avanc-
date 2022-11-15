import java.util.HashMap;
import java.util.Map;
public class Commandes {
    private Map<String,Commande> TreeMap;
    public Commandes(){
        TreeMap=new HashMap<String,Commande>();
    }
    public void ajouterCommande(String code,Commande c){
        TreeMap.put(code, c);
    }
    public void retirerCommande(String code){
        TreeMap.remove(code);
    }
    public void ajouterProd(String code,Produit p){
        ((Commande) TreeMap.get(code)).ajouterProduit(p);
    }
    public void retirerProd(String code,Produit p){
        ((Commande) TreeMap.get(code)).retirerProduit(p);
    }
    public float calculerRecette(){
        float s=0;
        for(String i : TreeMap.keySet()){
            s+=((Commande)TreeMap.get(i)).calculerPrix();
        }
        return s;
    }
    public void Affiche(){
        for (String i : TreeMap.keySet()){
            System.out.println("Code :"+i+TreeMap.get(i).toString());
        }
        System.out.println("\nRecette :"+this.calculerRecette());
    }

}
