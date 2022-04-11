package Projects.Projects_03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*     Soru 1:
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
            büyük harfe çevirip geri döndüren metodun yazınız.
             input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */
    public static void main(String[] args) {

       String cumle="I lIVe in uSa";
        String arr[]=cumle.split(" ");//oncelikle cumleyi kelimelere ayirdim
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i].substring(0,1).toUpperCase()+arr[i].substring(1).toLowerCase()+" ");
            //daha sonra her kelimenin bas harfini buyuk, diger harflerini kucuk yaptim

        }

        }
    }
/*
 public static void main(String[] args) {
        String input = "I live in uSa";
​
        input = firstLetterToUppercase(input);
        System.out.println(input);
​
​
    }
​
    private static String firstLetterToUppercase(String input) {
        StringBuilder output = new StringBuilder();
        input = input.trim();
        String[] newInput = input.split(" ");
​
        for (String s : newInput) {
            output.append(s.substring(0, 1).toUpperCase()).append(s.substring(1).toLowerCase()).append(" ");
​
        }
        return output.toString();
    }
 */
