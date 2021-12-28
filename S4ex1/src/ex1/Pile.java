package ex1;

//public class Pile
//{
	public class Pile
	{
		private static final int TAILLE_MAX = 8 ;// taille maximum de la pile
		private int t[]; // tableau stockant les �l�ments de la pile
		private int nb; // nombre d��l�ments dans la pile
		public Pile() {
			t = new int[TAILLE_MAX];
			nb = 0;
		}
		public boolean estVide()
		{ 
			return nb == 0; 
		}

		public void empiler(int i) throws PilePleineException 
		{
			if (nb == TAILLE_MAX) throw new PilePleineException();
			t[nb] = i;
			nb++;
			System.out.println("sortie de empiler");
		}

		public int sommet() throws PileVideException 
		{
			if (nb == 0) throw new PileVideException();
			System.out.println("sortie de sommet");
			return t[nb-1];
		}	

		public void depiler() throws PileVideException 
		{
			if (nb == 0) throw new PileVideException();
			nb--;
			System.out.println("sortie de d�piler");
		}

		public void depilerTout() 
		{
			try {
				while(true) {
					System.out.println(sommet());
					depiler();
				}
			}
			catch (PileVideException e)
			{
				System.out.println("le d�pilerTout est pass� par l�");
			}
		}
		
		public static void main(String[] args) {
			Pile p = new Pile();
			try 
			{
				p.empiler(9);
				p.empiler(9);
				p.depilerTout();
				System.out.println(p.sommet());
			}
			catch (PileVideException e)
			{
				System.out.println("Le main pense que la pile est vide");
			}
			catch (PilePleineException e)
			{	
				System.out.println("Le main pense que la pile est pleine");
			}
			catch (Exception e)
			{
				System.out.println("Le main est pass� par l�");
			}
			System.out.println("sortie du main");
		}
	}
//}
/*public class Pile {
	 
	// 
	// D�clarations des attributs de la pile
	//
	    static final int MAX = 8;
	    char[] t;
	    int top;

	// 
	// Programmation des op�rations (m�thodes) de la pile
	// 

	    public Pile(){
	        // Initialise une pile vide
	        t = new char[MAX];
	        top = -1;
	    }

	    public void empiler(char c){
	        // Empile le caract�re donn�
	        if (!estPleine())
	            t[++top] = c;
	        else
	            System.out.println("Pile pleine");
	    }

	    public char sommet(){ 
	        // Retourne le caract�re au sommet de la pile
	        if (!estVide())
	            return t[top];
	        else {
	            System.out.println("Pile vide Sommet");
	            return '\0';
	        }
	    }

	    public void depiler(){
	        //    d�capite la pile (retire le sommet )
	        if (!estVide())
	            top--;
	        else
	            System.out.println("Pile vide Depiler");
	    }
	 
	    public boolean estVide(){ 
	        //    Teste si la pile est vide
	        return (top < 0);
	    }

	    public boolean estPleine(){ 
	        // teste si la pile est pleine
	        return (top >= (MAX - 1));
	    }
	}; // Fin class Pile*/