package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*  TASK :
		 *  Kullanicidan IT alanini bilgisini alarak console'a
		 *  meslegi = qa ==> Quality Analyst
		             dev ==> Developer
					  ba ==> Busines Analyst
				 	  pm ==> Project Manager
		bilgilileri yazdiriniz
		 */
        Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen IT alan bilginizi giriniz");
		String alan=scan.next().toLowerCase();


switch(alan){
	case "qa":
		System.out.println("Quality Analyst");
		break;
	case "dev":
		System.out.println("Developer");
		break;
	case "ba":
		System.out.println("Busines Analyst");
		break;
	case "pm":
		System.out.println("Project Manager");
		break;
	default:
		System.out.println("Lütfen gecerli bir alan bilgisi giriniz");
}










	}

}
