package _05_StringManipulation;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
		/* TASK :
        Kullanicidan email girmesini isteyin
       @ isareti icermiyorsa "gecerli bir email girin" yazdirin
       @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
       @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
       ORNEK:
       INPUT : techproed.com OUTPUT : "gecerli bir email girin "
       INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
       INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
       */


        Scanner scan = new Scanner(System.in);
                System.out.print("email adresinizi giriniz: ");
               String eMail = scan.next();

if (!eMail.contains("@")) {
    System.out.println("gecerli bir email girin");
}else if (eMail.contains("@")){

    if ((eMail.substring(eMail.length()-9)).equals("gmail.com")){
        System.out.println("email onaylandi");
    }else {
        System.out.println("Lutfen gmail hesabinizi girin");
    }
}else {
    System.out.println("yanlis giris.lutfen gecerli bir email adresi giriniz");
}






    }

}
