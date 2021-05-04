package SalesPackage;

import GamerPackage.Gamer;

public interface SalesManager {
	
	//Oyunculara ait nesnelerin satış işlemleri bu interface'i implemente eden classlar sayesinde gerçekleşecek.
	
	void add(Gamer gamer,Sales sales);
	void update(Gamer gamer,Sales sales);
	void delete(Gamer gamer,Sales sales);

}
