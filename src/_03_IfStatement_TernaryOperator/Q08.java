package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q08 {
	/*
	 * TASK :

	 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
	 * musteri karti olup olmadigini sorun
	 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
	 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
	 * alirsa %10 indirim yapan code create ediniz.
	 */
	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("Aldiginiz urunun adedini giriniz");
		int adet=scan.nextInt();
		System.out.println("Aldiginiz urunun fiyatini giriniz");
		double fiyat=scan.nextDouble();
		System.out.println("Musteri kartinizvarsa'E' , yoksa'H' yaziniz");
		char kart=scan.next().toUpperCase().charAt(0);

if (kart=='E'){
	if (adet>10){
		System.out.println("%20 indirim kazandiniz yeni fiyat="+ (fiyat-0.2*fiyat));
	}else {
		System.out.println("%15 indirim kazandiniz yeni fiyat="+ (fiyat-0.15*fiyat));}

} else if (kart=='H'){
	if (adet>10){
		System.out.println("%15 indirim kazandiniz yeni fiyat="+ (fiyat-0.15*fiyat));
	}else {
		System.out.println("%10 indirim kazandiniz yeni fiyat= "+ (fiyat-0.1*fiyat));}
} else{
	System.out.println("Lütfen gecerli biligi giriniz");
}






	}

}
