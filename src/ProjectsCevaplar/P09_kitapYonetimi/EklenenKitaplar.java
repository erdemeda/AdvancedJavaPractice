package ProjectsCevaplar.P09_kitapYonetimi;

public class EklenenKitaplar {
	
	public int kitapNo;
	public String kitapAdi;
	public String yazarAdi;
	public int kitapFiyati;
	
	
	public EklenenKitaplar() {
		
	}
	
	
	public EklenenKitaplar (int kitapNo, String kitapAdı, String yazar, int kitapFiyatı) {
		this.kitapNo=Kitapcı_KitapEkle.count;
		this.kitapAdi=kitapAdı;
		this.yazarAdi=yazar;
		this.kitapFiyati=kitapFiyatı;
	}


}
