package _08_While_DoWhile;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        // TASK : GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.

       int sayi=66873;
        int i=0;
        int toplam=0;
        String sayison= String.valueOf(sayi);

while (i<=sayison.length()){
    toplam+=sayi%10;
    sayi/=10;
    i++;
}
        System.out.println("toplam = " + toplam);


    }

}
