package SalesPackage;

import GamerPackage.PremiumGamer;

public class PremiumGamerValidation {
	
	//Bu class SalesManagerCampaigns class'ının altında, oyuncu var olan bir kampanyaya ait işlemleri mi yapmaya çalışıyor,
	//yoksa olmayan yeni bir kampanyayı mı alıyor kontrolünü yapmamı sağlayan statik metodu bulundurudan class.
	//İleride sadece PremiumGamer oyuncu tipinin satın aldıgı başka bir obje için bu class'ın altında başka statik metodlar da 
	//oluşturulabilir.(Validation amaçlı sadece)
	///(Not: Bellekte kalıcı olduğu için çok fazla statik iyi değil bellek için metodlar artarsa
	//diye söylüyorum. Statik yapmamızın amacı SalesManagerGames'in altında GameValidation class'ını newleme işleminden
	//kaçınmak ve kodu kurtarmaktı.)
	
	
	PremiumGamer premiumGamer;
	
	
	public static boolean isSame(PremiumGamer premiumGamer,Sales sales) {
		boolean value = false;
		
		for (Campaigns campaign : premiumGamer.getCampaigns()) {
			if(sales.name == campaign.name) {
				value=true;
			}
		}
		return value;
	}

}
