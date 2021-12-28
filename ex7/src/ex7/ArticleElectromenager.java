package ex7;

public class ArticleElectromenager extends Article implements solde
{
    public String marque;
    public double voltage; 

    // constructeur
    public ArticleElectromenager(double voltage, String marque){
    	super();
    	this.voltage = voltage;
    	this.marque = marque;
    }
    public ArticleElectromenager(double pA, double pV, String n, String f, double voltage, String marque){
        super(pA,pV,n,f);
        this.voltage = voltage;
        this.marque = marque;
    }

    // méthode surécrite
    public void affichage()     {
        super.affichage();
        System.out.println("Nom du produit:" + Nom);
        System.out.println("Fournisseur: " + Fournisseur);
        System.out.println("Prix d'achat: " + prixAchat);
        System.out.println("Prix de vente: " + prixVente);
        System.out.println("La marque est: " + marque + " et le voltage est: " + voltage + " V");
    }

    public void LancerSolde(double Pourcentage)     {
        prixVente = prixVente * Pourcentage/100;
    }
    public void TerminerSolde(double Pourcentage)     {
        prixVente = prixVente * Pourcentage/100;
    }
}