package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		/*
		TASK :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */

        Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen yasinizi ve kilonuzu giriniz");
		double yas= scan.nextDouble();
		double kilo= scan.nextDouble();

if (0>yas || yas<18){
	System.out.println("kan bagisi yapamazsiniz");
} else if (yas>=18){
	if (0>kilo || kilo<50){
		System.out.println("kan bagisi yapamazsiniz");
	} else if(kilo>=50){
		System.out.println("kan bagisi yapabilirsiniz");
	}
} else {
	System.out.println("Lutfen uygun yas ve kilo giriniz");
}


















}

	}

