package _08_While_DoWhile;

import java.util.Scanner;

public class Q01 {

    public static void main(String[] args) {
       /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */
        int sayininKupu =0;
        int basmakSayisi = 0;
        int num1 = 153;
        int geciciSayi = num1 ;
        int geciciSayi2 = num1 ;

        while (geciciSayi>0){        // verilen sayının kaç basamak oldugunu While döngüsü ile buluyoruz
            geciciSayi/=10;
            basmakSayisi++;
        }

        for (int i = 1; i <=basmakSayisi ; i++) {

            sayininKupu+= ((geciciSayi2%10) * (geciciSayi2%10) * (geciciSayi2%10)) ;
            geciciSayi2 = geciciSayi2/10;

        }

        System.out.print("Girilen sayi : " + num1 + " ");
        System.out.println( (sayininKupu==num1) ? "Amstrong sayıdır" : "Amstrong sayı değildir" );
    }

}
