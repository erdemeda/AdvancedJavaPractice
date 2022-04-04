package _08_While_DoWhile;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        //TASK :  Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.


        Scanner scan = new Scanner(System.in);
        int enbuyuksayi=0;
        int sayac=0;
        do{
            System.out.print("Lütfen bir sayi giriniz:");
            int sayi=scan.nextInt();

            if(sayi>=enbuyuksayi)
                enbuyuksayi = sayi;
            sayac++;
        }
        while(sayac<5);
        System.out.println("Girilen sayilardan en büyüğü:"+enbuyuksayi);





    }
}


