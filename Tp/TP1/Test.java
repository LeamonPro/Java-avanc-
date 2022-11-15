public class Test {
    public static void main(String[] args) {
        Produit p1=new Produit("Electronique", "Vape", 0, 300f);
        Produit p2=new Produit("Electronique", "Phone", 1, 1350f);
        Commande c=new Commande();
        c.ajouterProduit(p2);
        c.ajouterProduit(p1);
        Commande c2=new Commande();
        c2.ajouterProduit(p1);
        Commandes c1=new Commandes();
        c1.ajouterCommande("1", c);
        c1.ajouterCommande("2", c2);
        c1.Affiche();


    }
}
