package _07_ForLoop;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /* TASK :
        Kullanicidan bir String isteyin. Kullanicinin girdigi
        String’in palindrome olup olmadigini kontrol eden bir program yazin.

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime = scan.nextLine();
        String terstenkelime="";

        for (int i = kelime.length()-1; i >=0; i--) {
            terstenkelime+=kelime.charAt(i);
            
        }
        System.out.println("girilen kelimenin ters hali : "+terstenkelime);
        
        if (terstenkelime.equalsIgnoreCase(kelime)){
            System.out.println("girilen kelime palindrome'dur");
        } else{
            System.out.println("girilen kelime palindrome degildir");
        }


        
    }

}

