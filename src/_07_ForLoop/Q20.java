package _07_ForLoop;

import java.util.Scanner;

public class Q20 {
    /*
     * SORU 1 Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak
     * Bölen) ve LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40
     * Beklenen Cikti: 30 ve 40 icin EBOB = 10 30 ve 40 icin EKOK = 120
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen iki adet pozitif tam sayı giriniz:");
        int ebob = 0;
        int ekok = 0;
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();
        if (sayi1 <= 0 || sayi2 <= 0) System.out.println("Hatalı giriş");
        else {
            if (sayi1 >= sayi2) {
                for (int i = 1; i <= sayi2; i++) {
                    if (sayi1 % i == 0 && sayi2 % i == 0) ebob = i;
                }
            } else {
                for (int i = 1; i <= sayi1; i++) {
                    if (sayi1 % i == 0 && sayi2 % i == 0) ebob = i;
                }
            }
        }
        ekok=sayi1*sayi2/ebob;
        System.out.println(sayi1+" ve "+sayi2+" için: \nEBOB="+ebob+"\nEKOK="+ekok);


    }
}
