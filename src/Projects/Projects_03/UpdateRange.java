package Projects.Projects_03;

import java.util.Arrays;

public class UpdateRange {


    /*

    Update a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */


   /*
        UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

   Örnek:

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
         */

    public static void main(String[] args) {

        int[] array = {1, 6, 12, 15, 22, 18, 30, 16};
        int sayi1 = 10;
        int sayi2 = 20;

        int sonHal[] = uRange(array, sayi1, sayi2);

        System.out.println(Arrays.toString(sonHal));



    }

    private static int[] uRange(int[] array, int sayi1, int sayi2) {
        int[] sonHal = new int[array.length];//array'in uzunlugu ile ayni uzunlukta sonHal arrayi olusturduk


        for (int i = 0; i <array.length ; i++) {

            if (sayi1 < sayi2) {
                if (sayi1 < array[i] && array[i] < sayi2) {//sayi1 ile sayi2 arasinda olmasi durumunda -1 degeri almasi saglandi
                    sonHal[i] = -1;
                } else {
                    sonHal[i] = array[i];//eger sayi1 ile sayi2 arasinda degilse arraydeki deger direk sonHal'aktarilacak
                }
            } else if (sayi2 < sayi1) {
                if (sayi2 < array[i] && array[i] < sayi1) {
                    sonHal[i] = -1;
                } else {
                    sonHal[i] = array[i];

                }
            }
        }
        return sonHal;
    }

}
