package _09_Arrays;

public class Q05 {

    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

int input[]= {1,2,3,4,5,6,7};
int toplam=0;
double ortalama=0;


        for (int i = 0; i <input.length ; i++) {
            toplam = toplam + input[i];
        }

          ortalama=toplam/ input.length;
        System.out.println("sayilarin ortalamasi : "+ortalama);
        System.out.print("ortalamadan buyuk sayilar : ");

        for (int i = 0; i <input.length; i++) {

         if (input[i]>ortalama) {
             System.out.print(input[i] + " ");
         }

            }




    }

}








/*
 int arr[]= {1,2,3,4,5,6,7};
        float toplam=0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        float ortalama=toplam/arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama) System.out.print(arr[i]+" ");
        }
 */
