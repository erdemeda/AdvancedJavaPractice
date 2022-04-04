package _07_ForLoop;

import java.util.Scanner;

public class Q04 {

    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan 5 adet sayı isteyiniz
        Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 5 adet sayi giriniz:");
        int toplam=0;
        for (int i = 0; i <5; i++) {
            int sayi1=scan.nextInt();
            if (sayi1<11 && sayi1>4) toplam=toplam;
            else toplam+=sayi1;
        }
        System.out.println("Toplam="+toplam);



        }

    }


