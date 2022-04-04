package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
            TASK :
            Kulanıcıdan aracının hızını alınız
            Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen ehliyetiniz varsa 1, ehliyetiniz yoksa 0 yazınız: ");
        int ehliyet = scan.nextInt();
        if (ehliyet == 0 || ehliyet == 1) {//ehlivetin varlık yokluk sartına göre diger kosullar çalışacak
            if (ehliyet == 0) {
                System.out.println("hızınızı sormadan kafadan bir 200$ kitledim size");
            }
            System.out.print("Lutfen hizinizi yaziniz: ");
            int hiz = scan.nextInt();

            if (ehliyet == 1) {
                if (hiz < 0) {
                    System.out.println("negatif hiz olmaz, hizinizi giriniz");
                } else if (hiz >= 55 && hiz < 75) {
                    System.out.println("Ceza 100 $'dır");
                } else if (hiz >= 75 && hiz < 85) {
                    System.out.println("Ceza 150 $'dır");
                } else if (hiz >= 85 && hiz < 95) {
                    System.out.println("Ceza 320 $'dır");
                } else if (hiz >= 95) {
                    System.out.println("Ceza 500 $'dır");
                } else {
                    System.out.println("hiz sinirinda seyehat ediyorsunuz hayirli yolculuklar");
                }

            } else if (ehliyet == 0) {
                if (hiz < 0) {
                    System.out.println("negatif hiz olmaz, hizinizi giriniz");
                } else if (hiz >= 55 && hiz < 75) {
                    System.out.println("Ceza 300 $'dır");
                } else if (hiz >= 75 && hiz < 85) {
                    System.out.println("Ceza 350 $'dır");
                } else if (hiz >= 85 && hiz < 95) {
                    System.out.println("Ceza 520 $'dır");
                } else if (hiz >= 95) {
                    System.out.println("Ceza 700 $'dır");
                } else {
                    System.out.println("hiz sinirinda seyehat ediyorsunuz ancak ehliyetsiz oldugunuz icin cezaniz 200$");
                }

            } else {
                System.out.println("lutfen ehliyet var mi yok mu yaziniz");
            }

        }
    }
}