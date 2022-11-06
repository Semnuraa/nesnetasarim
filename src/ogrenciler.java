
public class ogrenciler extends YemekKarti // kalitim is - a
{
	 /* 
		ogrenciler sinifi yemekkarti sinifindan is-a kalitim yaptim ve akademisyen sinifindan
		bir nesne yaratarak onu kullandim ve has - a iliskisi de kurmus oldum 
	 */


	static String name;
	int no;
	akademisyenler akademisyen; // has a iliskisi

	ogrenciler() {
		System.out.println("Ogrenci nesnesi olusturuldu " + name);
	}

	ogrenciler(String name) {
		this.name = name;
		System.out.println(ogrenciler.name + " adinda nesne olusturuldu");

	}

	ogrenciler(String name, int no) {
		this.name = name;
		this.no = no;
		System.out.println(ogrenciler.name + " adinda nesne olusturuldu");
	}

	@Override
	void Selamver() {
		System.out.println("Merhaba ogrenciler sinifina hosgeldin " + ogrenciler.name);
	}

	// Overload
	void Selamver(akademisyenler akademisyen) {
		System.out.println("Merhaba " + akademisyenler.name + " hocam nasilsiniz");
	}

}
