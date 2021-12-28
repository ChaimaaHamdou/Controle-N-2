package ex7;

public class Article
{
	protected double prixAchat;
    protected double prixVente;
    protected String Nom;
    protected String Fournisseur;

    public Article(double pA, double pV, String n, String f) {
        prixAchat = pA;
        prixVente = pV;
        Nom = n;
        Fournisseur = f;
    }

    public Article() {
		// TODO Auto-generated constructor stub
	}

	public double calculateur()    {
        return prixVente - prixAchat;
    }

    public void affichage()     {
        System.out.println("Nom du produit:" + Nom);
        System.out.println("Fournisseur: " + Fournisseur);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix de vente: " + prixVente);
    }
}
