package Projects.ucusProjesiKendiCevabim;

public class Age {


    public static int ageAta() {
       /* Scanner scan = new Scanner(System.in);
        System.out.print("agam yasını da gir : ");
        int age= scan.nextInt();

        */
       double indirimliOdeme=0;

        if (UcusProjesi.age<12){
          if (City.cityAta().equalsIgnoreCase("B")){
              indirimliOdeme+=UcusProjesi.price*500*0.5;
              System.out.println("B sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");

          }else if (City.cityAta().equalsIgnoreCase("C")){
              indirimliOdeme+=UcusProjesi.price*700*0.5;
                System.out.println("C sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");

          }else if (City.cityAta().equalsIgnoreCase("D")){
              indirimliOdeme+=UcusProjesi.price*900*0.5;
                  System.out.println("D sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");
          }
        }else if (12<=UcusProjesi.age && UcusProjesi.age<24){
            if (City.cityAta().equalsIgnoreCase("B")){
                indirimliOdeme+=UcusProjesi.price*500*0.9;
                System.out.println("B sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");

            }else if (City.cityAta().equalsIgnoreCase("C")){
                indirimliOdeme+=UcusProjesi.price*700*0.9;
                System.out.println("C sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");

            }else if (City.cityAta().equalsIgnoreCase("D")){
                indirimliOdeme+=UcusProjesi.price*900*0.9;
                System.out.println("D sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");
            }
        }
        else if (24<=UcusProjesi.age && UcusProjesi.age<65){
            if (City.cityAta().equalsIgnoreCase("B")){
                indirimliOdeme+=UcusProjesi.price*500;
                System.out.println("B sehiri bilet fiyati: "+indirimliOdeme+ " $");
            }else if (City.cityAta().equalsIgnoreCase("C")){
                indirimliOdeme+=UcusProjesi.price*700;
                System.out.println("C sehiri bilet fiyati: "+indirimliOdeme+ " $");
            }else if (City.cityAta().equalsIgnoreCase("D")){
                indirimliOdeme+=UcusProjesi.price*900;
                System.out.println("D sehiri bilet fiyati: "+indirimliOdeme+ " $");
            }
        }


            else if (65<=UcusProjesi.age){
                if (City.cityAta().equalsIgnoreCase("B")){
                    indirimliOdeme+=UcusProjesi.price*500*0.7;
                    System.out.println("B sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");
                }else if (City.cityAta().equalsIgnoreCase("C")){
                    indirimliOdeme+=UcusProjesi.price*700*0.7;
                    System.out.println("C sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");
                }else if (City.cityAta().equalsIgnoreCase("D")){
                    indirimliOdeme+=UcusProjesi.price*900*0.7;
                    System.out.println("D sehiri yas indirimi eklenmis bilet fiyati: "+indirimliOdeme+ " $");
                }
        }
            else{
            System.out.println("Lutfen uygun bir yas giriniz");

        }

        return (int) indirimliOdeme;
    }


}
