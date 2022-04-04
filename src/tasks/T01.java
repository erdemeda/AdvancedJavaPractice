package tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class T01 {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kelimeler arasında bosluk bırakacak sekilde bir cumle giriniz");

        String cumle=scan.nextLine();
        String kelime=LongestWord(cumle);

        System.out.println("cumledeki en uzun kelime: " + kelime);

        }

    private static String LongestWord(String cumle) {

        cumle = cumle.replaceAll("\\p{Punct}", "");

        String arr[] = cumle.split(" ");

        System.out.println(Arrays.toString(arr));
        String enUzunKelime = "";
        if (cumle.length() == 0) {
            System.out.println("Cumle girmediniz.Lutfen bir cumle giriniz");
        } else {

            enUzunKelime = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > enUzunKelime.length()) {

                    enUzunKelime = arr[i];
                }
            }
        }
        return enUzunKelime;
    }
}
