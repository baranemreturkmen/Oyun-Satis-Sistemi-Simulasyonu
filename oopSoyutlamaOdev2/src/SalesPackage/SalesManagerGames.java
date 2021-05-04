package SalesPackage;

import java.util.ArrayList;

import GamerPackage.Gamer;

public class SalesManagerGames implements SalesManager{
	
	//Bu class'ın altında oyuncuların oyunlarla ilgili metodları bulunmaktadır. add ile oyun satın alma 
	//işlemi gerçekleştirikirken update ile oyun güncelleme , delete ile oyun silme işlemi gerçekleştirilecektir.
	//Oluşturulan GameValidation class'ı sayesinde oyuncuların sahip olduğu oyunları tekrar satın alamaması 
	//sahip olmadıkları oyunları silememeleri ve güncelleyememeleri sağlanmıştır.
	
	//FreeGamerValidation freeGamerValidation = new FreeGamerValidation();
	//yukaridaki sekilde ilerlersem bagimlilik var bundan dolayı kullandıgım GameValidation sınıfının 
	//altındaki isGame metodunu statik yaptım.
	
	@Override
	public void add(Gamer gamer, Sales sales) {
		
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" 'e zaten sahip.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" satın aldı.");
		}
			
	}
	
	//addMultiple ile birden fazla oyunu ekleme imkanım oluyor. Eğer istenirse birden fazla oyun için silme 
	//güncelleme işlemleri aynı yöntem izlenerek metodlar oluşturulabilir.
	
	public void addMultiple(Gamer gamer,ArrayList<Games> games) {
		
		for (Games game : games) {
			add(gamer,game);
		}
		
	}
	
	//Kampayası olan PremiumGamerlar oyun satın alma işlemi yaparken sahip oldukları kampanyaları kullanabilsinler
	//diye oyun satın işleminin gerçekleştiği add metodunu overload ettim. Yukarıdaki add metodu ile FreeGamerlar
	//oyun satın alırken bu aşağıdaki add metodu sayesinde PremiumGamerlar kampanyalarını kullanarak oyun satın alabilecekler.
	
	public void add(Gamer gamer, Sales sales,double campaignRate) {
		// TODO Auto-generated method stub
		;
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" 'e zaten sahip.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanıcısı "+"%"+campaignRate+" indirimle "+sales.name+" satın aldı.");
		}
	}
	
	//addMultipleWithCampaign ile birden fazla oyunu kampanya ile ekleme imkanım oluyor.
	
	public void addMultipleWithCampaign(Gamer gamer,ArrayList<Games> games,double campaignRate) {
		
		for (Games game : games) {
			add(gamer,game,campaignRate);
		}
		
	}

	@Override
	public void update(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" güncelledi.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" sahip değil.");
		}
	}

	@Override
	public void delete(Gamer gamer, Sales sales) {
		// TODO Auto-generated method stub
		if(FreeGamerValidation.isSameGame(gamer, sales)==true) {
			System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" sildi.");
		}
		else {
			System.out.println(gamer.getUserName()+" kullanıcısı "+sales.name+" sahip değil.");
		}
	}

}
