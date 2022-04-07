package Projects.P05_HalukMarket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class HalukMarketKendiCevabim {

    static List<Integer> no = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
    static List<String> urun = new ArrayList<>(Arrays.asList("Domates","Patates","Biber","Sogan","Havuc","Elma","Muz","Cilek","Kavun","Uzum","Limon"));
    static List<Double> fiyat = new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
    static double toplamOdenecekTutar;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

		/* Basarili Market alış-veriş programı.
		 *
		 * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
		 * 			No 	   Ürün 		  Fiyat
				   ====	 =======	 	=========
					00	 Domates   	 	 2.10 TL
					01	 Patates   	 	 3.20 TL
					02	 Biber     	 	 1.50 TL
					03	 Soğan      	 2.30 TL
					04	 Havuç     	   	 3.10 TL
					05	 Elma      	   	 1.20 TL
					06	 Muz     	 	 1.90 TL
					07	 Çilek 	 		 6.10 TL
					08	 Kavun      	 4.30 TL
					09	 Üzüm      	 	 2.70 TL
					10	 Limon     	 	 0.50 TL

		 * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
		 * 3. Adım: Kaç kg satın almak istediğini sorunuz.
		 * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
		 * 5. Başka bir ürün alıp almak istemediğini sorunuz.
		 * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
		 * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
		 */


        System.out.println("No    Ürün       Fiyat ");
        System.out.println("==========================");

        for (int i = 0; i < urun.size(); i++) {
            System.out.printf("%02d   %-10s  %02.2f\n",no.get(i),urun.get(i),fiyat.get(i));//urunlerin tablosu hazırlandı
        }

        alisverisDevam();
        kasa();


    }

    private static void alisverisDevam() {

        System.out.println("Lutfen urun no'suna gore almak istediginiz urunu secin");
        int secimNo=scan.nextInt();
        System.out.println("Sectiginiz urunden kac kg almak istediginizi yazin");
        double kg=scan.nextDouble();

        double urunTutari=fiyat.get(secimNo);
        double urunToplamTutar = kg * urunTutari;
        toplamOdenecekTutar += urunToplamTutar;//alınan her urun odemesi ana odemeye eklendi
        System.out.println(kg+" kg "+urun.get(secimNo)+" = "+urunToplamTutar+"\nToplam odeme miktari = "+toplamOdenecekTutar);

        System.out.println("Baska urun almak icin 1, kasaya gitmek icin 2 yazin.");
        int karar = scan.nextInt();
        if (karar == 1) {
            alisverisDevam();
        } else {
            kasa();
        }
    }

    private static void kasa(){

        System.out.println("alisverisinizin toplam tutari : " + toplamOdenecekTutar);
        System.out.println("Lutfen para girisi yapiniz");

        double odeme=scan.nextDouble();

        if (odeme>=toplamOdenecekTutar){
            System.out.println("para ustu: "+(odeme-toplamOdenecekTutar)+" tl");
        }else if (odeme<toplamOdenecekTutar){
            System.out.println((toplamOdenecekTutar-odeme)+" tl daha odeme yapmaniz gerekiyor");
        }else{
            System.out.println("Lutfen dogru odeme miktari giriniz");
        }

    }
}
