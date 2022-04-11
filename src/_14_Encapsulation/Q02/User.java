package _14_Encapsulation.Q02;

import java.util.Random;
import java.util.Scanner;

public class User {

private int id;
private String username;
private String password;
private boolean active=true;
private boolean signedIn=true;


    public User(){

    }

    public User(int id, String username, String password, boolean active, boolean signedIn) {
        setId(id);
        this.username = username;
        setPassword(password);
        this.active = active;
        this.signedIn = signedIn;
    }

    public User(String username, String password) {
        this.username = username;
        setPassword(password);
        setId(id);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", isim='" + username + '\'' +
                ", parola=" + password +
                ", active=" + active +
                ", signedIn=" + signedIn +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        Random rnd = new Random();

        this.id = rnd.nextInt(1000);
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Scanner scan = new Scanner(System.in);

        if (password.length()<6){
            System.out.println("Yanlis giriş.Lutfen en az 6 haneli bir parola giriniz");
            setPassword(scan.next());
        }
        else
            this.password=password;


       /* do{
            System.out.println("Yanlis giriş.Lutfen 6 haneli bir parola giriniz");
            this.password =scan.next();
        }
        while(password.length()<6);
        this.password = password;

        */

        }


    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public boolean isSignedIn() {
        return signedIn;
    }

    public void setSignedIn(boolean signedIn) {
        this.signedIn = signedIn;
    }

}
