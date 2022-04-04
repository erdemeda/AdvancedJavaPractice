package _05_StringManipulation;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen  e-posta adresi giriniz");
        String isim=scan.nextLine();

        if (isim.contains("hotmail")){
            System.out.println(isim.replaceAll("hotmail","gmail"));
        }else{
            System.out.println("lutfen gmail adresi giriniz");
        }




    }
}
