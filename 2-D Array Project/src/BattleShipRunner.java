
import java.util.Scanner;

public class BattleShipRunner
	{
		private static final String[][] GameBoardLayout = new String [10] [10];
		
		public static void main(String[] args)
			{
				userInput();
				fillLayout();
				boardDisplay();
//				gameSetUp();
//				battleshipFacts();
				

			}
		
		public static void userInput()
			{
				Scanner userInput = new Scanner (System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				
			  System.out.println( name + ", your mission, if you choose to accept it, is to sink all the warships!");

			  System.out.println("Destroyer, Cruiser, Battleship, and Aircraft Carrier!");

			  System.out.println("The challenge is to sink the ships in the fewest number of guesses possible... Let's see if you can sailor!");
			  
			  System.out.println("All that you have to do is enter in the coordinates of where you want to hit, example: A1");
			  
			  Scanner userInput1 = new Scanner (System.in);
			  System.out.println("What is your move?");
			  String move = userInput1.nextLine();
			  
			  //Parse for the letter A-a
			  int row = 0;
			  int col = 0;
			  String rowInput = "";
			 
			 rowInput = move.substring(0,1);
			 rowInput = rowInput.toLowerCase();
			 if(rowInput.equals("A") || rowInput.equals("a"))
				 {
					 row = 0;
				 }
			 
//			 col = Integer.parseInt(move.substring (1,2));
			 
			 //Parse for the letter B-b
			
			 rowInput = move.substring(0,1);
			 rowInput = rowInput.toLowerCase();
			 if(rowInput.equals("B") || rowInput.equals("b"))
						 {
							 row = 1;
						 }
					 
//			 col = Integer.parseInt(move.substring (1,2));
              
              //Parse for the letter C-c
             
             rowInput = move.substring(0,1);
             rowInput = rowInput.toLowerCase();
             if(rowInput.equals ("C") || rowInput.equals("c"))
            	 {
            		 row = 2;
            	 }
             
//             col = Integer.parseInt(move.substring(1,2));
             
             //Parse for the letter D-d
             
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("D") || rowInput.equals("d"))
            	{
            		row = 3;
            	}
            
//            col = Integer.parseInt(move.substring(1,2));
              
            //Parse for the letter E-e
          
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("E") || rowInput.equals("e"))
            	{
            		row = 4;
            	}
            
//            col = Integer.parseInt(move.substring(1,2));
            
            //Parse for the letter F-f
           
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("F") || rowInput.equals("f"))
            	{
            		row = 5;
            	}
            
//            col = Integer.parseInt(move.substring(1, 2));
            
            //Parse for the letter G-g
                     
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("G") || rowInput.equals("g"))
            	{
            		row = 6;
            	}
            
//            col = Integer.parseInt(move.substring(1,2));
            
            //Parse for the letter H-h
            		
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("H") || rowInput.equals("h"))
            	{
            		row = 7;
            	}
            
//            col = Integer.parseInt(move.substring(1,2));
            
            //Parse for the letter I-i
            
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("I") || rowInput.equals("i"))
            	{
            		row = 8;
            	}
            
//            col = Integer.parseInt(move.substring(1,2));
            
            //Parse for the letter J-j
           
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("J") || rowInput.equals("j"))
            	{
            		row = 9;
            	}
            
//            col = Integer.parseInt(move.substring(1,2));  
              
			}
		
		public static void fillLayout()
		{
			for(int row = 0; row < 10; row++)
        		{
        	     for(int col = 0; col < 10; col++)
        			{
        				GameBoardLayout [row] [col] = " ";
        			}
        		}
		}
		
		
		public static void boardDisplay()
		{
			System.out.println("     A     B     C     D     E     F     G     H     I     J  ");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("1 |  " + GameBoardLayout [0] [0] + "  |  " + GameBoardLayout [0] [1] + "  |  " + GameBoardLayout [0] [2] + "  |  " + GameBoardLayout [0] [3] + "  |  " + GameBoardLayout [0] [4] + "  |  " + GameBoardLayout [0] [5] + "  |  " + GameBoardLayout [0] [6] + "  |  " + GameBoardLayout [0] [7] + "  |  " + GameBoardLayout [0] [8] + "  |  " + GameBoardLayout [0] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |"); 
        	System.out.println("2 |  " + GameBoardLayout [1] [0] + "  |  " + GameBoardLayout [1] [1] + "  |  " + GameBoardLayout [1] [2] + "  |  " + GameBoardLayout [1] [3] + "  |  " + GameBoardLayout [1] [4] + "  |  " + GameBoardLayout [1] [5] + "  |  " + GameBoardLayout [1] [6] + "  |  " + GameBoardLayout [1] [7] + "  |  " + GameBoardLayout [1] [8] + "  |  " + GameBoardLayout [1] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("3 |  " + GameBoardLayout [2] [0] + "  |  " + GameBoardLayout [2] [1] + "  |  " + GameBoardLayout [2] [2] + "  |  " + GameBoardLayout [2] [3] + "  |  " + GameBoardLayout [2] [4] + "  |  " + GameBoardLayout [2] [5] + "  |  " + GameBoardLayout [2] [6] + "  |  " + GameBoardLayout [2] [7] + "  |  " + GameBoardLayout [2] [8] + "  |  " + GameBoardLayout [2] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |"); 
        	System.out.println("4 |  " + GameBoardLayout [3] [0] + "  |  " + GameBoardLayout [3] [1] + "  |  " + GameBoardLayout [3] [2] + "  |  " + GameBoardLayout [3] [3] + "  |  " + GameBoardLayout [3] [4] + "  |  " + GameBoardLayout [3] [5] + "  |  " + GameBoardLayout [3] [6] + "  |  " + GameBoardLayout [3] [7] + "  |  " + GameBoardLayout [3] [8] + "  |  " + GameBoardLayout [3] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("5 |  " + GameBoardLayout [4] [0] + "  |  " + GameBoardLayout [4] [1] + "  |  " + GameBoardLayout [4] [2] + "  |  " + GameBoardLayout [4] [3] + "  |  " + GameBoardLayout [4] [4] + "  |  " + GameBoardLayout [4] [5] + "  |  " + GameBoardLayout [4] [6] + "  |  " + GameBoardLayout [4] [7] + "  |  " + GameBoardLayout [4] [8] + "  |  " + GameBoardLayout [4] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("6 |  " + GameBoardLayout [5] [0] + "  |  " + GameBoardLayout [5] [1] + "  |  " + GameBoardLayout [5] [2] + "  |  " + GameBoardLayout [5] [3] + "  |  " + GameBoardLayout [5] [4] + "  |  " + GameBoardLayout [5] [5] + "  |  " + GameBoardLayout [5] [6] + "  |  " + GameBoardLayout [5] [7] + "  |  " + GameBoardLayout [5] [8] + "  |  " + GameBoardLayout [5] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("7 |  " + GameBoardLayout [6] [0] + "  |  " + GameBoardLayout [6] [1] + "  |  " + GameBoardLayout [6] [2] + "  |  " + GameBoardLayout [6] [3] + "  |  " + GameBoardLayout [6] [4] + "  |  " + GameBoardLayout [6] [5] + "  |  " + GameBoardLayout [6] [6] + "  |  " + GameBoardLayout [6] [7] + "  |  " + GameBoardLayout [6] [8] + "  |  " + GameBoardLayout [6] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("8 |  " + GameBoardLayout [7] [0] + "  |  " + GameBoardLayout [7] [1] + "  |  " + GameBoardLayout [7] [2] + "  |  " + GameBoardLayout [7] [3] + "  |  " + GameBoardLayout [7] [4] + "  |  " + GameBoardLayout [7] [5] + "  |  " + GameBoardLayout [7] [6] + "  |  " + GameBoardLayout [7] [7] + "  |  " + GameBoardLayout [7] [8] + "  |  " + GameBoardLayout [7] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("9 |  " + GameBoardLayout [8] [0] + "  |  " + GameBoardLayout [8] [1] + "  |  " + GameBoardLayout [8] [2] + "  |  " + GameBoardLayout [8] [3] + "  |  " + GameBoardLayout [8] [4] + "  |  " + GameBoardLayout [8] [5] + "  |  " + GameBoardLayout [8] [6] + "  |  " + GameBoardLayout [8] [7] + "  |  " + GameBoardLayout [8] [8] + "  |  " + GameBoardLayout [8] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println("10|  " + GameBoardLayout [9] [0] + "  |  " + GameBoardLayout [9] [1] + "  |  " + GameBoardLayout [9] [2] + "  |  " + GameBoardLayout [9] [3] + "  |  " + GameBoardLayout [9] [4] + "  |  "+ GameBoardLayout [9] [5] +  "  |  " + GameBoardLayout [9] [6] + "  |  " + GameBoardLayout [9] [7] + "  |  " + GameBoardLayout [9] [8] + "  |  " + GameBoardLayout [9] [9] + "  |  ");
        	System.out.println("  |     |     |     |     |     |     |     |     |     |     |");
        	System.out.println(" --------------------------------------------------------------");
		}
		
		
		public static void gameSetUp()
		{
			

			        Battleship one = new Battleship();

			        one.setName("Aircraft Carrier"); 

			        Battleship two = new Battleship();

			        two.setName("Battleship");

			        Battleship three = new Battleship();

			        three.setName("Cruiser");
			        
			        Battleship four = new Battleship();
			        
			        four.setName("Submarine");
			        
			        Battleship five = new Battleship();
			        
			        five.setName("Destroyer");

			        battleshipList.add(one);

			        battleshipList.add(two);

			        battleshipList.add(three);
			        
			        battleshipList.add(four);
			        
			        battleshipList.add(five);

		}
		
		public static void battleshipFacts()
		{
			System.out.println("Now that you have finished the game, here are some fun facts about the ships in real life...");
			
			System.out.println("AIRCRAFT CARRIERS:");
			System.out.println("The Nimitz class aircraft carrier can operate for 20 years without needing to refuel!");
			System.out.println("During WWII, the British had serious plans for making an aircraft carrier primarily out of wood pulp and ice!");
			System.out.println("In 1957, 10 Sydney University students dressed as pirates, boarded the aircraft carrier USS Bennington, reached the bridge, and announced over the PA that they had captured the ship!");
			
			System.out.println("BATTLESHIPS:");
			System.out.println("A Battleship is an armored warship with a battery consisting of heavy caliber guns");
			System.out.println("A Battleship's job is to basically blow holes in other ships");
			System.out.println("In Britain, their battleships are called Dreadnoughts");
			
			System.out.println("CRUISERS:");
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("SUBMARINES");
			System.out.println();
			System.out.println();
			System.out.println();
			
			System.out.println("DESTROYERS:");
			System.out.println();
			System.out.println();
			System.out.println();
			
		}

	}
