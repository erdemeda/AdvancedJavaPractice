package Projects.ucusProjesiKendiCevabim;

public class UcusProjesi {

    static String city;
    static int flytype;
    static int age;
    static double price=0.1;


    public UcusProjesi(String city,int age,int flytype) {

        this.city = city;
        this.age = age;
        this.flytype = flytype;



       // System.out.println("Yolcunun gidecegi yer : "+city+"\nYolcu yasi : "+age+"\nUcus tipi : "+flytype);
    }


       public String toString(){


           return ("Yolcunun gidecegi yer : "+city+"\nYolcu yasi : "+age+"\nUcus tipi : "+flytype);





    }




}

