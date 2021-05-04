package GamerPackage;

import java.util.ArrayList;
import SalesPackage.Campaigns;
import SalesPackage.Games;

public class PremiumGamer extends Gamer{
	
	//Premium oyuncunun free oyuncudan farkı ekstra kampanyaları olması. Bunuda bir özellik olarak bu classda ekledik.
	//Bu arada constructor'ın altındaki super parametresi base class'ın constructor'ında bulununan ozellikler icin 
	//yapılan atama islemlerini yani set islemlerini otomatik olarak yapıyor. Geriye bu constructor'ın altında 
	//sadece bu class has olan özellik için set işlemi kaldı. Bu arada yine bu class'a has özellik için sadece
	//getter bulunduğuna dikkat edilsin çünkü base class'da olusturdugum getterlara Main'de PremiumGamer tipindeki
	//bir oyuncu objesi de ulaşabilir.
	
	ArrayList<Campaigns> campaigns;
	
	public PremiumGamer(String userName, String password, String email, int level, double experience, ArrayList<Games> games,ArrayList<Campaigns> campaigns) {
		super(userName, password, email, level, experience, games);
		this.campaigns=campaigns;
	}

	public ArrayList<Campaigns> getCampaigns() {
		return campaigns;
	}
	

	

}
