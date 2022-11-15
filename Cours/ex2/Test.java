public class Test {
    public static void main(String[] args) {
        
    Delegation s=new Delegation("Sfax", 200);
    Delegation s1=new Delegation("Bizerte", 150);
    Ville v=new Ville("Tunisie");
    v.ajouterDelegation(s);
    v.ajouterDelegation(s1);
    System.out.println( v.nbrHabitants());
    System.out.println(v.rechDeleg("Sfax").toString());
    System.out.println( v.maxhabdeleg());
    Villes v1=new Villes();
    v1.ajouterVille(v);
    System.out.println( v1.rechVille("Tunisie").nbrHabitants());


        
    }
}
