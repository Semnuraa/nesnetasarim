
public class idariPersoneller extends akademisyenler {
	
	 /* 
		idariPersoneller sinifi akademisyenlerden miras aliyor - akademisyenler ise yemek kartindan miras
		aldigi icin coklu kalitim kullanmis oldum extradan burada da const. tanimladim ardindan ise override selamver
		fonksiyonu yazdim 
	 */

	public idariPersoneller() {
		// bos const varsayilan calismadi
	}
	public idariPersoneller(String name) {
		this.name = name;
		System.out.println("Idari personel olusturuldu");
	}
	
	@Override
	void Selamver() {
		System.out.println("Merhaba yemek sinifina hosgeldiniz " + name);
	}

}
