package _07_ForLoop;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

        /* TASK :
        Girilen bir stringdeki a harfi sayısını bulunuz.
        ama  c harfine  gelirse döngüden çıkılsın

        Bugün hava oldukca güzel.-> 2
         str.CharAt(0)

         */
        String str="Bugün hava oldukca güzel.";
        String sonuc="";
        for (int i = 0; i <str.indexOf("c"); i++) {
            if (str.charAt(i) == 'a'){
                sonuc+=str.substring(i,i+1);
            }
        }
        System.out.println(sonuc);
        System.out.println("girilen cumlede c harfine kadar "+(sonuc.length())+ "tane a harfi vardir");

    }
}
