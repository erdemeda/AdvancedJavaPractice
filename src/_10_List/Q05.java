package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class
Q05 {
    public static void main(String[] args) {
       /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */


        System.out.println(" Lutfen 6 elemanli bir dizi giriniz");


        List<Integer> list=new ArrayList<>();
        List<Integer> listSon=new ArrayList<>();

        listSon=tekElemanBulma(list,listSon);


        System.out.println("dizideki tek elemanlar: "+ listSon);


    }

    private static List<Integer> tekElemanBulma(List<Integer> list, List<Integer> listSon) {

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <6 ; i++) {
            System.out.print((i+1)+". eleman : ");
            list.add(scan.nextInt());

            if (list.get(i)%2==1){
                listSon.add(list.get(i));
            }
        }
        return listSon;
    }
}


