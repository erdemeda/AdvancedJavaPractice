package _07_ForLoop;

import java.util.Scanner;

public class Q18 {


    public static void main(String[] args) {

//        1                 i=1 j=1
//        2 3               i=2, j=1, j=2
//        4 5 6             i=3 j=1, j=2, j=3
//        7 8 9 10          i=4 j=1, j=2 , j=3, j=4
//        11 12 13 14 15
//        16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31 32 33 34 35 36

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz:");

        int sayi = scan.nextInt();
        int sayi2=1;
        for (int i = 1; i <=sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(sayi2+" ");
                sayi2++;
            }
            System.out.println("");
        }




    }
}
