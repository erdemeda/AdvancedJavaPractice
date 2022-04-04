package _10_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q03 {

    public static void main(String[] args) {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        int kareToplam=0;

        for (int i = 0; i < list.size(); i++) {
            kareToplam +=list.get(i)*list.get(i);

        }

        System.out.println("list’deki tum sayıların karesinin toplamı = "+kareToplam);
    }
}
