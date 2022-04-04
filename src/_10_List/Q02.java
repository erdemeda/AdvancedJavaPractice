package _10_List;

import java.util.*;

public class Q02 {

    public static void main(String[] args) {
        /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]

         */

        String input [][]= {{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};

        harfSirasi(input);


    }

    private static void harfSirasi(String[][] input) {

        List<String> list=new ArrayList<>();

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j <input[i].length ; j++) {
                list.add(input[i][j]);
            }
        }

        Collections.sort(list);
        System.out.println(list);

    }
}
