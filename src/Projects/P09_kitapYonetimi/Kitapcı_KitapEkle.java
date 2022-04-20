package Projects.P09_kitapYonetimi;


import ProjectsCevaplar.P09_kitapYonetimi.EklenenKitaplar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kitapcı_KitapEkle {

    public static List<EklenenKitaplar>liste=new ArrayList<>();
    public static int artis=1000;
    static Scanner scan = new Scanner(System.in);

   // public static List<EklenenKitaplar> kitapEkle(){
    public static void kitapEkle(){

        System.out.println("Lutfen eklemek istediginiz kitabin adini yaziniz");
         String kitapAdi=scan.nextLine().toLowerCase();
        System.out.println("Lutfen yazar adini yaziniz");
        String yazarAdi=scan.nextLine().toLowerCase();
        System.out.println("Lutfen kitap fiyatini yaziniz");
         int kitapFiyati=scan.nextInt();
         int kitapNo=artis;
       EklenenKitaplar kitap=new EklenenKitaplar(kitapNo,kitapAdi,yazarAdi,kitapFiyati);
       liste.add(kitap);
       artis++;

        //return liste;
    }
    public static void numaraIleKitapGoruntule(){
        System.out.println("Lutfen gormek istediginiz kitabin numarasini giriniz");
        int istenenNumara=scan.nextInt();


        for (int i = 0; i <liste.size() ; i++) {
            if (liste.get(i).kitapNo==istenenNumara){
                System.out.println("Kitap adi: "+liste.get(i).kitapAdi+"\nYazar adi: "+liste.get(i).yazarAdi+
                        "Kitap fiyati: "+liste.get(i).kitapFiyati);
            }
            else{
                System.out.println("Girdiginiz kitap numarasi gecerli degil");
            }
        }
    }


    public static  void bilgiIleKitapGoruntule(){

        System.out.println("Lutfen Kitap adi ile arama yapmak icin 1" +
                "\nYazar adi ile arama yapmak icin 2" +
                "\nKitap fiyati ile arama yapmak icin 3 e tiklayin");

        int secim=scan.nextInt();
switch(secim){
    case 1:
        System.out.println("Kitap adini giriniz");
        String secilenKitap=scan.nextLine();
        for (int i = 0; i <liste.size() ; i++) {
            if (liste.get(i).kitapAdi.equalsIgnoreCase(secilenKitap)){
                System.out.println("Kitap numarasi: "+liste.get(i).kitapNo+"\nYazar adi: "+liste.get(i).yazarAdi+
                        "Kitap fiyati: "+liste.get(i).kitapFiyati);
            }
            else{
                System.out.println("Girdiginiz kitap adi mevcut degil");
            }
        }

    case 2:
        System.out.println("Yazar adini giriniz");
        String secilenYazar=scan.nextLine();

        for (int i = 0; i <liste.size() ; i++) {
            if (liste.get(i).yazarAdi.equalsIgnoreCase(secilenYazar)){
                System.out.println("Kitap numarasi: "+liste.get(i).kitapNo+"\nKitap adi: "+liste.get(i).kitapAdi+
                        "Kitap fiyati: "+liste.get(i).kitapFiyati);
            }
            else{
                System.out.println("Girdiginiz yazarin kitabi mevcut degil");
            }
        }

    case 3:
        System.out.println("Kitap fiyatini giriniz");
        int secilenFiyat=scan.nextInt();

        for (int i = 0; i <liste.size() ; i++) {
            if (liste.get(i).kitapFiyati==secilenFiyat){
                System.out.println("Kitap numarasi: "+liste.get(i).kitapNo+"\nKitap adi: "+liste.get(i).kitapAdi+
                        "Yazar adi: "+liste.get(i).yazarAdi);
            }
            else{
                System.out.println("Girdiginiz fiyatta kitabi mevcut degil");
            }
        }
}

    }

public static void numaraIleKitapSil(){


}







}
/*
public class Kitapci {

    String kitapAdi="";
    String yazarAdi="";
    int kitapFiyatı=0;
    static int kitapSayac=1000;
    int kitapNo=kitapSayac;
    static Scanner scan=new Scanner(System.in);
    static List<Kitapci> kitaplarListesi=new ArrayList<>();

    public Kitapci(String kitapAdi, String yazarAdi, int kitapFiyatı,int kitapNo) {
        this.kitapAdi = kitapAdi;
        this.yazarAdi = yazarAdi;
        this.kitapFiyatı = kitapFiyatı;
        this.kitapNo = kitapNo;

    }

    static void kitapEkle(){

        System.out.println("Lütfen eklemek istediğiniz kitabın adını giriniz");
        String kitapAdi=scan.next().toLowerCase();
        System.out.println("Lütfen eklemek istediğiniz kitabın yazar adını giriniz");
        scan.nextLine();//Dummy
        String yazarAdi=scan.nextLine().toLowerCase();
        System.out.println("Lütfen eklemek istediğiniz kitabın fiyatını giriniz");
        int kitapFiyati=0;
        kitapFiyati = scan.nextInt();
        int kitapNo=kitapSayac;

        Kitapci kitaplar=new Kitapci(kitapAdi, yazarAdi, kitapFiyati, kitapNo);

        kitaplarListesi.add(kitaplar);

        kitapSayac++;



    }

    protected static void kitapGoruntule(){

        System.out.println("Lütfen görüntülemek istediğiniz kitabın nosunu giriniz.");

        int tercih3=scan.nextInt();

        for (int i = 0; i <kitaplarListesi.size() ; i++) {

            if(kitaplarListesi.get(i).kitapNo==tercih3){

                System.out.println("Kitap adı: "+kitaplarListesi.get(i).kitapAdi);
                System.out.println("Kitap Yazarı: " +kitaplarListesi.get(i).yazarAdi);
                System.out.println("Kitap fiyatı: " +kitaplarListesi.get(i).kitapFiyatı);
            }
    }}

    protected static void bilgiIleKitapGoruntule(){




        System.out.println("Lütfen kitap bulmak için kullanmak istediğiniz kriteri belirtiniz\n1.Kitap adı\n2.Kitap yazarı\n3.Kitap fiyatı");

        int tercih4= scan.nextInt();

        switch (tercih4){

            case 2:
                System.out.println("Kitaplarına ulaşmak istediğiniz yazar adını giriniz.");

scan.next();
                String yazar= scan.nextLine();




                for (int i = 0; i <kitaplarListesi.size() ; i++) {

                    if(kitaplarListesi.get(i).yazarAdi.contains(yazar)){

                        System.out.println(yazar+" yazarına ait kitaplar:");
                        System.out.println(kitaplarListesi.get(i).kitapAdi);}else {
                        System.out.println(yazar+" yazarına ait kitap bulunamadı.");



                    }

                } break;

            case 1:
                System.out.println("Aradığınız kitabın adını giriniz.");
                scan.next();

                String kitap= scan.nextLine();

                boolean kitapMevcutMu=false;

                for (int k = 0; k <kitaplarListesi.size() ; k++) {

                    if(kitaplarListesi.get(k).kitapAdi.contains(kitap)){ kitapMevcutMu=true;} }

                if(kitapMevcutMu){
                    System.out.println("Kitapçımızda adını girdiğiniz kitap mevcut");
                }else{System.out.println("Kitapçımızda adını girdiğiniz kitap mevcut değil");}
                break;

            case 3:
                System.out.println("Lütfen kitap fiyatlarımız için üst limit giriniz.");

                int limit= scan.nextInt();
                for (int j = 0; j <kitaplarListesi.size() ; j++) {

                    if(kitaplarListesi.get(j).kitapFiyatı<limit){

                        System.out.println("Aramıza uygun kitaplar:");

                        System.out.println("Kitap:"+kitaplarListesi.get(j).kitapAdi+" Kitap fiyatı: "+kitaplarListesi.get(j).kitapFiyatı);
                    }

                } break;

            default:
                System.out.println("Hatalı giriş yaptınız.Lütfen tekrar deneyin.");
                bilgiIleKitapGoruntule();





        }

    }

    protected static void kitapSilme(){

        System.out.println("Lütfen silmek istediğiniz kitabın nosunu giriniz.");

        int no=scan.nextInt();

        boolean silinecekKitapMevcutMu=false;
        int index=0;

        for (int i = 0; i <kitaplarListesi.size() ; i++) {
            if(kitaplarListesi.get(i).kitapNo==no){silinecekKitapMevcutMu=true;
                index=i;


        }
            if(silinecekKitapMevcutMu){
                System.out.println("Nosunu girdiğiniz kitap listeden kaldırıldı. Üst menuye yonlendirileceksiniz.");

                kitaplarListesi.remove(index);
                main.mainMenu();
            }else {
                System.out.println("Silmeye çalıştığınız kitap numarası bulunmuyor ya da hatalı giriş yaptınız. Ana menuye yönlendirileceksiniz.");
                main.mainMenu();
            }



        }
 */