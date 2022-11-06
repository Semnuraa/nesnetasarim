
public class akademisyenler extends YemekKarti { 

	 /* 
	 akademisyenler sinifi olusturup yemekkartindan miras alarak is-a iliskisi kurdum
	  selam ver fonksiyonu yazdim yemekkarti sinifindan miras aldigi icin
	 override olmus oldu yani miras aldigi fonksiyonu ezdi ve extradan bir tane isim tanimladim
	 */

	static String name;

	@Override
	void Selamver() { 
		System.out.println("Merhaba akademisyenler sinifina hosgeldiniz " + name);
	}

	
}
