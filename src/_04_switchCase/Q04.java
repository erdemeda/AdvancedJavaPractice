package _04_switchCase;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı göre 100 gün sonra hangi gün olduğunuz yazdırınız.
        // pazartesi hafta baslangıcı

        Scanner scan=new Scanner(System.in);
        System.out.println("pazartesi: 1\nSali: 2\nCarsamba: " +
                "3\nPersembe: 4\nCuma: 5\nCumartesi: 6\nPazar: 7\nHaftanin kacinci gununde oldugunuzu giriniz: ");

int kacinciGun= scan.nextInt();
        System.out.println("kac gun sonrasını ogrenmek ıstıyorsunuz");
int kacGunSonrası=scan.nextInt();
        int bulunanGun=(kacGunSonrası+kacinciGun)%7;

        if (kacinciGun<=0 || kacinciGun<8) {System.out.println("hatali veri girdiniz");
        }else {


            switch (bulunanGun) {
                case 1:
                    System.out.println("gun sonra gunlerden PAZARTESI");
                    break;
                case 2:
                    System.out.println("gun sonra gunlerden SALI");
                    break;
                case 3:
                    System.out.println("gun sonra gunlerden CARSAMBA");
                    break;
                case 4:
                    System.out.println("gun sonra gunlerden PERSEMBE");
                    break;
                case 5:
                    System.out.println("gun sonra gunlerden CUMA");
                    break;
                case 6:
                    System.out.println("gun sonra gunlerden CUMARTESI");
                    break;
                case 0:
                    System.out.println("gun sonra gunlerden PAZAR");
                    break;
                default:
                    System.out.println("hafte 7 gun lutfen dogru gun gırınız");
            }
        }











    }
}

