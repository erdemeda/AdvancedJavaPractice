package _08_While_DoWhile;

import java.util.Scanner;

public class Q12 {

    public static void main(String[] args) {
         /* TASK :
        Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.
         girilen sayı dahil
        */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen 0 dan büyük bir sayi giriniz:");
        int sayi=scan.nextInt();
        String sonuc="";
        if(sayi<=0) System.out.println("Hatalı giriş.");
        else {
            while(sayi>0) {
                if (sayi%2==1) {
                    sonuc=sonuc+(sayi+" ");
                    sayi--;
                }
                else sayi--;

            }
            System.out.println("Girilen sayıya kadar olan sayılardan tek olanları:"+sonuc);
        }
    }
}
