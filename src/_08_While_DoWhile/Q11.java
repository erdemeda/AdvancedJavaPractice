package _08_While_DoWhile;

import java.util.Scanner;

public class Q11 {

    /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */
    public static void main(String[] args) {

         Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi1=scan.nextInt();

                int i=1;
                boolean sonuc=false;

                while (i*i<=sayi1);{

                    if (i*i==sayi1)
                    { sonuc=true;}
            i++;

        }
        System.out.println(sonuc);

/*

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayi giriniz:");
        int sayi = scan.nextInt();
        int sayac=1;
        boolean kontrol=false;

        while (sayac * sayac <= sayi) {
            if (sayac * sayac == sayi) kontrol=true;
            sayac++;
        }
        System.out.println(kontrol);

*/

    }
}
