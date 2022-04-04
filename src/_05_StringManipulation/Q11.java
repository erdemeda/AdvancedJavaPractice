package _05_StringManipulation;

public class Q11 {
    public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		 */



        String alfabe= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";



        System.out.println(alfabe.substring(0,1)+" "+alfabe.substring(11,12)+" "+alfabe.substring(8,9).toLowerCase());

    }

}
