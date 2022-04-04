package _09_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	/* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */
	public static void main(String[] args) {


		Scanner scan=new Scanner(System.in);
		System.out.print("Lutfen olusturalacak array eleman sayisini giriniz : ");
		int elemanSayisi=scan.nextInt();
		int arr[]=new int[elemanSayisi];

		for (int i = 0; i <elemanSayisi ; i++) {

			System.out.print("Lutfen "+ (i+1)+". sayiyi giriniz : ");
			arr[i]=scan.nextInt();
		}
		System.out.println("");
		Arrays.sort(arr);
		System.out.println("girdiginiz sayilardan en buyuk sayi ile en kucuk sayı arasındaki fark = "+(arr[elemanSayisi-1]-arr[0]));




	}

}
