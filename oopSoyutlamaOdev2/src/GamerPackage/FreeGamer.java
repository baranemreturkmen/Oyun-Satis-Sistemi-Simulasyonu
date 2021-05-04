package GamerPackage;

import java.util.ArrayList;
import SalesPackage.Games;

public class FreeGamer extends Gamer{
	
	//FreeGamer class'ım base class olan Gamer class'ını extend ediyor. İleride FreeGamer'a özel özellikler
	//eklenirse eğer bu class'ın altından eklenecek.

	public FreeGamer(String userName, String password, String email, int level, double experience, ArrayList<Games> games) {
		super(userName, password, email, level, experience, games);
		// TODO Auto-generated constructor stub
	}

}
