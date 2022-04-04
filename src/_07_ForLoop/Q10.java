package _07_ForLoop;

import java.util.Scanner;

public class Q10 {
    /*
    Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
    değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
            1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)

    Sesli harfler: a,e,i,o,u

    Test Data:
    a

    Beklenen Çıktı:
    a harfi sesli harfdir.

    Test Data:
    d

    Beklenen Çıktı:
    d harfi sesiz harftir.

    Test Data:
    we  yada %

    Beklenen Çıktı:
    Yanlis karakter girdiniz!

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen bir harf giriniz:");

       String harf = scan.next().toLowerCase();


        String sesliHarfler="";
        String sessizHarfler="";


        for (char i = 'a'; i <='z' ; i++) {

            if (harf.charAt(0) == 'a' || harf.charAt(0) == 'e'  || harf.charAt(0) == 'i'
                    || harf.charAt(0) == 'o' ||  harf.charAt(0) == 'u')
                sesliHarfler += i;

            else
            sessizHarfler+=i;
            }


            if (sesliHarfler.contains(harf)){
                System.out.println(harf + " harfi sesli harftir ");
            }else if (sessizHarfler.contains(harf)){
                System.out.println(harf + " harfi sessiz harftir ");
            }else{
                System.out.println("Yanlis karakter girdiniz!");
            }


       /*
            Scanner scanner = new Scanner(System.in);
            System.out.print("lutfen harf giriniz : ");
            char harf = scanner.next().charAt(0);
            String sesliHarfler="aeiouAEIOU";
            for (int i = 0; i <sesliHarfler.length(); i++) {
                if (harf== sesliHarfler.charAt(i)) {
                    System.out.println("sesli harf");

                }else{
                    System.out.println("sessiz harf");

        */


    }

}


