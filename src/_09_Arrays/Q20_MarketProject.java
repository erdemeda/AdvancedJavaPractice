package _09_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Q20_MarketProject {

        /*
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları
         *           tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         * */

    public static int gunSayisi = 7;
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>();
    static ArrayList<String> gunler = new ArrayList<>();

    public static void main(String[] args) {


        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("carsamba");
        gunler.add("persembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gunluk kazanclarinizi giriniz");

        int i = 1;

        while (i <= gunSayisi) {

            gunlukKazanclar.add(scanner.nextDouble());
            i++;
        }

        System.out.println(getOrtalamaKazanc());
        System.out.println(getOrtalamaninUstundeKazancGunleri());
        System.out.println(getOrtalamaninAltindaKazancGünleri());

    }

    public static String getOrtalamaninAltindaKazancGünleri() {
        int idx = 0;
        String ortalamaninAltindakiler = "";
        for (double w : gunlukKazanclar) {

            if (gunlukKazanclar.get(idx) < getOrtalamaKazanc()) {

                ortalamaninAltindakiler += gunler.get(idx) + " ";
            }
            idx++;
        }
        return ortalamaninAltindakiler;
    }


    public static String getOrtalamaninUstundeKazancGunleri() {
        int idx = 0;
        String ortalamaninUstundekiler = "";
        for (double w : gunlukKazanclar) {

            if (gunlukKazanclar.get(idx) > getOrtalamaKazanc()) {

                ortalamaninUstundekiler += gunler.get(idx) + " ";
            }
            idx++;
        }
        return ortalamaninUstundekiler;
    }

    public static double getOrtalamaKazanc() {
        double ortalama = 0;
        double toplam = 0;

        for (double w : gunlukKazanclar) {

            toplam += w;
        }
        ortalama = toplam / gunSayisi;

        return ortalama;


    }
}
