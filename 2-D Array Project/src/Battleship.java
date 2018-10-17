
public class Battleship
	{

		String name;
		int size;
		
		public Battleship (String n, int s)
		{
			name = n;
			size = s;
		}
		
		public static void shoot()
		{
			System.out.println("Bang");
		}
		
		public static void water()
		{
			System.out.println("Miss");
		}
		
		public static void ship()
		{
			System.out.println("Hit");
		}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getSize()
			{
				return size;
			}

		public void setSize(int size)
			{
				this.size = size;
			}
	

	}
