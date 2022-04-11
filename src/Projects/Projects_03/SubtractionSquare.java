package Projects.Projects_03;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /*
   substSquare: bu method parametre olarak iki int alır ve  parametreleri getSumOfSquares methodu ile
    return edilen degerlerin toplamını  return eder.

  Örnek:
    int 1 = 10;
    int 2 = 5;
    3025 + 225 = 3250
    return 3250

   getSumOfSquares methodunu kullanarak Parametre sayıya kadar sayıları toplar ve toplamın karesini return eder.
   Örnek:
      int 1 = 10;              yazacağınız method 10 u kullanarak 3025 sonucu verir

  parametreleri kullanıcıdan alınız
    */
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen birinci sayiyi giriniz : ");
        int sayi1=scan.nextInt();
        System.out.print("Lutfen ikinci sayiyi giriniz : ");
        int sayi2=scan.nextInt();

        int karelerToplam= getSumOfSquares(sayi1,sayi2);

        System.out.println("sonuc = "+karelerToplam);

    }

    private static int getSumOfSquares(int sayi1, int sayi2) {

        int toplam1=0;
        int toplam2=0;

        for (int i = 0; i <= sayi1; i++) {
            toplam1+=i;
        }

        for (int i = 0; i <= sayi2; i++) {
            toplam2+=i;
        }
        int karelerToplam=toplam1*toplam1+toplam2*toplam2;

      return karelerToplam;
    }
}
