package _15_Exceptions;

import java.util.Scanner;

public class Task01Islem {
    /*
    'ortalama' isminde bir method create ediniz ve int v  - int f  isminde 2 adet parametresi olsun.
int v = vize
int f = final

Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını döndürsün.
Diğer durumlarda ise,
vizenin yüzde 40 ını, finalin yüzde 60 ını alsın ve toplasın.(ortalama =)
vizeye 120, finale 80 girin.

Programın çalışmasını sağlayın. (handle edin)
     */
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int v=0;
    int f=0;

while (true) {

    try {
        System.out.println("vize notunu girin");
        v = scan.nextInt();
        if (v < 0 || v > 100) {
            throw new ArithmeticException();
        } else break;

    } catch (ArithmeticException e) {
        System.out.println("Hatali giris. Vize notu 0 ile 100 arasinda olmalidir");
    }
}

    while (true) {

        try {
            System.out.println("final notunu girin");
            f = scan.nextInt();
            if (f < 0 || f > 100) {
                throw new ArithmeticException();
            } else break;

        } catch (ArithmeticException e) {
            System.out.println("Hatali giris. Final notu 0 ile 100 arasinda olmalidir");
        }
    }

    double vHesap=v*0.4;
    double fHesap=f*0.6;
    double sonNot=vHesap+fHesap;

        System.out.println("yil sonu notunuz: "+sonNot);

    }
}
