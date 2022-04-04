package _05_StringManipulation;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  3 harfli bir isim giriniz");
        String isim=scan.next().toUpperCase();


        String sonuc= isim.substring(0,1).equals(isim.substring(1,2)) || isim.substring(1,2).equals(isim.substring(2))
                ||isim.substring(0,1).equals(isim.substring(2)) ? "ayni" : "farkli";

        System.out.println("sonuc = " + sonuc);







    }
}