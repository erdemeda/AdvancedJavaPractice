package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		/* TASK :
		 * Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *  dort islemden biri ile isleme koyup sonucun yazdiriniz
		 */

Scanner scan=new Scanner(System.in);
		System.out.println("toplama icin 1\ncikarma icin 2\nbolme icin 3\ncarpma icin 4");

		int islem= scan.nextInt();

		System.out.println("Lutfen iki tam sayi giriniz");

		double num1= scan.nextDouble();
		double num2= scan.nextDouble();

		if (islem==1){
			System.out.println("toplama işleminin sonucu :" + num1 + " + " + num2 + " = " + (num1 + num2));
		}else if (islem==2){
			System.out.println("cikarma işleminin sonucu :" + num1 + " - " + num2 + " = " + (num1 - num2));
		}else if (islem==3){
			System.out.println("bolme işleminin sonucu :" + num1 + " / " + num2 + " = " + (num1 / num2));
		}else if (islem==3){
			System.out.println("carpma işleminin sonucu :" + num1 + " * " + num2 + " = " + (num1 * num2));
		}else {
			System.out.println("hatali secim yaptiniz tekrar deneyiniz");
		}




	}

}
