import java.util.ArrayList;

public class BattleshipDatabase
	{

		static ArrayList <Battleship> navy = new ArrayList <Battleship> ();
		public static void fillNavy()
		{
			navy.add(new Battleship ("Aircraft Carrier", 5));
			navy.add(new Battleship ("Battleship", 4));
			navy.add(new Battleship ("Cruiser", 3));
			navy.add(new Battleship ("Submarine", 3));
			navy.add(new Battleship ("Destroyer", 2));
		}

	}
