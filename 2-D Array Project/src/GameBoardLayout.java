
public class GameBoardLayout
	{
        static String [] [] GameBoardLayout;
        
        public static void fillLayout()
        {
        	GameBoardLayout = new String [10] [10];
        	
        	for(int i = 0; i < 10; i++)
        		{
        			for(int k = 0; k < 10; k++)
        				{
        					GameBoardLayout [i] [k] = " ";
        				}
        		}
        }
        
        public static void boardDisplay()
        {
        	System.out.println("     A    B    C    D    E    F    G    H    I    J  ");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("1 | " + GameBoardLayout [0] [0] + " | " + GameBoardLayout [0] [1] + " | " + GameBoardLayout [0] [2] + " | " + GameBoardLayout [0] [3] + " | " + GameBoardLayout [0] [4] + " | " + GameBoardLayout [0] [5] + " | " + GameBoardLayout [0] [6] + " | " + GameBoardLayout [0] [7] + " | " + GameBoardLayout [0] [8] + " | " + GameBoardLayout [0] [9] + " | " + GameBoardLayout [0] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("2 | " + GameBoardLayout [1] [0] + " | " + GameBoardLayout [1] [1] + " | " + GameBoardLayout [1] [2] + " | " + GameBoardLayout [1] [3] + " | " + GameBoardLayout [1] [4] + " | " + GameBoardLayout [1] [5] + " | " + GameBoardLayout [1] [6] + " | " + GameBoardLayout [1] [7] + " | " + GameBoardLayout [1] [8] + " | " + GameBoardLayout [1] [9] + " | " + GameBoardLayout [1] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("3 | " + GameBoardLayout [2] [0] + " | " + GameBoardLayout [2] [1] + " | " + GameBoardLayout [2] [2] + " | " + GameBoardLayout [2] [3] + " | " + GameBoardLayout [2] [4] + " | " + GameBoardLayout [2] [5] + " | " + GameBoardLayout [2] [6] + " | " + GameBoardLayout [2] [7] + " | " + GameBoardLayout [2] [8] + " | " + GameBoardLayout [2] [9] + " | " + GameBoardLayout [2] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("4 | " + GameBoardLayout [3] [0] + " | " + GameBoardLayout [3] [1] + " | " + GameBoardLayout [3] [2] + " | " + GameBoardLayout [3] [3] + " | " + GameBoardLayout [3] [4] + " | " + GameBoardLayout [3] [5] + " | " + GameBoardLayout [3] [6] + " | " + GameBoardLayout [3] [7] + " | " + GameBoardLayout [3] [8] + " | " + GameBoardLayout [3] [9] + " | " + GameBoardLayout [3] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("5 | " + GameBoardLayout [4] [0] + " | " + GameBoardLayout [4] [1] + " | " + GameBoardLayout [4] [2] + " | " + GameBoardLayout [4] [3] + " | " + GameBoardLayout [4] [4] + " | " + GameBoardLayout [4] [5] + " | " + GameBoardLayout [4] [6] + " | " + GameBoardLayout [4] [7] + " | " + GameBoardLayout [4] [8] + " | " + GameBoardLayout [4] [9] + " | " + GameBoardLayout [4] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("6 | " + GameBoardLayout [5] [0] + " | " + GameBoardLayout [5] [1] + " | " + GameBoardLayout [5] [2] + " | " + GameBoardLayout [5] [3] + " | " + GameBoardLayout [5] [4] + " | " + GameBoardLayout [5] [5] + " | " + GameBoardLayout [5] [6] + " | " + GameBoardLayout [5] [7] + " | " + GameBoardLayout [5] [8] + " | " + GameBoardLayout [5] [9] + " | " + GameBoardLayout [5] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("7 | " + GameBoardLayout [6] [0] + " | " + GameBoardLayout [6] [1] + " | " + GameBoardLayout [6] [2] + " | " + GameBoardLayout [6] [3] + " | " + GameBoardLayout [6] [4] + " | " + GameBoardLayout [6] [5] + " | " + GameBoardLayout [6] [6] + " | " + GameBoardLayout [6] [7] + " | " + GameBoardLayout [6] [8] + " | " + GameBoardLayout [6] [9] + " | " + GameBoardLayout [6] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("8 | " + GameBoardLayout [7] [0] + " | " + GameBoardLayout [7] [1] + " | " + GameBoardLayout [7] [2] + " | " + GameBoardLayout [7] [3] + " | " + GameBoardLayout [7] [4] + " | " + GameBoardLayout [7] [5] + " | " + GameBoardLayout [7] [6] + " | " + GameBoardLayout [7] [7] + " | " + GameBoardLayout [7] [8] + " | " + GameBoardLayout [7] [9] + " | " + GameBoardLayout [7] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("9 | " + GameBoardLayout [8] [0] + " | " + GameBoardLayout [8] [1] + " | " + GameBoardLayout [8] [2] + " | " + GameBoardLayout [8] [3] + " | " + GameBoardLayout [8] [4] + " | " + GameBoardLayout [8] [5] + " | " + GameBoardLayout [8] [6] + " | " + GameBoardLayout [8] [7] + " | " + GameBoardLayout [8] [8] + " | " + GameBoardLayout [8] [9] + " | " + GameBoardLayout [8] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("10| " + GameBoardLayout [9] [0] + " | " + GameBoardLayout [9] [1] + " | " + GameBoardLayout [9] [2] + " | " + GameBoardLayout [9] [3] + " | "  + GameBoardLayout [9] [4] + " | "+ GameBoardLayout [9] [5] + " | " + GameBoardLayout [9] [6] + " | " + GameBoardLayout [9] [7] + " | " + GameBoardLayout [9] [8] + " | " + GameBoardLayout [9] [9] + " | " + GameBoardLayout [9] [10] + " | ");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        }
	}

//Here is my comment from home ;)
