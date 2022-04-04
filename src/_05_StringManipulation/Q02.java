package _05_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
       ad ayrı soyad ayrı sekilde ekrana yazdırınız.
       */

        Scanner scan=new Scanner(System.in);

        System.out.print("Isim ve soyisminizi bosluk birakarak giriniz: ");
        String isimSoyisim = scan.nextLine();
        if (isimSoyisim.contains(" ")) {
            String isim = isimSoyisim.substring(0, isimSoyisim.indexOf(" "));
            String soyisim = isimSoyisim.substring(isimSoyisim.indexOf(" ") + 1);
            System.out.println("Isim - Soyisim: " + isimSoyisim);
            System.out.println("Isim: " + isim);
            System.out.println("Soyisim: " + soyisim);
        } else System.out.println("lutfen isim ve soyisim arasinda bosluk birakiniz...");






    }
}
