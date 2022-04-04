package _09_Arrays;

public class Q04 {

    public static void main(String[] args) {
        /*  TASK :
         *  verilen bir int  Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int istenenToplam=9;

        ikisayitoplami(arr,istenenToplam);

    }
    private static void ikisayitoplami(int[] arr, int istenenToplam) {

        for (int i = 0; i <arr.length ; i++) {
        for (int j = i+1; j < arr.length; j++) {
        if (arr[i]+arr[j]==istenenToplam) {

            System.out.println(arr[i] + " ile " + arr[j] + " toplami= " + istenenToplam);
        }
        }
        }


    }

}
/*
Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen istenilen toplamı giriniz:");
        int toplam=scan.nextInt();
        int[] arr= {5,7,-6,4,2,15,3,8,1};
        arrayikili(arr,toplam);
​
    }
    private static void arrayikili(int Arr[],int toplam ) {
        for (int i = 0; i <Arr.length ; i++) {
            for (int j = 0; j <Arr.length ; j++) {
                if (i != j) {
                    if (Arr[i] + Arr[j] == toplam) System.out.println("("+Arr[i]+","+Arr[j]+")");
                }
            }
        }
 */