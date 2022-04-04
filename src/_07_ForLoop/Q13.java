package _07_ForLoop;

import java.util.Scanner;

public class Q13 {
	
	
	public static void main(String[] args) {
		
		/* TASK :
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

		Scanner scan = new Scanner(System.in);
		System.out.print("Lütfen bir cümle giriniz:");
		String cumle = scan.nextLine().toLowerCase();
		System.out.print("Lütfen bir harf giriniz:");
		String harf = scan.nextLine().toLowerCase();
		int numberofchar = 0;
		if (harf.length() > 1) System.out.println("Lütfen tek bir harf giriniz.");
		else if (harf.charAt(0) <'a' || harf.charAt(0)>'z') System.out.println("Lütfen bir harf giriniz.");
		else {
			for (int i = 999999999; i > 0; i--) {
				if (cumle.contains(harf.charAt(0) + "")) {
					cumle = cumle.replaceFirst(harf.charAt(0) + "", "");
					numberofchar++;
				} else i = 0;
			}
			System.out.println("Girdiğiniz cümlede " + harf + " harfi " + numberofchar + " kere kullanılmış.");
		}
		
		
	}

}
