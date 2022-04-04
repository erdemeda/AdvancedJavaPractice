package _05_StringManipulation;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        // TASK : Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen4 harfli bir kelime yazınız");
        String kelime=scan.next();

        System.out.println(kelime.substring(3).toUpperCase()+
                           kelime.substring(2,3).toLowerCase()+
                           kelime.substring(1,2).toLowerCase()+
                           kelime.substring(0,1).toLowerCase()
                           );







    }
}
