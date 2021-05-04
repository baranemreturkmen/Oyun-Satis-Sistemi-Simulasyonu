package SalesPackage;

import java.util.ArrayList;

import GamerPackage.PremiumGamer;

public class SalesManagerCampaigns{
//KAMPANYALAR SADECE PREMIUMGAMER HAS OLDUGUNDAN SALESMANAGER'I IMPLEMENTE ETMIYOR
	
	//Bu class'ın altında oyuncuların kampanyalarla ilgili metodları bulunmaktadır. add ile kampanya ekleme
	//işlemi gerçekleştirikirken update ile kampanya güncelleme , delete ile kampanya silme işlemi gerçekleştirilecektir.
	//Oluşturulan CampaignValidation class'ı sayesinde oyuncuların sahip olduğu kampanyalara tekrar katılamaması 
	//sahip olmadıkları kampanyaları silememeleri ve güncelleyememeleri sağlanmıştır.
		
	//PremiumGamerValidation premiumGamerValidation = new PremiumGamerValidation();
	//yukaridaki sekilde ilerlersem bagimlilik var bundan dolayı kullandıgım GameValidation sınıfının 
	//altındaki isGame metodunu statik yaptım.
	
	//Neden bu class'Da tıpkı SalesManagerGames class'ı gibi SalesManager'ı implemente etmiyor.
	//Çünkü benim PremiumGamerlarım sadece kampanyalara sahipler. Bu bağlamda ben eğer SalesManager'ı
	//implemente edersem metodlarımda ki parametreler PremiumGamer tipinde olmak yerine Gamer tipinde olmalı.
	//Bu durumda benim FreeGamer tipinde ki kullanıclarım da çok rahat bir şekilde kampanyalara katılabilir.
	//Sistem FreeGamer tipindeki oyuncuların kampanyalara katılmalarını istemiyoruz. FreeGamer ve PremiumGamerların
	//ortak olarak alabileceği nesnelerin metodlarını bulunduran Manager classları için SalesManager oluşturuldu.
	//Eğer ileride sadece PremiumGamer tipinde oyuncular için yeni bir nesne çıkarsa sadece bu nesnelere has metodları
	//barındıran parametre olarak Gamer yerine PremiumGamer tipinde oyuncu alan bir PremiumSalesManager interface'i 
	//yaratılabilir ve bu classda bu interface'i implemente edebilir bu ihtiyaca göre ortaya çıkabilecek bir durum.
	
	public void add(PremiumGamer premiumGamer, Sales sales) {
		
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampayasına zaten sahip.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampayasına katıldı.");
		}
		
	}
	
	//addMultiple ile birden fazla kampanya ekleme imkanım oluyor.
	
	public void addMultiple(PremiumGamer premiumGamer,ArrayList<Campaigns> campaigns) {
		
		for (Campaigns campaign : campaigns) {
			add(premiumGamer,campaign);
		}
		
	}
		
	public void update(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" güncelledi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampanyasına sahip değil.");
		}
		
	}

	public void delete(PremiumGamer premiumGamer, Sales sales) {
		
		if(PremiumGamerValidation.isSame(premiumGamer, sales)==true) {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" sildi.");
		}
		else {
			System.out.println(premiumGamer.getUserName()+" kullanıcısı "+sales.name+" kampanyasına sahip değil.");
		}
	}

}
