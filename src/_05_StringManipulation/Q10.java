package _05_StringManipulation;
import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)

        Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim=scan.nextLine().toUpperCase();
        System.out.print("Lutfen soyisminizi giriniz : ");
        String soyisim=scan.nextLine().toUpperCase();
        System.out.print("Lutfen kredi kartı numaranızı giriniz : ");
        String kkNo= scan.nextLine();

        String yeniIsim=isim.substring(0,1)+isim.substring(1).replaceAll("\\S","*");
        String yeniSoyisim=soyisim.substring(0,1)+soyisim.substring(1).replaceAll("\\S","*");
        String yenikkNo=kkNo.substring(0,12).replaceAll("\\S","*")+kkNo.substring(12);

        if (kkNo.length()<16 ||kkNo.length()>16){
            System.out.println("Girisiniz gecersiz.Lutfen 16 haneli bir numara giriniz");}
else if (kkNo.length()==16){
            System.out.println("Ad : " + yeniIsim + "\nSoyad : " + yeniSoyisim + "\nkartNo : " + yenikkNo);
        }
else {
            System.out.println("yanlis giris yaptiniz.Lütfen tekrar deneyiniz");
        }










    }
}
