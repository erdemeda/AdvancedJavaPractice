package tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {
    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */


        int rastgeleSayi = new Random().nextInt(101);
        System.out.println(rastgeleSayi);

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 1 ile 100 arasinda bir tam sayi giriniz");
        int sayi=scan.nextInt();


        do {

            if (sayi<rastgeleSayi){
                System.out.println("Lutfen daha buyuk bir sayi giriniz");
                sayi= scan.nextInt();
            }else if (sayi>rastgeleSayi){
                System.out.println("Lutfen daha kucuk bir sayi giriniz");
                sayi= scan.nextInt();
            }

        } while (sayi!=rastgeleSayi);
            System.out.println("Dogru tahmin, TEBRİKLER..:)");










    }
}
