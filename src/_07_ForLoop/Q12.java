package _07_ForLoop;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {

    /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */








        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen 1'den büyük bir tamsayı giriniz:");
        int sayi = scan.nextInt();
        int toplam = 0;
        if (sayi <= 0) System.out.println("Hatalı giriş");
        else {
            for (int i = 1; i <= sayi; i++) {
                toplam = i * i + toplam;
            }
            System.out.println("1'den girilen tam sayıya kadar olan sayıların karelerinin toplamı: " + toplam);



        }

    }
}
