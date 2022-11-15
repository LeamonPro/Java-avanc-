public class Test {
    public static void main(String[] args) {
        Delegation d=new Delegation("Thyna", 200);
        Delegation d1=new Delegation("Sfax medina", 150);
        Delegation d2=new Delegation("Salakta", 100);
        Delegation d3=new Delegation("Ben Arous", 200);
        Delegation d4=new Delegation("Kram", 60);
        Ville v=new Ville("Sfax");
        Ville v1=new Ville("Mahdia");
        Ville v2=new Ville("Tunisie");
        Pays p=new Pays("Tunis");
        v.ajouterDelegation(d);
        d.setnbrH(250);
        v.ajouterDelegation(d1);
        v1.ajouterDelegation(d2);
        v2.ajouterDelegation(d4);
        v2.ajouterDelegation(d3);
        p.ajouterVille(v1);
        p.ajouterVille(v);
        p.ajouterVille(v2);
        System.out.println(p.getNbrHabitants());
        System.out.println( p.rechercheVille("Tunisie").nbrHabitants());
        System.out.println(p.rechercheMax().toString());
        System.out.println( v.maxhabdeleg());
        System.out.println( v.rechDeleg("Sfax medina").toString());

    }
}
