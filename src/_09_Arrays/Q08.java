package _09_Arrays;

import java.util.Arrays;

public class Q08 {

    public static void main(String[] args) {
		
		/*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String arr[] =str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolar=0;
        int euro=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].contains("$")){

            }



        }

    }
}
/*
 String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        String Arr[]=str.split(" ");
        System.out.println(Arrays.toString(Arr));
        int toplamdolar=0;
        int toplampound=0;
        for (int i = 0; i <Arr.length ; i++) {
            if(Arr[i].contains("$")) {
                Arr[i]=Arr[i].replace("$","");
                toplamdolar+=Integer.parseInt(Arr[i]);
            }
            if(Arr[i].contains("£")){
                Arr[i]=Arr[i].replace("£","");
                toplampound+=Integer.parseInt(Arr[i]);
            }
        }
        System.out.println("Toplam "+toplamdolar+" $");
        System.out.println("Toplam "+toplampound+" £");
 */

