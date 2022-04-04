package _08_While_DoWhile;

import java.util.Scanner;

public class Q13 {

    public static void main(String[] args) {
        /* TASK :
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan=new Scanner(System.in);
        System.out.print("Aldığınız ürünün birim fiyatını giriniz:");
        float fiyat=scan.nextFloat();
        System.out.print("Aldığınız ürün adedini giriniz:");
        int adet=scan.nextInt();
        System.out.println("Müşteri kartınız var mı: (Evet için:Y, Hayır için:N)");
        String kart= scan.next().toLowerCase();
        if(kart.equals("y")||kart.equals("n"))  {
            if(adet>10&&kart.equals("y")) System.out.println("%20 indirim kazandınız. Ödemeniz gereken tutar:"+(adet*fiyat*0.8));
            else if(adet>10&&kart.equals("n")) System.out.println("%15 indirim kazandınız. Ödemeniz gereken tutar:"+(adet*fiyat*0.85));
            else if(adet<=10&&kart.equals("y")) System.out.println("%15 indirim kazandınız. Ödemeniz gereken tutar:"+(adet*fiyat*0.85));
            else System.out.println("%10 indirim kazandınız. Ödemeniz gereken tutar:"+(adet*fiyat*0.9));
        }
        else System.out.println("Hatalı giriş");
    }
}
