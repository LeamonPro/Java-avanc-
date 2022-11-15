
import java.util.ArrayList;

public class Section {
    private int num;
    private ArrayList<Etudiant> etuds ;
    public Section(int num){
        this.num=num;
        etuds=new ArrayList<Etudiant>();
    }
    public void ajouterEtud(Etudiant e){
        etuds.add(e);
    }
    public void supprimerEtud(Etudiant e){
        etuds.remove(e);
    }
    public Float moySection(){
        Float c=0f;
        for(int i=0;i<etuds.size();i++){
            c+=etuds.get(i).getMoy();
        }
        return c/etuds.size();
    }
    public Float getMaxMoy(){
        float max=0f;
        for(int i=0;i<etuds.size();i++){
            if(etuds.get(i).getMoy()>max)
                max=etuds.get(i).getMoy();
        }
        return max;
    }
    public String toString() {
        return "Numero : "+num+"\nNombre etudiants : "+etuds.size()+"\nMoyenne section : "+moySection()+"\nMoyenne maximal : "+getMaxMoy();
    }

    
}
