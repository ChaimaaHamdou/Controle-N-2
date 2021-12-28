package ex6;

import java.time.*;

public class Cadre extends Employe
{
		private int indice;

		public int getIndice()
		{
			return indice;
		}
		public void setIndice(int value)
		{
			this.indice = value;
		}

		public Cadre(int matricule, String nom, String prenom, LocalDateTime dn, int indice)
		{
			super(matricule, nom, prenom, dn);
			this.indice = indice;
		}

		public String toString()
		{
			return "Cadre: " + " " + super.toString() + " Indice: " + indice;
		}

		public double GetSalaire()
		{
			if (indice == 1)
			{
				return 12000;
			}
			else if (indice == 2)
			{
				return 14000;
			}
			else if (indice == 3)
			{
				return 16000;
			}
			else if (indice == 4)
			{
				return 18000;
			}
			else
			{
				return -1; 
			}
		}
}
