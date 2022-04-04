package tasks;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;




public class T03_KelimeOyunu {
    static Scanner scan = new Scanner(System.in);
    static int oyuncu = 1;
    //static int oyuncu2=2;
    static String kelime;
    static String ekleme;
    static int puan1;
    static int puan2;
    static List<String> kelimeekle = new ArrayList<>();

    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1.Adım- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2.Adım- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * 2. oyuncu Eger kelimeyi kabul ederse  1.oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve hangi  oyuncunun
     *        kazandigini yazip oyunu bitirin.
     *
     * 3.Adım- 2. oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    public static void main(String[] args) {

        System.out.println("Lutfen bir kelime giriniz");
        kelime = scan.nextLine();
        System.out.println(kelime);
        kelimeekle.add(kelime);
        ikinciAdim();

    }

    private static void ikinciAdim() {
        System.out.println("eger girilen kelimeyi kabul ediyorsaniz 1'e,\ngirilen kelimeyi kabul etmiyorsaniz 2'ye basiniz");
        int kabul=scan.nextInt();

        if (kabul==1){
            puan1 +=kelime.length();
            System.out.println("kelime dogru puaniniz : "+puan1+" oldu");
            ucuncuAdim();
        }
        else{
            System.out.println("gecersiz kelime");
        }

        }

    private static void ucuncuAdim() {
    System.out.println("Oyuna devam etmek istiyor musunuz?\nDevam etmek icin-->1'e\nDevam etmek istemezseniz-->2'ye basiniz");
        int devam=scan.nextInt();
        if (devam==1){
            System.out.println("Kelimenin basina ekleme yapacaksaniz 'B',\nsonuna  ekleme yapacaksiniz 'S' yaziniz");
            String tercih= String.valueOf(scan.next().charAt(0));
            if (tercih.equalsIgnoreCase("B")){
                System.out.println("Lutfen ekleyeceginiz kelimeyi giriniz");
              String ekleme=scan.next();
           kelimeekle.add(0,ekleme);
                System.out.println("yeni kelime : "+kelimeekle);
            }else if (tercih.equalsIgnoreCase("S")){
                System.out.println("Lutfen ekleyeceginiz kelimeyi giriniz");
                String ekleme=scan.next();
                kelimeekle.add(ekleme);
                System.out.println("yeni kelime : "+kelimeekle);
            }
            ikinciAdim();

    }else if (devam==2){
            System.out.println( "Oyun bitti toplam puan : "+ puan1);
        }





}
}


// static List<String> urunListesi = new ArrayList<>(Arrays.asList("domat - urun kodu : 1","elma - urun kodu : 2","muz - urun kodu : 3",
//            "biber - urun kodu : 4", "balcan - urun kodu : 5" ));//urunlerin atanacagi bos list
//    static List<Double> urunFiyatlari = new ArrayList<>(Arrays.asList(5.0,7.5,1.3,8.7,9.2));//urun fiyatlarinin atanacagi bos list
//