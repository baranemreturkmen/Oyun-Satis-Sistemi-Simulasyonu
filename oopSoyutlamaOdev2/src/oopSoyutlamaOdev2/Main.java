package oopSoyutlamaOdev2;

import java.util.ArrayList;
import GamerPackage.FreeGamer;
import SalesPackage.Games;
import SalesPackage.SalesManagerCampaigns;
import GamerPackage.FreeGamerManager;
import GamerPackage.PremiumGamer;
import GamerPackage.PremiumGamerManager;
import LoggerPackage.EdevletLogger;
import SalesPackage.SalesManagerGames;
import SalesPackage.Campaigns;

public class Main {

	public static void main(String[] args) {
		
		//Oyun nesnelerimi Games class'ımı kullanarak olusturuyorum
		
		Games Witcher3 = new Games("Witcher 3",50);
		Games ForzaHorizon4 = new Games("Forza Horizon 4",90);
		Games BatmanArkhamKnight = new Games("BatmanArkhamKnight",70);
		Games Mafia2 = new Games("Mafia2",40);
		Games Mafia3 = new Games("Mafia3",60);
		Games GTA5 = new Games("GTA5",120);
		Games Dirt3 = new Games("Dirt3",20);
		Games Dirt4 = new Games("Dirt4",45);
		Games Dirt5 = new Games("Dirt5",80);
		
		//Oyuncu nesnelerimi olusturmadan once oyun nesnelerine sahip cesitli ArrayListler olusturuyorum
		//Cunku FreeGamer ve PremiumGamer tipinde olan oyuncularım bu ArrayListlere sahip olmalı. Bunun
		//sebebi su FreeGamer ve PremiumGamer classlari constructorlarinda Games objeleri tutan ArrayList
		//ozelligine sahipler.
		
		ArrayList<Games> race = new ArrayList<Games>();
		race.add(Dirt3);
		race.add(Dirt4);
		race.add(Dirt5);
		race.add(ForzaHorizon4);
		
		ArrayList<Games> openWorld = new ArrayList<Games>();
		openWorld.add(GTA5);
		openWorld.add(Mafia2);
		openWorld.add(Mafia3);
		
		ArrayList<Games> rolePlay = new ArrayList<Games>();
		rolePlay.add(Witcher3);
		rolePlay.add(BatmanArkhamKnight);
		
		ArrayList<Games> combined = new ArrayList<Games>();
		combined.add(GTA5);
		combined.add(Witcher3);
		combined.add(ForzaHorizon4);
		
		//Oyuncularımın isim, soy isim, tckn, dogum tarihi gibi bilgilerine edevletten loglama yontemi
		//ile ulasilacak. Bu durumu simule edebilmek adina oyucularimin bu bilgilerini tutan ArrayListler
		//olusturdum. Bu bilgilerin hepsi String veri tipinde olacagindan ArrayListlerimiz String degerler
		//tutacaklar.
		
		ArrayList<String> edevletInformationsEmre = new ArrayList<String>();
		edevletInformationsEmre.add("12345678901");
		edevletInformationsEmre.add("Baran Emre");
		edevletInformationsEmre.add("Türkmen");
		edevletInformationsEmre.add("31/07/1997");
		
		ArrayList<String> edevletInformationsEnes = new ArrayList<String>();
		edevletInformationsEnes.add("25745673451");
		edevletInformationsEnes.add("Enes Malik");
		edevletInformationsEnes.add("Türkmen");
		edevletInformationsEnes.add("31/07/2006");
		
		ArrayList<String> edevletInformationsMustafa = new ArrayList<String>();
		edevletInformationsMustafa.add("12345673451");
		edevletInformationsMustafa.add("Mustafa Cem");
		edevletInformationsMustafa.add("Gürbüz");
		edevletInformationsMustafa.add("01/12/1996");
		
		ArrayList<String> edevletInformationsOmer = new ArrayList<String>();
		edevletInformationsOmer.add("12347893451");
		edevletInformationsOmer.add("Ömer Fauk");
		edevletInformationsOmer.add("Demir");
		edevletInformationsOmer.add("11/09/2005");
		
		//Kampanya nesneleri olusturuyorum Campaigns class'ını kullanarak.
		
		Campaigns blackFriday = new Campaigns("Black Friday",60);
		Campaigns bigSummer = new Campaigns("Big Summer",40);
		Campaigns legendNovember = new Campaigns("Legend November",20);
		Campaigns bigWinter = new Campaigns("Big Winter",35);
		
		//Premium oyuncular cesitli kampanyalara sahipler ve bu kampanyaları PremiumGamer class'nın altında
		//Campaigns tipinde nesneleri tutan bir ArrayList'i ozellik olarak vererek tutmaya calistim. Bu 
		//ozellik PremiumGamer class'ında constructor'da setlendiginden dolayi Main'de PremiumGamer
		//tipinde oyuncular olusturmaya calistigimizda Campaigns objelerinden olusan bir ArrayList'e ihtiyac
		//duyacagiz. Bu yuzden Campaigns objeleri tutan cesitli ArrayListler olusturuyorum.
		
		ArrayList<Campaigns> seasonCampaigns = new ArrayList<Campaigns>();
		seasonCampaigns.add(bigWinter);
		seasonCampaigns.add(bigSummer);
		
		ArrayList<Campaigns> specialCampaigns = new ArrayList<Campaigns>();
		specialCampaigns.add(blackFriday);
		specialCampaigns.add(legendNovember);
		
		//Oyuncu nesnelerimi Gamer class'ını kullanarak olusturuyorum. Yukarıda oyuncu nesnelerim
		//icin gereken kampanyalar ve oyunlardan olusan ArrayListler'i olusturdum. Yine bu arraylistler
		//icin gereken oyun ve kampanya objeleri de olusturuldu. Bu kadar zahmetin sebebi elimizde 
		//data olmaması. Su an bu datayı ben kendim urettim. Gerekli objeleri ve yapilari kurarak.
		//Bu calismamda amacim tasarim desenlerini , classlari , interfaceleri ve bunlarin birbirleriyle
		//olan baglantilarini duzgun bir sekilde saglayarak odevde belirtilen isterleri saglamak adina
		//boyle bir yola gidildi.
		
		//İlk olarak 2 tane FreeGamer tipinde oyuncu olusturuyorum.
		
		FreeGamer emre = new FreeGamer("Silikon Valisi","1234","baranemre@...",7,3274.4,race);
		FreeGamer enes = new FreeGamer("Kıvırcık","45678","enes@...",2,4567,openWorld);
		
		//FreeGamerManager ile, olusturdugum 2 adet FreeManager tipindeki oyuncularıma ait islemler yapıyorum. 
		//Bu islemler add update delete tarzı islemler. (Odev icerigi geregi su an sadece simule ediyoruz.)
		
		FreeGamerManager freeGamerManager = new FreeGamerManager();
		
		
		System.out.println("Free Kullanıcı SilikonVadisi'ne ait  işlemler : ");
		
		freeGamerManager.addGamer(emre);
		freeGamerManager.deleteGamer(emre);
		freeGamerManager.updateGamer(emre);
		
		System.out.println("\n");
		System.out.println("Free Kullanıcı Kıvırcık'a ait  işlemler : ");
		
		freeGamerManager.addGamer(enes);
		freeGamerManager.deleteGamer(enes);
		freeGamerManager.updateGamer(enes);
		
		//FreeGamer tipindeki oyuncularımın bilgilerini edevletten loglama yaparak cekiyorum.
		
		System.out.println("\n");
		System.out.println("Free Kullanıcılara ait loglama işlemleri : ");
		
		freeGamerManager.log(emre,new EdevletLogger(), edevletInformationsEmre);
		freeGamerManager.log(enes,new EdevletLogger(), edevletInformationsEnes);
		
		//Yukarıda FreeGamerManager class'ı ile olsusturdugum freeGamerManager nesnesi ile istedigim kadar
		//FreeGamer tipindeki oyuncu icin ekleme silme guncelleme ve loglama islemleri yapabiliyorum.
		//İste burada nesne yonelimli programlamanın gucu ortaya cıkıyor ben FreeGamerManager class'ını 
		//bir kere newledim ve bu class'dan olusturdugum freeGamerManager nesnesi ile istedigim kadar FreeGamer
		//tipinde oyuncu icin cesitli islemleri yapabiliyorum.
		
		//2 tane PremiumGamer tipinde oyuncu olusturuyorum.
		
		PremiumGamer mustafa = new PremiumGamer("Mc","12345","mustafa@....",12,5034.2,rolePlay,seasonCampaigns);
		PremiumGamer omer = new PremiumGamer("ProGamer","002233","omer@....",12,5034.2,combined,specialCampaigns);
		
		//PremiumGamerManager ile, olusturdugum 2 adet PremiumManager tipindeki oyuncularıma ait islemler yapıyorum. 
		//Bu islemler add update delete tarzı islemler. (Odev icerigi geregi su an sadece simule ediyoruz.)
		
		PremiumGamerManager premiumGamerManager = new PremiumGamerManager();
		
		System.out.println("\n");
		System.out.println("Premium Kullanıcı Mc'ya ait  işlemler : ");
		
		premiumGamerManager.addGamer(mustafa);
		premiumGamerManager.deleteGamer(mustafa);
		premiumGamerManager.updateGamer(mustafa);
		
		System.out.println("\n");
		System.out.println("Premium Kullanıcı ProGamer'a ait  işlemler : ");
		
		premiumGamerManager.addGamer(omer);
		premiumGamerManager.deleteGamer(omer);
		premiumGamerManager.updateGamer(omer);
		
		//PremiumGamer tipindeki oyuncularımın bilgilerini edevletten loglama yaparak cekiyorum.
		
		System.out.println("\n");
		System.out.println("Premium Kullanıcılara ait loglama işlemleri : ");
		
		premiumGamerManager.log(mustafa,new EdevletLogger(), edevletInformationsMustafa);
		premiumGamerManager.log(mustafa,new EdevletLogger(), edevletInformationsOmer);
		
		//Oyucular için 2 adet ayrı Manager class'ıdan 2 adet ayrı obje olusturmak önemli. Çümkü
		//Eğer ileride PremiumGamer tipindeki oyunculara özel metodlar eklenmek istenirse sisteme
		//ben bu metodları premiumGamerManager üzerinden çağırabilecekken , aynı metodları freeGamerManager
		//üzerinden çağıramayacağım. Aynı durum freeGamerManager için de geçerli.
		
		
		//Yukarıda PremiumGamerManager class'ı ile olsusturdugum premiumGamerManager nesnesi ile istedigim kadar
		//PremiumGamer tipindeki oyuncu icin ekleme silme guncelleme ve loglama islemleri yapabiliyorum.
		//İste burada nesne yonelimli programlamanın gucu ortaya cıkıyor ben PremiumGamerManager class'ını 
		//bir kere newledim ve bu class'dan olusturdugum premiumGamerManager nesnesi ile istedigim kadar PremiumGamer
		//tipinde oyuncu icin cesitli islemleri yapabiliyorum.
		
		//Tüm oyuncularım icin ister FreeGamer tipinde olsun isterse de PremiumGamer tipinde olsun 
		//oyun satış işlemleri gerçekleştireceğim. 
		
		SalesManagerGames sellGame = new SalesManagerGames();
		
		System.out.println("\n");
		System.out.println("Free Kullanıcı SilikonValisi Oyun İşlemleri : ");
		
		sellGame.add(emre, BatmanArkhamKnight);
		sellGame.delete(emre, ForzaHorizon4); 
		sellGame.update(emre, ForzaHorizon4);
		
		//addMultiple metodu birden fazla oyunu ekleme imkanım oluyor.
		sellGame.addMultiple(emre, combined);
		
		System.out.println("\n");
		System.out.println("Free Kullanıcı Kıvırcık Oyun İşlemleri : ");
		
		sellGame.add(enes, Mafia2);
		sellGame.delete(enes, Mafia2); 
		sellGame.update(enes, Mafia2);

		//Premium oyuncular cesitli kampanyaları kullanarak indirimli oyunlar alabiliyorlar
		//Kampanya indirimlerini kullanarak imdirimli oyun alabilmek , oyun satışlarında 
		//kampanya entegrasyonu yapabilmek için SalesManagerGames altındaki add metodunda
		//metod overloading yaptık. 
		
		System.out.println("\n");
		System.out.println("Premium Kullanıcı Mc Oyun İşlemleri : ");
		
		//Oyuncu eger premium oyuncu ise oyuncuya oyun eklerken oyuncunun sahip oldugu kampanyaları kullanmalıyız. 
		//Ama eklenen oyun yukarıda Games class'ından turettigim oyunlardan biri olmalı. Sonucta oyuncuya sahip
		//olmadıgı bir oyun ekliyoruz ama kullandıgı kampanya oyuncunun kendisinde var olan bir kampanya bundan
		//dolayı oyuncunun kampanyasını alırken getter ile alıyoruz. Oyuncunun kampanyası getter ile bir ArrayList
		//olarak donuyor ben ArrayList'in icinden var olan kampanyalardan birinin kampanya oranını kullanmalıyım
		//bundan dolayı get(1) ile ArrayList'de olan bir kampanyayı alıyorum ve aldıgım kampanyanın oranını 
		//getCampaingRate() ile alıyorum. Bu yapıyı bu sekilde kullanabilmemin sebebi su benim PremiumGamer class'ıdan
		//turettigim mustafa adlı PremiumGamer tipinde ki oyuncu nesnenim ArrayList<Campaigns> campaigns diye bir ozelligi
		//var. Bu ArrayList'in elemanları Campaigns tipinde objeler. Campaings'in ise campaignsRate ozelliginin degerini
		//donduren getCampaingRate() diye bir metodu getter'ı var. Ben Campaigns class'ıdan objeler olusturmaya calisirken
		//campaignsRate degerini veritorum. Hatta bu ozellik constructor'da oldugu icin vermek zorundayım. Iste bu yapı sayesinde
		//campaignsRate degerini burada verebiliyorum.
		sellGame.add(mustafa, Witcher3,mustafa.getCampaigns().get(1).getCampaingRate());
		sellGame.delete(mustafa, Witcher3); 
		sellGame.update(mustafa, Witcher3);
		
		System.out.println("\n");
		System.out.println("Premium Kullanıcı ProGamer Oyun İşlemleri : ");
		
		sellGame.add(omer, GTA5,omer.getCampaigns().get(0).getCampaingRate());
		sellGame.delete(omer, Dirt4); 
		sellGame.update(omer, Dirt4);
		
		//addMultipleWithCampaign ile birden fazla oyunu kampanya ile ekleme imkanım oluyor.
		sellGame.addMultipleWithCampaign(omer, openWorld, omer.getCampaigns().get(1).getCampaingRate());
		
		//SalesManager class'ı ile premium kullanıcılarıma kampanya ekliyorum.
		
		SalesManagerCampaigns salesManagerCampaigns = new SalesManagerCampaigns();
		
		System.out.println("\n");
		System.out.println("Premium Kullanıcı Mc Kampanya İşlemleri : ");
		
		salesManagerCampaigns.add(mustafa, bigSummer);
		salesManagerCampaigns.update(mustafa, bigSummer);
		salesManagerCampaigns.delete(mustafa, bigSummer);
		
		//addMultiple metodu birden fazla kampanya ekleme imkanım oluyor.
		salesManagerCampaigns.addMultiple(mustafa, specialCampaigns);
		
		System.out.println("\n");
		System.out.println("Premium Kullanıcı ProGamer Kampanya İşlemleri : ");
		
		salesManagerCampaigns.add(omer, bigWinter);
		salesManagerCampaigns.update(omer, bigWinter);
		salesManagerCampaigns.delete(omer, bigWinter);
	}

}
