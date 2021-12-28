package ex2;

public class Enfant
{
		private int age;

		public final int getAge()
		{
			return age;
		}
		public final void setAge(int value) throws AgeEnfantException
		{
			if (value >= 1 && value <= 10)
			{
				age = value;
			}
			else
			{
				throw new AgeEnfantException();
			}
		}


		public Enfant()
		{}

		public Enfant(int a) throws AgeEnfantException
		{
			setAge(a);
		}

		public String toString()
		{
			return " Age: " + age;
		}

}

