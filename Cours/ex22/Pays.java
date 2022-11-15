import java.util.Map;
import java.util.HashMap;

public class Pays {
    private String nom;
    private Map<Ville,Integer> mapVilles;
    public Pays(String nom){
        this.nom=nom;
        mapVilles=new HashMap<Ville,Integer>();
    }
    public void ajouterVille(Ville v){
        mapVilles.put(v,v.nbrHabitants());
    }
    public void supprimerVille(String v){
        Ville ville=this.rechercheVille(v);
        if(ville!=null){
            mapVilles.remove(ville);
        }
    }
    public Ville rechercheVille(String nom){
        for (Ville ville : mapVilles.keySet()) {
            if(ville.getNom().equals(nom)){
                return ville;
            }
        }
        return null;
    }
    public int getNbrHabitants(){
        int s=0;
        for(Ville v:mapVilles.keySet()){
            s+=mapVilles.get(v);
        }
        return s;
    }
    public Ville rechercheMax(){
        Ville v = (Ville)mapVilles.keySet().toArray()[0];
        for (Ville ville  : mapVilles.keySet()) {
            if(mapVilles.get(v)<mapVilles.get(ville)){
                v=ville;
            }
        }
        return v;
    }
    public String toString() {
        return "Nom : "+nom+"\tNombre habitant : "+getNbrHabitants();
    }
}
