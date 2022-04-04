package _05_StringManipulation;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
         Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 3 kelimeden olusan isminizi yazınız");
        String isim=scan.nextLine().toUpperCase();

        System.out.println(isim.substring(0,1)+"."+
                           isim.substring(isim.indexOf(" ")+1,isim.indexOf(" ")+2)+"."+
                           isim.substring(isim.lastIndexOf(" ")+1,isim.lastIndexOf(" ")+2)+".");


    }
}
