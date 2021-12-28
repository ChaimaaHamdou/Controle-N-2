package ex7;
import java.util.Date;

public class ArticlePrimeur extends Article
{
	Date datePremeption;
    public ArticlePrimeur() {
    }
    public ArticlePrimeur(double pA, double pV, String n, String f, Date dateDePremeption){
    	super();
    	prixAchat = pA;
    	prixVente = pV;
    	Nom = n;
    	Fournisseur = f;
    	datePremeption = dateDePremeption;
     }

    public void affichage()    {
        super.affichage();
        System.out.println("Primeurs [ date de premeption = " + datePremeption + "]");
    }

}
