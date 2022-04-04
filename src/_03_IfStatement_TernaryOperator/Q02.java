package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q02 {

	public static void main(String[] args) {
	/*  TASK :
	 *  Kullanicidan 3 tene pozitif  tam sayi alniz. 
	 *  bu uc sayinin ucgen olusturma durumunu kontrol ediniz
	    eger ucgen olabiliyor ise, es kenar ucgen olma durumunu da  kontrol edniz

	    INFO :
	     üçgen olma sarti :herhangi iki kenar toplami diger kenardan büyük, herhangi iki kenar farkı diger kenardan büyük olmali
		 a+b>c>a-b
		 a+c>b>a-c  
	     b+c>a>b-c  
		a=b=c ise es kenar ucgen 
		 
	 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen 3 tane pozitif sayi giriniz");
        double a= scan.nextDouble();
        double b= scan.nextDouble();
        double c= scan.nextDouble();

if (a<0 || b<0 || c<0){
	System.out.println("lutfen pozitif tam sayi giriniz");
} else if ((a+b>c && c>a-b) && (a+c>b && b>a-c) && (b+c>a && a>b-c)){
	if (a==b && b==c)
	System.out.println("girdiginiz sayilar ucgen olusturabilir ve ucgeniniz eskenar ucgendir");
    else {
		System.out.println("girdiginiz sayilar ucgen olusturabilir");
	}
} else{
	System.out.println("girdiginiz sayilar ucgen olusturamaz");
}









	}

}
