package _08_While_DoWhile;

import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */


        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen faktöriyelinin hesaplanmasını istediğiniz sayiyi giriniz:");
        int sayi = scan.nextInt();
        if (sayi < 0) System.out.println("Sayi 0 dan küçük olamaz.");
        else if (sayi == 0) System.out.println("1*1=1");
        else {
            String bildirim = "";
            int sonuc = 1;
            while (sayi >= 1) {
                sonuc *= sayi;
                if (sayi == 1) bildirim += sayi + "";
                else bildirim += sayi + "*";
                sayi--;
            }
            System.out.println(bildirim + "=" + sonuc);
        }



    }
}


