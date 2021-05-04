package LoggerPackage;

import java.util.ArrayList;
import GamerPackage.Gamer;

public class EdevletLogger implements Logger{

	//Edevlet logger loglama işlemi bu class altında gerçekleştiriliyor.
	
	@Override
	public void log(Gamer gamer,ArrayList<String> personalInformations) {
		System.out.println(personalInformations+" bilgilerine sahip "+ gamer.getUserName()+" kullanıcısı loglandı.");
		
	}

}
