package _08_While_DoWhile;

import java.util.Scanner;

public class Q02 {

    public static void main(String[] args) {
        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz


        Scanner scan = new Scanner(System.in);
        System.out.println("Kelime giriniz");
        String str=scan.next();

        int i=0;
        while(i<str.length()) {

            if(i%2!=0) {
                System.out.println("Tek sayi indexli harfler:"+ str.charAt(i) + " , ");
            }

            i++;
        }

    }

}
