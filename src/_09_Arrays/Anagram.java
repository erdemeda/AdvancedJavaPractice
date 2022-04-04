package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram durumunu belirleyen  Java kodunu yazınız.
			isAnagram("listen", "Silent") ==> true
		 */

	}

}




/*
String kelime1 = "hasan";
		String kelime2 = "SnaAh";
​
​
		anagramMi(kelime1,kelime2);
​
​
	}//main method sonu
​
	private static void anagramMi(String kelime1, String kelime2) {
​
		String arr1[] = kelime1.split("");
		for (int i = 0; i <arr1.length ; i++) {
			arr1[i]=arr1[i].toLowerCase();
		}
		Arrays.sort(arr1);
​
​
		String arr2[] = kelime2.split("");
		for (int i = 0; i <arr2.length ; i++) {
			arr2[i]=arr2[i].toLowerCase();
		}
		Arrays.sort(arr2);
​
​
​
		if(arr1.length==arr2.length){
			boolean esitMi = true;
			for (int i=0; i<arr1.length ; i++) {
				if(!arr1[i].equals(arr2[i])){
					esitMi = false;
					break;
				}
			}
​
			if(esitMi){
				System.out.println("ANAGRAMDIR");
			} else System.out.println("anagram değildir...");
​
		}else System.out.println("Girilen kelimeler farklı sayıda karakter içerdiğinden anagram kontrolü sağlanamamaktadır");
		*/
