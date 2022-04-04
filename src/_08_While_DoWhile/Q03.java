package _08_While_DoWhile;

import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
      /*   Kullanicidan 2 sayi alaliniz.
        1. sayi taban
        2. sayi Ust
        1 sayinin ussunu hesaplatan code create ediniz.
         3, 3  sonuc = 27

        2  3 = 2*2*2=8

       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Taban icin sayi giriniz");
        int taban=scan.nextInt();
        System.out.println("us icin sayi giriniz");
        int us=scan.nextInt();

        int uslusayi=1;
        for (int i = 0; i < us; i++) {
           uslusayi *=taban;
           
        }
        System.out.println("uslusayi = " + uslusayi);


       /* int i=0;
        int pow=1;
        while(i<num2) {
            pow*=num1;
            if(i==num2-1) {
                System.out.println(pow);
            }
            i++;
            }

*/
        }


    }



