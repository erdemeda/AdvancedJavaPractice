package _12_Varargs;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve


        String input1="m";
        String input2="e";
        String input3="r";
        String input4="v";
        String input5="e";

        varargsTopla(input1,input2,input3,input4,input5);

    }
    private static void varargsTopla(String... input) {
        String toplam = "";
        for (String each : input) {
            toplam += each;

        }
        System.out.println(toplam);
    }
}

