package _08_While_DoWhile;

import java.util.Scanner;

public class Q07 {

    public static void main(String[] args) {
      /* TASK :
       Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan
        ve x girildiğinde ise "Program bitti" yazan programı yazınız.

*/

        Scanner scan = new Scanner(System.in);
        String str=" ";
        do {
            System.out.println("herhangi bir karakter giriniz");
            str=scan.nextLine().toLowerCase();

            if(str.charAt(0)=='x' ) {
                System.out.println("program bitti");
        }

        }while (str.charAt(0)!='x' );


    }
}
   /* Scanner scan = new Scanner(System.in);
    String str=" ";
        while(true) {
                System.out.println("x disinda herhangi bir karaktere basiniz");
                str=scan.nextLine().trim();
                if(str.charAt(0)=='x' || str.charAt(0)=='X') {
                System.out.println("program bitti");
                break;
                }
                System.out.println("Program cincik gibi calisiyor");*/