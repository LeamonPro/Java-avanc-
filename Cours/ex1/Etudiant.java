import java.util.ArrayList;
public class Etudiant {
    private String nom;
    private String prenom;
    private int cin;
    private ArrayList<Float> notes;
    public Etudiant(String nom,String prenom,int cin,ArrayList<Float> notes){
        this.nom=nom;
        this.prenom=prenom;
        this.cin=cin;
        this.notes=notes;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }
    public int getCin(){
        return cin;
    }
    public ArrayList<Float> getNotes(){
        return notes;
    }
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setPrenom(String prenom){
        this.prenom=prenom;
    }
    public void setCin(int cin){
        this.cin=cin;
    }
    public void setNotes(ArrayList<Float> notes){
        this.notes=notes;
    }
    public Float getMoy(){
        Float c=0f;
        for(int i=0;i<notes.size();i++){
            c+=notes.get(i);
        }
        return c/notes.size();
    }
    public String toString(){
        return ("nom:"+nom+" prenom:"+prenom+" cin:"+cin+"moyenne:"+this.getMoy());
    }
    public String result(){
        Float a=this.getMoy();
        if(a>=10 || a<=12)
            return ("Admis avec la mention Assez Bien");
        if(a>12 || a<=16)
            return ("Admis avec la mention Bien");
        if(a>16)
            return ("Admis avec la mention trés bien");
        else 
            return ("Refusé");
    }
    

}