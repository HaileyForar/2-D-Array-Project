import java.util.ArrayList;

public class BattleshipDatabase
	{

		static ArrayList <Battleship> navy = new ArrayList <Battleship> ();
		public static void fillNavy()
		{
			navy.add(new Battleship ("Aircraft Carrier", 5, 0));
			navy.add(new Battleship ("Battleship", 4, 0));
			navy.add(new Battleship ("Cruiser", 3, 0));
			navy.add(new Battleship ("Submarine", 3, 0));
			navy.add(new Battleship ("Destroyer", 2, 0));
		}

	}
