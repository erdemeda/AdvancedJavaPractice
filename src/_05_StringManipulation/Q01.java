package _05_StringManipulation;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        // TASK : Kullanıcıdan alacağınız bir stringde boşluk karakterinin
        // olup olmadığını kontrol ediniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle yazınız");
        String cumle=scan.nextLine();

        System.out.println(cumle.contains(" "));







    }
}

