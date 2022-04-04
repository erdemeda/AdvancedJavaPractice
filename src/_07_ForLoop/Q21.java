package _07_ForLoop;

import java.util.Scanner;

public class Q21 {

    public static void main(String[] args) {

        /* TASK : aşagıdaki şekli console'a yazdırınız

         *
         **
         **
         ***
         ****
         *****
         ******
         *******
         ********
         *********
         */


        /*
         *********
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *       */



        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*
         * * * * * * * * * * *
         * * * * * * * * *
         * * * * * * * *
         * * * * * * *
         * * * * * *
         * * * * *
         * * * *
         * * *
         * *
         *               */




        /*

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         * * * * * * *
         * * * * * * * *
         * * * * * * * * *
         */

       Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayi giriniz:");
        int sayi = scan.nextInt();
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j<=sayi+1-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j<=sayi+1-i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
