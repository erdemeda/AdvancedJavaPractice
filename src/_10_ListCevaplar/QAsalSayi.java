package _10_ListCevaplar;

import java.util.ArrayList;
import java.util.List;

public class QAsalSayi {

    /* TASK :
    100 den kucuk asal sayilari yazdiran bir code create ediniz.
     */
    public static void main(String[] args) {


        List<Integer> asalSayilar = new ArrayList<>();

        int sayi=2;
        int sayac=0;

        while (sayi<100){
            for (int i = 2; i <=sayi ; i++) {
                if (sayi%i==0) {
                    sayac++;
                }
            }
            if (sayac==1){
                asalSayilar.add(sayi);
          }
            sayac=0;
            sayi++;
        }
        System.out.println("100'den kucuk asal sayılar");
        System.out.println(asalSayilar);

    }
}
