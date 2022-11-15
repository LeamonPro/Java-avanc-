import java.util.ArrayList;

public class Villes {
    private ArrayList<Ville> viles;
    public Villes(){
        viles=new ArrayList<Ville>();
    }
    public void ajouterVille(Ville v){
        viles.add(v);
    }
    public void supprimerVille(Ville v){
        viles.remove(v);
    }
    public Ville rechVille(String v){
        for(int i=0;i<viles.size();i++){
            if(viles.get(i).getNom().equals(v))
                return viles.get(i);
        }
        return null;
    }

}
