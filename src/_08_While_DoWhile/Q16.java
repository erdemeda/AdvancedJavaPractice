package _08_While_DoWhile;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.


        Scanner scan = new Scanner(System.in);
        String pin ="4321";
        String girilenpin="";
        int sayac=3;
        do {
            System.out.print("Lütfen pin kodu giriniz:");
            girilenpin = scan.nextLine();
            if (!girilenpin.equals(pin)) {
                System.out.println("Girilen pin kodu hatalıdır.");
                sayac--;
            } else {
                System.out.println("Girilen pin kodu doğru.");
                break;
            }
        }
        while (sayac>0);
        if (sayac==0) System.out.println("3 adet hatalı giriş yaptınız. Giriş hakkınız dolmuştur.");












    }
}
