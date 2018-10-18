
import java.util.Scanner;

public class BattleShipRunner
	{
		private static final String[][] GameBoardLayout = new String [10] [10];
		
		public static void main(String[] args)
			{
			    battleshipPlacement();
				userInput();
				fillLayout();
				boardDisplay();
//				gameSetUp();
//				battleshipFacts();
				
			}
		
		public static void battleshipPlacement()
		{
			int [] [] placement = new int [10] [10];
			   
			// Placement of the Destroyer
			     placement [1] [1] = 1;
			     placement [1] [2] = 1;
			     
			//Placement of the Submarine
			     placement [5] [0] = 1;
			     placement [5] [1] = 1;
			     placement [5] [2] = 1;
			     
			//Placement of the Cruiser
			     placement [9] [9] = 1;
			     placement [8] [9] = 1;
			     placement [7] [9] = 1;
			     
		    //Placement of the Battleship
			     placement [3] [6] = 1;
			     placement [4] [6] = 1;
			     placement [5] [6] = 1;
			     placement [6] [6] = 1;
			     
			//Placement of the Aircraft Carrier
			     placement [8] [2] = 1;
			     placement [8] [3] = 1;
			     placement [8] [4] = 1;
			     placement [8] [5] = 1;
			     placement [8] [6] = 1;
		}
		
		public static void userInput()
			{
		        
				Scanner userInput = new Scanner (System.in);
				System.out.println("What is your name?");
				String name = userInput.nextLine();
				
			  System.out.println( name + ", your mission, if you choose to accept it, is to sink all the warships!");

			  System.out.println("There are 5 different ships: Aircraft Carrier, Battleship, Cruiser, Submarine and Destroyer!");

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
			 

			 //Parse for the letter B-b
			
			 rowInput = move.substring(0,1);
			 rowInput = rowInput.toLowerCase();
			 if(rowInput.equals("B") || rowInput.equals("b"))
						 {
							 row = 1;
						 }
					 

              //Parse for the letter C-c
             
             rowInput = move.substring(0,1);
             rowInput = rowInput.toLowerCase();
             if(rowInput.equals ("C") || rowInput.equals("c"))
            	 {
            		 row = 2;
            	 }
             

             //Parse for the letter D-d
             
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("D") || rowInput.equals("d"))
            	{
            		row = 3;
            	}
            

            //Parse for the letter E-e
          
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("E") || rowInput.equals("e"))
            	{
            		row = 4;
            	}
            

            //Parse for the letter F-f
           
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("F") || rowInput.equals("f"))
            	{
            		row = 5;
            	}
            

            //Parse for the letter G-g
                     
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("G") || rowInput.equals("g"))
            	{
            		row = 6;
            	}
            

            //Parse for the letter H-h
            		
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("H") || rowInput.equals("h"))
            	{
            		row = 7;
            	}
            

            //Parse for the letter I-i
            
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("I") || rowInput.equals("i"))
            	{
            		row = 8;
            	}
            
            //Parse for the letter J-j
           
            rowInput = move.substring(0,1);
            rowInput = rowInput.toLowerCase();
            if(rowInput.equals("J") || rowInput.equals("j"))
            	{
            		row = 9;
            	}
            
            col = Integer.parseInt(move.substring(1,2));
            col = col - 1;
            
            
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
		
		
		public static void battleshipFacts()
		{
			System.out.println("Now that you have finished the game, here are some fun facts about the ships in real life...");
			System.out.println("");
			
			System.out.println("AIRCRAFT CARRIERS:");
			System.out.println("");
			System.out.println(" - The Nimitz class aircraft carrier can operate for 20 years without needing to refuel.");
			System.out.println("");
			System.out.println(" - During WWII, the British had serious plans for making an aircraft carrier primarily out of wood pulp and ice.");
			System.out.println("");
			System.out.println(" - In 1957, 10 Sydney University students dressed as pirates, boarded the aircraft carrier USS Bennington, reached the bridge, and announced over the PA that they had captured the ship.");
			System.out.println("");
			
			System.out.println("BATTLESHIPS:");
			System.out.println("");
			System.out.println(" - A Battleship is an armored warship with a battery consisting of heavy caliber guns.");
			System.out.println("");
			System.out.println(" - A Battleship's job is to basically blow holes in other ships.");
			System.out.println("");
			System.out.println(" - In Britain, their battleships are called Dreadnoughts.");
			System.out.println("");
			
			System.out.println("CRUISERS:");
			System.out.println("");
			System.out.println(" - The 1884 Navy Appropriation Act authorized the construction of cruisers, and this marked the transition from wood to steel and steam.");
			System.out.println("");
			System.out.println(" - The USS New York was the first armored cruiser.");
			System.out.println("");
			System.out.println(" - The fleet base at Pearl Harbor, Hawaii was ceremonially opened when the armored cruiser USS California steamed through the channel.");
			System.out.println("");
			
			System.out.println("SUBMARINES");
		    System.out.println("");
			System.out.println(" - Submarines use ballast tanks to hold water, allowing them to submerge when necessary.");
			System.out.println("");
			System.out.println(" - Both sides of the American Civil War built and used submarines.");
			System.out.println("");
			System.out.println(" - Both the United States and Soviet Union maintained significant submarine fleets during the Cold War.");
			System.out.println("");
			
			System.out.println("DESTROYERS:");
			System.out.println("");
			System.out.println(" - Destroyers are smaller ships that specialize in anti-ship, and anti-submarine warfare.");
			System.out.println("");
			System.out.println(" - Destroyers carry missiles that will aquire their targets underwater to strike other ships and submarines ");
			System.out.println("");
			System.out.println(" - Destroyers are fast, manuverable and long endurance ships.");
			
		}

	}
