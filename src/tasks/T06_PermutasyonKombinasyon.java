package tasks;

import java.util.Scanner;

public class T06_PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci tam sayiyi giriniz : ");
        double sayi1= scan.nextDouble();
        System.out.print("Lutfen ikinci tam sayiyi giriniz : ");
        double sayi2= scan.nextDouble();

        double sayi1Faktoriyel=1;

        for (double i = 1; i <=sayi1 ; i++) {
            sayi1Faktoriyel*=i;

        }

        double sayi2Faktoriyel=1;
        for (double i = 1; i <=sayi2 ; i++) {
            sayi2Faktoriyel*=i;
        }
        
        
        double farkinFaktoriyeli=1;
        for (double i = 1; i <=(sayi1-sayi2) ; i++) {
            farkinFaktoriyeli*=i;

        }

        
          double kombinasyon=sayi1Faktoriyel/(sayi2Faktoriyel*farkinFaktoriyeli);
          double permutasyon=sayi1Faktoriyel/farkinFaktoriyeli;

        System.out.println("kombinasyon = " + kombinasyon);
        System.out.println("permutasyon = " + permutasyon);




    }
}
