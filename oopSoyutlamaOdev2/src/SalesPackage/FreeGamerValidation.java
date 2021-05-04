package SalesPackage;

import GamerPackage.Gamer;

public class FreeGamerValidation {
	
	//Bu class SalesManagerGames class'ının altında, oyuncu var olan bir oyuna ait işlemleri mi yapmaya çalışıyor,
	//yoksa olmayan yeni bir oyun mu alıyor kontrolünü yapmamı sağlayan statik metodu bulundurudan class.
	//İleride her 2 oyuncu tipinin satın aldıgı başka bir obje için bu class'ın altında başka statik metodlar da 
	//oluşturulabilir.(Validation amaçlı sadece)
	///(Not: Bellekte kalıcı olduğu için çok fazla statik iyi değil bellek için metodlar artarsa
	//diye söylüyorum. Statik yapmamızın amacı SalesManagerGames'in altında GameValidation class'ını newleme işleminden
	//kaçınmak ve kodu kurtarmaktı.)
	
	//PremiumGamerValidation adı altında bir tane daha validation class'ım var. Bunun sebebi de şu kampanyalar 
	//PremiumGamerlara özel odluğu için PremiumGamerValidation class'ıdan Gamer gamer parametresi yerine 
	//metodlarım PremiumGamer premiumGamer parametresini almalı.
	
	Gamer gamer;
	
	public static boolean isSameGame(Gamer gamer,Sales sales) {
		boolean value = false;
		
		for (Games game : gamer.getGames()) {
			if(sales.name == game.name) {
				value=true;
			}
		}
		return value;
	}

}
