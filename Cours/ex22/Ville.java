import java.util.ArrayList;
public class Ville {
    private String nom ;
    private ArrayList<Delegation> delegs;
    public Ville(String nom){
        this.nom=nom;
        delegs=new ArrayList<Delegation>();
    }
    public String getNom(){
        return nom;
    }
    public void ajouterDelegation(Delegation d){
        delegs.add(d);
    }
    public void supprimerDelegation(Delegation d){
        delegs.remove(d);
    }
    public int nbrHabitants(){
        int s=0;
        for(int i=0;i<delegs.size();i++){
            s+=delegs.get(i).getnbrH();
        }
        return s;
    }
    public Delegation rechDeleg(String d){
        for(int i=0;i<delegs.size();i++){
            if(delegs.get(i).getNom().equals(d)){
                return delegs.get(i);
            }
        }
        return null;

    }
    public String maxhabdeleg(){
        int max=0;
        String res="";
        for(int i=0;i<delegs.size();i++){
            if(delegs.get(i).getnbrH()>max)
                max=delegs.get(i).getnbrH();
        }
        for(int i=0;i<delegs.size();i++){
            if(delegs.get(i).getnbrH()==max)
                res=delegs.get(i).getNom();
        }
        return res;
        
    }
    public String toString(){
        return "Nom : "+nom+"\tNbre d'habitant : "+this.nbrHabitants()   ;
    }
    


}
