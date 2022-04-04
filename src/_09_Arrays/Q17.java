package _09_Arrays;

public class Q17 {
  /* TASK :
  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
  Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

   */

    public static void main(String[] args) {


        int somun[][]={{1,5},{2,5},{3,2},{4,20},{5,3}};// somun[genişlik][adet]
        int civata[][]={{1,2},{2,6},{3,0},{4,10},{5,8}}; // civata[genişlik][adet]

        for (int i = 0; i <5; i++) {
            for (int j = 1; j <2 ; j++) {
                if (somun[i][j]>=civata[i][j]) System.out.println(i+1+" mm genişliğinde birbiriyle uyumlu "+civata[i][j]+" adet somun ve civata vardır.");
                else System.out.println(i+1+" mm genişliğinde birbiriyle uyumlu "+somun[i][j]+" adet somun ve civata vardır.");
            }}

}
}
