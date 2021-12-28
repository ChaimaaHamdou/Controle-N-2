package ex3;

public class PopulationException extends Exception {
	
	public PopulationException() 
	{
		super();
	}
	public String getMessage()
	{
		return "Vous essayez d'instancier une classe Ville avec un nombre d'habitants négatif !";
	}  

}
