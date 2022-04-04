package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QFibonacci {
     /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     1-1-2-3-5-8-13-21-34....
     */

    public static void main(String[] args) {



    }
}

/*
 List<Integer> fibonacci = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int input = scan.nextInt();
        fibonacci.add(1);
        fibonacci.add(1);
        int i = 1;
        if (input < 1) {
            System.out.println("Daha büyük tamsayı giriniz.");
        } else {
            while (fibonacci.get(i) < input) {
                fibonacci.add(fibonacci.get(i) + fibonacci.get(i - 1));
                i++;
            }
            if (input < fibonacci.get(fibonacci.size() - 1)) {
                fibonacci.remove(fibonacci.size() - 1);
                System.out.println("Girdiğiniz sayı fibonacci serisinde bulunmamaktadır.\n" + "Girilen sayıya kadar olan seri böyledir: " + fibonacci);
            } else System.out.println("Girdiğiniz sayı fibonacci serisinde bulunmaktadır: " + fibonacci);

 */