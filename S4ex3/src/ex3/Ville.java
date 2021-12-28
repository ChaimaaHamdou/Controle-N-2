package ex3;

public class Ville {
	  private String nom;
	  private String pays;
	  private int population;       



	public String getNom()  {  
	    return nom;
	  }

	  public String getPays()
	  {
	    return pays;
	  }

	  public int getPopulation()
	  {
	    return population;
	  } 

	  public void setNom(String pNom)
	  {
	    nom = pNom;
	  }

	  public void setPays(String pPays)
	  {
	    pays = pPays;
	  }

	  public void setPopulation(int pPopu) throws PopulationException
	  {
		  if(pPopu < 0) throw new PopulationException();
		  
		  else
		  {
			  population = pPopu;
		  }
	  } 
	  public Ville(){}
	  
	  public Ville(String pNom, int pPopu, String pPays) throws PopulationException
	  {
		  nom = pNom;
		  pays = pPays;
		  setPopulation(pPopu);
	  }
	  
	   public String toString()
	  {
		  return "v = "+getNom()+" ville de  "+getPopulation()+ " habitants se situant en " + getPays();
	  }
}
