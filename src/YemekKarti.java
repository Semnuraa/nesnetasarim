import java.util.Scanner;

public class YemekKarti {
	/*
	 * yemek karti sinifi tanimlayip burada fonksiyonlari yazdim ardindan diger
	 * siniflara miras verdim bu sinifi fonksiyonlari yazip miras birakmak icin
	 * kullandim
	 */

	int pizza = 20;
	int borek = 25;
	void yemekKartiVer() {
	
		if (kart == true) {
			System.out.println("yemek karti zaten vardir");
			kart = true;
		}
		try {
			if (kart == false) {
	
				System.out.print("bakiye yukleyeceksen 1 yaz ");
				int temp = scan.nextInt();
				if (temp == 1) {
					System.out.print("Ne kadar yuklemek istiyorsunuz: ");
					int bakiye1 = scan.nextInt();
					if (100 <= bakiye1) {
						this.bakiye = bakiye1;
						kart = true;
					}
				}
	
				else {
					System.out.println("100 Tl hesaba otomatik yuklenmistir");
					this.bakiye = 100;
					kart = true;
				}
	
			}
	
		} catch (Exception e) {
			System.out.println("tam sayi girmediginiz icin sonlandi");
		}
	
	}

	int corba = 150;
	int bakiye;
	boolean kart;
	int manti = 15;
	Scanner scan = new Scanner(System.in);

	void Selamver() {
		System.out.println("Merhaba yemek sinifina hosgeldiniz ");
	}

	void yemekKartiVarMi() {
		if (kart == true) {
			System.out.println("Yemek karti vardir");
		} else {
			System.out.println("Yemek karti yoktur");
		}
	}

	void yemekAl(int n) {
		if (n == 1) {
			if (this.bakiye >= pizza) {
				this.bakiye = bakiye - pizza;
				System.out.println("Pizza aldiniz 20tl = yeni bakiyeniz " + this.bakiye);
			} else {
				System.out.println("Satin alamadiniz kalan bakiye " + bakiye);
			}
		} else if (n == 2) {
			if (this.bakiye >= borek) {
				this.bakiye = bakiye - borek;
				System.out.println("borek aldiniz 25 tl = yeni bakiyeniz " + this.bakiye);

			} else {
				System.out.println("Satin alamadiniz kalan bakiye " + bakiye);
			}
		} else if (n == 3) {
			if (this.bakiye >= corba) {
				this.bakiye = bakiye - corba;
				System.out.println("Corba aldiniz 150 tl = yeni bakiyeniz " + this.bakiye);

			} else {
				System.out.println("Satin alamadiniz kalan bakiye " + bakiye);
			}
		} else if (n == 4) {
			if (this.bakiye >= manti) {
				this.bakiye = bakiye - manti;
				System.out.println("manti aldiniz 15 tl = yeni bakiyeniz " + this.bakiye);

			} else {
				System.out.println("Satin alamadiniz bakiyeniz kalan bakiye " + bakiye);
			}
		} else {
			System.out.println("Hatali");
		}
	}

	void bakiyeYukle(int yeniBakiye) {
		if (bakiye >= 0) {
			System.out.println("Negatif bakiye yuklenmez");
		} else {
			bakiye = bakiye + yeniBakiye;
			System.out.println("Yeni bakiyeniz " + bakiye);
		}

	}

}
