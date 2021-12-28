package ex2;

public class AgeEnfantException extends Exception {
	
	public AgeEnfantException()
	{
		super();
    }
	public String getMessage ()
	{
		return "ce n'est pas un âge valide !";
	}
}
