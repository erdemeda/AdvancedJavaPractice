package _04_switchCase;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {

// Girilen bir ay numarasına göre , ayın kaç gün olduğunu sayı ile yazdırınız


        Scanner scan=new Scanner(System.in);
        System.out.println("yilin kacinci ayini ogrenmek istiyorsunuz: ");
        int ay= scan.nextInt();

        switch (ay){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girdiginiz ay 31 gun");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girdiginiz ay 30 gun");
                break;
            case 2:
                System.out.println("Lutfen bulundugunuz yili giriniz: ");
                int yil=scan.nextInt();
                if (yil%4==0){
                    System.out.println("girdiginiz ay 29 gun");
                }else{System.out.println("girdiginiz ay 28 gun");}
                break;
            default:System.out.println("yil 12 aydir. lutfen gecerli ay giriniz");
        }












    }
}

