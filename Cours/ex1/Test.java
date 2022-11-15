import java.util.ArrayList;

public class Test {
    /**
     * @param args
     */
    public static void main(String [] args){
        ArrayList<Float> l1=new ArrayList<Float>();
        l1.add(15f);
        l1.add(16.5f);
        l1.add(12f);
        ArrayList<Float> l2=new ArrayList<Float>();
        l2.add(10f);
        l2.add(19.5f);
        l2.add(5f);

        Etudiant e1=new Etudiant("Aymen", "Amri", 11141278,l1);
        Etudiant e2=new Etudiant("Salah", "Amri", 11141279,l2);
        Section s=new Section(1);
        System.out.println( e1.result());
        s.ajouterEtud(e1);
        s.ajouterEtud(e2);
        System.out.println( s.getMaxMoy());
        System.out.println(s.moySection());


    }        
}
