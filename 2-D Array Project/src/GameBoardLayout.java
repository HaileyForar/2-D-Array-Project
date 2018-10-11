
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
        	System.out.println("3 |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("4 |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("5 |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("6 |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("7 |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("8 |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("9 |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("10|     |     |    |    |    |    |    |    |    |    |");
        	System.out.println("  |     |     |    |    |    |    |    |    |    |    |");
        	System.out.println(" ----------------------------------------------------");
        }
	}
