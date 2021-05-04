package SalesPackage;

public class Games extends Sales{
	
	//Sistemde satışı yapılacak olan oyunlar Sales class'ını extend ediyor. Games class'ının price gibi bir
	//ekstra özelliği var.
	
	double price;

	public Games(String name, double price) {
		super(name);
		this.price=price;
		
	}
	
	

}
