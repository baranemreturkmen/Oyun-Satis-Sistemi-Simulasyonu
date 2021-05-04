package GamerPackage;

import java.util.ArrayList;
import LoggerPackage.Logger;

public interface GamerManager {
	
	//Oyuncularımın sahip olduğu işlemleri yapacak olan classlar bu interface'i implemente edecek. Oyuncularım 
	//için yapmam gereken edevletten loglama işlemini yine bu interface'i implemente eden GamerManager classları
	//vasıtasıyla yapacağım.
	
	void addGamer(Gamer gamer);
	void updateGamer(Gamer gamer);
	void deleteGamer(Gamer gamer);
	void log(Gamer gamer,Logger logger,ArrayList<String> personalInformations);
	
}
