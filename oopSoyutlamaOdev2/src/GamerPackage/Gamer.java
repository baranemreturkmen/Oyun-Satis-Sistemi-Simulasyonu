package GamerPackage;

import java.util.ArrayList;
import SalesPackage.Games;

public class Gamer {
	
	//Oyuncular için oyuncuların özelliklerini tutan base class. Constructor ile bu ozellikler Main'De
	//bir oyuncu tipinde obje olusturulucaksa eğer bu objeye atama yapılması gerektiğini zorunlu kıldık.
	//getterlar ile gereken yerlerde ozellikle baska paketlerin altında ozelliklerimin degerlerine erismeyi
	//Mumkun kıldım. Ben Gamer class'ımın ozelliklerine bu class'ın dısından bu paketin altında direkt olarak
	//erisebilirim ama baska bir paket altındayken ozelliklerime erisemem. Erismenin tek
	//yolu baska paketin icerisinde hangi class'ın altında bu class'ı kullanacaksam bu class'ı import etmek ve
	//getterlar ile bu class'ımın ozelliklerine erismek.
	
	String userName;
	String password;
	String email;
	int level;
	double experience;
	ArrayList<Games> games;
	
	public Gamer(String userName, String password, String email, int level, double experience, ArrayList<Games> games) {
		super();
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.level = level;
		this.experience = experience;
		this.games = games;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public int getLevel() {
		return level;
	}

	public double getExperience() {
		return experience;
	}

	public ArrayList<Games> getGames() {
		return games;
	}

}
