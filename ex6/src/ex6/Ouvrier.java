package ex6;

import java.time.*;

public class Ouvrier extends Employe
{
		private LocalDateTime dateentree = LocalDateTime.MIN;
		private static double sMIG = 3000;

		public static double getSMIG()
		{
			return sMIG;
		}


		public LocalDateTime getDateentree()
		{
			return dateentree;
		}
		public final void setDateentree(LocalDateTime value)
		{
			this.dateentree = value;
		}

		public Ouvrier(int m, String n, String p, LocalDateTime dn, LocalDateTime de)
		{
			super(m, n, p, dn);
			dateentree = de;
		}

		public String toString()
		{
			return "Employé:" + " " + super.toString() + " Date d'entrée: " + dateentree.getYear();
		}

		public double GetSalaire()
		{
			double salaire;
			int Anciennete = LocalDateTime.now().getYear() - dateentree.getYear();
			if (dateentree.plusYears(Anciennete).compareTo(LocalDateTime.MIN) > 0)
			{
				Anciennete--;
			}
			if (sMIG + Anciennete * 100 <= 2 * sMIG)
			{
				salaire = sMIG + Anciennete * 100;
			}
			else
			{
				salaire = sMIG * 2;
			}

			return salaire;
		}
}
