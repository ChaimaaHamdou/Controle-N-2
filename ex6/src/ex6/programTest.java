package ex6;

import java.time.*;

public class programTest
{
		public static void main(String[] args)
		{
			
			Ouvrier o1 = new Ouvrier(1234, "CHAIMAA", "Chaimaa", LocalDateTime.of(1989, 7, 9, 0, 0), LocalDateTime.of(2010, 10, 11, 0, 0));
			System.out.println(o1);
			System.out.println("Salaire de l'employé: " + o1.GetSalaire());
			System.out.println("______________________________________________________________________________");
			Cadre c1 = new Cadre(4321, "WAFAA", "Wafaa", LocalDateTime.of(1980, 6, 10, 0, 0), 4);
			System.out.println(c1);
			System.out.println("Le salaire du cadre est: " + c1.GetSalaire());
			System.out.println("______________________________________________________________________________");
			Associe.ca = 10000000;
			Associe a1 = new Associe(2341, "IMANE", "Imane", LocalDateTime.of(1972, 7, 6, 0, 0), 20);
			System.out.println(a1);
			System.out.println("Le salaire du associé est: " + a1.GetSalaire());

		}
}

