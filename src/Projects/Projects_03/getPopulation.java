package Projects.Projects_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class getPopulation {

    /*
        Method name is populationOfCountry

        This method will get 1 String array(countryNames) 1 int array (countryPopulations) and 1 String (str)

        countryNames is Country names

        countryPopulations is Country population

        if str is contained in the countryNames return the population


        For example:

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return should be 120000

        NOTE : if str is not in the countryNames array return -1
     */


    /*
    Method adı populationOfCountry
    Bu method  String array(countryNames) ,  int array (countryPopulations) ve   String (str) alacak

     countryNames : Ülke isimleri

     countryPopulations: Ülke nüfusları

      Eğer str Ülke isimleri içeriyorsa  Ülke nüfusunu return et

      Ornegin;

        countryNames = {"USA" ,"Mexico" ,"Canada"}

        countryPopulations = {100000 , 120000 , 130000}

        str = "Mexico"

        return 120000 olmali

        NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali


     */
    public static void main(String[] args) {

        String countryNames[]= {"USA" ,"Mexico" ,"Canada"};
        int countryPopulations[] = {100000 , 120000 , 130000};
        String str = "Mexico";

        populationOfCountry(countryNames,countryPopulations,str);

    }

    private static void populationOfCountry(String[]countryNames,int[] countryPopulations,String str) {

       List<Integer> countryIcerenler = new ArrayList<>();//en sonda Eğer str Ülke isimleri içeriyorsa icine atmak icin bos bir list olusturuldu

        for (int i = 0; i <countryNames.length ; i++) {

            if (countryNames[i].equalsIgnoreCase(str)){//ulke isimlerinin icine str deki isimle ayni olan varmi ona bakiyoruz
               countryIcerenler.add(countryPopulations[i]);// eger varsa countryIcerenler listine ekliyoruz
                System.out.println(countryNames[i]+" nufusu : "+countryIcerenler);
                break;
            }
        }
        if(countryIcerenler.isEmpty()){//countryIcerenler ici bossa yani ulke isimlerinin icine str deki isimle ayni olan yoksa -1 yazacak
            System.out.println("-1");

        }

    }
}
