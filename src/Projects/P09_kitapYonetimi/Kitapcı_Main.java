package Projects.P09_kitapYonetimi;

import java.util.Scanner;

public class Kitapcı_Main {

	public static void main(String[] args) {

		/*
		 * ==================== PROJE==============================
		 * bir kitapci icin program yazalim kitap no 1000'den baslayacak sirali no olsun program
		 * baslayinca menu isminde bir method calissin
		 * 1-kitap ekle
		 * 2-numara ile kitap goruntule
		 * 3-bilgi ile kitap goruntule
		 * 4-numara ile kitap sil
		 * 5-tum kitaplari listele
		 * 6-cikis
		 ************************************
		 * 1.olarak her kitaba ait kitap no olacak, sonra kitap adi olacak, buna ait
		 * yazar adi olacak ve kitap fiyati olacak bu bilgilerin tutulacagi bir yer
		 * olmali yani bir list'te tutmamiz gerek
		 * 2-kitap numarasi 1000'den
		 * baslamali,her kitap eklendiginde bir artacagi icin sayac gibi dusunulebilinir
		 * count=1000; menu isminde bir method olusturmaliyim,
		 * 3-kitap ekle diye bir
		 * method olusturmliyim,bu method farkli bir classda
		 * 4-kullanicidn kitap adi
		 * yazar adi ve fiyat bilgileri istenmeli
		 */
		// Kitapcı_KitapEkle kitap = new Kitapcı_KitapEkle();

		Scanner scan = new Scanner(System.in);
		System.out.println("************ MENU ************");
		System.out.println("1-kitap ekle\n2-numara ile kitap goruntule" +
				"\n3-bilgi ile kitap goruntule\n4-numara ile kitap sil" +
				"\n5-tum kitaplari listele\n6-cikis\n******************************");
		System.out.println("Lutfen yukardaki bilgilere gore yapmak istediginiz islemin numarasini giriniz\nIslem yapmak istemiyorsaniz 0'a basiniz");
        int islem=scan.nextInt();





	}
}
/*
public class main extends Kitapci {

    public main(String kitapAdi, String yazarAdi, int kitapFiyatı, int kitapNo) {
        super(kitapAdi, yazarAdi, kitapFiyatı, kitapNo);
    }



    public static void main(String[] args) {



        mainMenu();


    }



    public static void mainMenu() {

        System.out.println("Lütfen yapmak istediğiniz işlemi belirtiniz.\n1.Kitap ekle\n2.No ile kitap görüntüle\n3.Bilgi ile kitap görüntüle\n4.No ile kitap sil\n5.Tüm kitapları listele\n6.Çıkış");
    int tercih=scan.nextInt();

    switch (tercih){

        case 1: kitapEkle();
            devamMenusu();break;

        case 2:kitapGoruntule();
            devamMenusu();break;
        case 3:bilgiIleKitapGoruntule();
            devamMenusu();break;
        case 4:kitapSilme();break;
        case 5:
            System.out.println("Kitaplığımızdaki kitapların listesi: ");

            if(kitaplarListesi.isEmpty()){
                System.out.println("Kitapçıda hiçbir kitap bulunmamakta.");
            }else {for (int i = 0; i <kitaplarListesi.size() ; i++) {System.out.println(kitaplarListesi.get(i).kitapAdi);}} devamMenusu();break;

        case 6:
            System.out.println("Hoşçakalın");

        default:
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyin." );

            mainMenu();


            }


            }



    private static void devamMenusu() {

        System.out.println("İşleminiz tamamlandı. Ana menuye donmek için 1'e, çıkmak için 2'e basınız.");

        int tercih2= scan.nextInt();

        switch (tercih2){

            case 1:mainMenu(); break;
            case 2:
                System.out.println("Hoşçakalın."); break;
            default:
                System.out.println("hatalı giriş yaptınız. lütfen yeniden deneyiniz.");
                devamMenusu(); break;

        }
    }
    }
 */