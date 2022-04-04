package _10_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

       List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Omer");


        List<String> yeniList=new ArrayList<>();

        for (int i = 0; i <list.size() ; i++) {

            if (!list.get(i).toLowerCase().contains("a")){

                yeniList.add(list.get(i));
            }
        }

        System.out.println(yeniList);


            }

        }



