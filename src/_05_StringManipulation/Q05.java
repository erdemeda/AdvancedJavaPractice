package _05_StringManipulation;

public class Q05 {
    public static void main(String[] args) {
    /*
        TASK :
        String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
        String  str 1= %13.99
        String str 2= %10.55
        ipucu: Double.parseDouble() methodunu kullanabilirsiniz.

     */
        String str1 = "$13,99";
        String str2 = "$10,55";

        str1=str1.replaceAll("\\D","");//ama String olarak
        str2=str2.replaceAll("\\D","");//ama String olarak

        double str1Sayi=Double.valueOf(str1);
        double str2Sayi=Double.valueOf(str2);

        double sonuc=(str1Sayi+str2Sayi)/100;
        System.out.println("verilen String sayilarin toplami : $"+sonuc);









    }
}
