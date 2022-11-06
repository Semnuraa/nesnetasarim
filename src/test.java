
public class test {

	public static void main(String[] args) {

		ogrenciler o1 = new ogrenciler("Sema Nur"); // ogrenciler sinifindan nesne olusturdum yemekkarti sinifindan miras
												// aliyor
		ogrenciler o2 = new ogrenciler("ahmet", 18); // - OverLoading - ogrenciler sinifindan nesne olusturdum
																// yemekkarti sinifindan miras aliyor
		akademisyenler a1 = new akademisyenler("Hüseyin Ahmetoğlu"); // akademisyen sinifindan nesne olusturdum yemek karti sinifindan
													// miras aliyor
		idariPersoneller i1 = new idariPersoneller(); // idariPersoneller sinifindan nesne olusturdum akademisyenden
														// miras aliyor

		i1.yemekKartiVarMi(); // yemek karti var mi test ettim
		a1.yemekKartiVarMi(); // yemek karti var mi test ettim
		o1.yemekKartiVarMi(); // yemek karti var mi test ettim

		o1.yemekKartiVer(); // o1 adli nesneye yemek karti verdim bakiye soruyor.
		o1.yemekKartiVarMi();
		o1.yemekAl(1); // o1. nesnesi yemek aliyor
		o1.yemekAl(4); // o1 nesnesi yemek aliyor
		o1.yemekAl(3); // o1 nesnesi yemek alacak fakat başlangic bakiyesi yetmiyor
		o1.bakiyeYukle(-150); // o1 nesnesine - bakiye yuklenmiyor
		o1.yemekAl(2); // o1 nesnesi yemek aliyor guncel bakiyeden dusuyor her seferinde
		o1.yemekAl(1);
		o1.yemekAl(4);
		o1.yemekAl(4); // bakiye bittigi icin bu islem gerceklesmedi

		o1.Selamver(); // o1 nesnesi yemek kartindan miras adigi selamver fonksiyonunu override edip
						// onu ezdi
		a1.Selamver(); // a1 nesnesi yemek kartindan miras adigi selamver fonksiyonunu override edip
						// onu ezdi

		o1.Selamver(i1); // ogrenci sinifindan akademisyen nesnesi olusturup fonksiyona akademisyen
							// sinifindan bir nesne yolluyor
							// ardindan o selamver fonksiyonu akademisyene ozel merhaba hocam nasilsiniz
							// sorusunu soruyor has - a ilişkisi

	}

}
