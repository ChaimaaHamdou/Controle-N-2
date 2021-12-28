package ex6;

import java.time.*;

public class Associe extends Employe
{
		public static double ca;
		private double pourcentage;

		public static double getCa()
		{
			return ca;
		}
		public static void setCa(double value)
		{
			Associe.ca = value;
		}

		public double getPourcentage()
		{
			return pourcentage;
		}
		public void setPourcentage(double value)
		{
			this.pourcentage = value;
		}

		public Associe(int matricule, String nom, String prenom, LocalDateTime dn, double p)
		{
			super(matricule, nom, prenom, dn);
			pourcentage = p;
		}

		public String toString()
		{
			return "Associé: " + " " + super.toString() + " Pourcentage: " + pourcentage + "%";
		}

		public double GetSalaire()
		{
			return Double.isNaN(((ca * pourcentage / 100) / 12)) ? Double.NaN : Math.round(((ca * pourcentage / 100) / 12) * Math.pow(10, 2)) / Math.pow(10, 2);
		}
}

