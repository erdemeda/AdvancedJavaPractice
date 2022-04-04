package _08_While_DoWhile;

import java.util.Scanner;

public class Q06 {


	public static void main(String[] args) {
		/*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

		Scanner scan = new Scanner(System.in);
		System.out.println("bolunen sayi");
		int bolunen=scan.nextInt();
		System.out.println("bolen sayi");
		int bolen=scan.nextInt();


           int i=0;
       while (bolen<=bolunen){
              bolunen=bolunen-bolen;
	            i++;
           }

	   System.out.println(" İşleminin sonucu : " + (i));


		/*int bolunen = 13;
		int bolen = 4;
		int kalan = bolunen;
		int sonuc = 0;

		while (kalan >= bolen) {
			kalan = kalan - bolen;
			sonuc++;
		}

		System.out.println(bolunen + " / " + bolen + " İşleminin sonucu : " + (sonuc));

*/



//ipucu:size bir ipucu: büyük sayidan kucuk sayiyi cikaracaksiniz,
// kalan=kucuk sayidan kucuk oluncaya kadar dongu dondururup boylece sayac sonucunda,
// buyuk sayi icersinde kucuk sayidan kac tane varsa ,
// bolme islemi yapmadan sonuca ulasmis olursunuz



	}

}


