package ex6;

import java.time.*;

public abstract class Employe
{
	private int matircule;
	private String nom;
	private String prenom;
	private LocalDateTime datenaissance = LocalDateTime.MIN;

	public int getMatircule()
	{
		return matircule;
	}
	public void setMatircule(int value)
	{
		this.matircule = value;
	}

	public String getNom()
	{
		return nom;
	}
	public void setNom(String value)
	{
		this.nom = value;
	}

	public String getPrenom()
	{
		return prenom;
	}
	public void setPrenom(String value)
	{
		this.prenom = value;
	}

	public LocalDateTime getDatenaissance()
	{
		return datenaissance;
	}
	public void setDatenaissance(LocalDateTime value)
	{
		this.datenaissance = value;
	}

	public Employe(int matricule, String nom, String prenom, LocalDateTime dn)
	{
		this.matircule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.datenaissance = dn;
	}

	public String toString()
	{
		return "Matricule: " + matircule + " Nom: " + nom + " Prénom: " + prenom + " Date de naissance: " + datenaissance.getYear();
	}

	public abstract double GetSalaire();

}

