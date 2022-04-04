package _08_While_DoWhile;

import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {
        // TASK :  kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.

        Scanner scan = new Scanner(System.in);
        int pin = 4321;
        int girilenpin=0;
        do {
            System.out.print("Lütfen pin kodu giriniz:");
            girilenpin = scan.nextInt();
            if(girilenpin!=pin) System.out.println("Girilen pin kodu hatalıdır.");
        }
        while (girilenpin != pin);
        System.out.println("Girilen pin kodu doğru.");


    }
}

