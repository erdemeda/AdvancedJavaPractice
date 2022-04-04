package Projects.ucusProjesiKendiCevabim;

public class City {

    public static String cityAta() {

       /* Scanner scan = new Scanner(System.in);
        System.out.print("javaAirlines'a hos geldin AGAM..\n B C D rotasından birini seciniz : ");
        String city = scan.next().toUpperCase();

        */

        if (UcusProjesi.city.equals("B") || UcusProjesi.city.equals("C") || UcusProjesi.city.equals("D")) {

            switch(UcusProjesi.city){
                case "B":
                    System.out.println("Girilen bilgilere göre B sehri icin odemeniz asagidaki gibi olacaktir ");
                    break;
                case "C":
                    System.out.println("Girilen bilgilere göre C sehri icin odemeniz asagidaki gibi olacaktir ");
                    break;
                case "D":
                    System.out.println("Girilen bilgilere göre D sehri icin odemeniz asagidaki gibi olacaktir  ");
                    break;
            }
        }

        else System.out.println("Henüz o sehire ucus yok :)");

        return UcusProjesi.city;
    }

    }