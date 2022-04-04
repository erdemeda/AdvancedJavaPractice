package tasks;

import java.util.Scanner;

public class T02 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        
        int sayi=scan.nextInt();
        
        int sayi1=ikininKuvveti(sayi);

        if( sayi1 ==1 )System.out.println("Girdiğiniz sayı 2 nin kuvvetidir.");
        else System.out.println("Girilen sayı 2 nin kuvveti değildir. ");
    }

    private static int ikininKuvveti(int sayi) {

            while (sayi%2==0 && sayi!=0){
                sayi/=2;
            }
        return sayi;
    }
}
