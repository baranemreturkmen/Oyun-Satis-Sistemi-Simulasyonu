package SalesPackage;

public class Campaigns extends Sales{
	
	//Sistemde oyucularımın sahip olduğu kampanyalar Sales class'ını extend ediyor. Campaigns class'ının campaignRate 
	//gibi bir ekstra özelliği var.
	
	double campaingRate;
	
	public Campaigns(String name,double campaignRate) {
		super(name);
		this.campaingRate=campaignRate;
	}

	public double getCampaingRate() {
		return campaingRate;
	}

	

}
