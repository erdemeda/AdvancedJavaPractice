package Projects.ucusProjesiKendiCevabim;

public class FlyType {


    public static int flytypeAta() {

        /*Scanner scan = new Scanner(System.in);
        System.out.print("ucusunuz için \n tek yon-->1 \n cift yon-->2 \n giriniz : ");
        int flytype = scan.nextInt();

         */
        double sonOdeme=0;
        if (UcusProjesi.flytype == 1) {// ucus tek-cift yon kontrolu %20 indirim
            sonOdeme+=Age.ageAta();
            System.out.println("Ucusunuz için son bilet odemeniz : " + sonOdeme + " $");


        } else if (UcusProjesi.flytype == 2) {
            sonOdeme+=Age.ageAta() * 0.8 * 2;
            System.out.println("Ucusunuz için son bilet odemeniz : " +sonOdeme + " $");

        } else System.out.println("Hatalı veri giridiniz");




        return (int) sonOdeme;



    }



}




