package _14_Encapsulation.Q02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {


   Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanici ismi giriniz");
        String username=scan.nextLine();
        System.out.println("Lutfen kullanici parolasini giriniz");
        String password=scan.next();

        List<String> listIsim=new ArrayList<>();
        listIsim.add(username);
        listIsim.add(password);


User kullanici1=new User(username,password);


        System.out.println(kullanici1);

    }
}
