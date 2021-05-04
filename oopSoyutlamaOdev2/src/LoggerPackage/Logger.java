package LoggerPackage;

import java.util.ArrayList;
import GamerPackage.Gamer;

public interface Logger {
	
	//Loglama işlemi yapan classlar bu interface'i implemente ederek loglama işlemini gerçekleştirecekler.
	
	void log(Gamer gamer,ArrayList<String> personalInformations);

}
