package _09_Arrays;

public class Q07 {

    public static void main(String[] args) {
        /* TASK :
         * write a method that accepts a 2 dimensional array and finds
         * the max value
         * (2 boyutlu bir diziyi kabul eden ve maksimum degeri bulan bir
         * method yazin )
         * Input : {{1,2,-3},{41,55},{-61,-17,80}}
         * Output : 80
         */


        int arr[][] = {{1, 2, -3}, {41, 55}, {-61, 63, 8}};
        System.out.println("girdiginiz array'in max elemanı : "+maxDegerBul(arr));
    }

    public  static  int maxDegerBul(int arr[][]){

        int max=arr[0][0];//methoddan return edilecek max elemanın atanacagı cont cretae edildi

        for(int kat=0; kat<arr.length; kat++){//kat kontrolu yapıldı

            for(int daire=0; daire<arr[kat].length; daire++){//daire kontrolu yapıldı

                if(arr[kat][daire]>max){
                    max=arr[kat][daire];
                }

            }
        }
        return max;

    }
}
/*
 int arr[][] = {{1,2,-3},{41,55},{-61,-17,80}};
        int maxDeger = maxDegerBul(arr);
        System.out.println(maxDeger);
    }
    private static int maxDegerBul(int[][] arr) {
        int maxDeger=Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++) {
                if (arr[i][j]>maxDeger){
                    maxDeger = arr[i][j];
                }
            }
        }
        return maxDeger;



DIGER YONTEM----------------------------------
 int [][] ınput = {{1,254,-3},{125,55},{-61,-17,65}};
​
        maxDegeriBulan(ınput);

​
    }
​
    private static void maxDegeriBulan(int[][] ınput) {

        Arrays.sort(ınput[0]);
        Arrays.sort(ınput[1]);
        Arrays.sort(ınput[2]);
​
        int ilkBuyuk=ınput[0][ınput[0].length-1];
        int ikinciBuyuk=ınput[1][ınput[1].length-1];
        int ucuncuBuyuk=ınput[2][ınput[2].length-1];
​
        if (ilkBuyuk>ikinciBuyuk       &&     ilkBuyuk>ucuncuBuyuk){

            System.out.println("max değer ="+ilkBuyuk);

        }else if (ikinciBuyuk>ilkBuyuk  &&  ikinciBuyuk>ucuncuBuyuk){

            System.out.println("max değer ="+ikinciBuyuk);
​
        }else if (ucuncuBuyuk>ilkBuyuk  &&  ucuncuBuyuk>ikinciBuyuk){

            System.out.println("max değer ="+ucuncuBuyuk);
​
​
        }

 */