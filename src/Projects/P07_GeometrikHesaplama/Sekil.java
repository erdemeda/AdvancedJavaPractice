package Projects.P07_GeometrikHesaplama;

public class Sekil {

    protected double yariCap;
    protected double kisaKenar;
    protected double uzunKenar;
    protected double pi=3.14;

    Sekil(double kisaKenar, double uzunKenar) {
        this.kisaKenar = kisaKenar;
        this.uzunKenar = uzunKenar;
    }
    protected Sekil(double yariCap) {
        this.yariCap = yariCap;
    }

    protected void cemberAlanHesapla(){
        double cemberAlan=pi*(yariCap*yariCap);
        System.out.println("Cember alan : "+ cemberAlan);
    }
    protected void cemberCevreHesapla(){
        double cemberCevre=2*(pi*yariCap);
        System.out.println("Cember cevre : "+ cemberCevre);
    }
    protected void dortgenAlanHesapla(){

        if (uzunKenar==kisaKenar){
            System.out.println("Kare alan: "+kisaKenar*uzunKenar );
        }else{
            System.out.println("Dikdortgen alan: "+kisaKenar*uzunKenar);
        }
}
    protected void dortgenCevreHesapla(){

        if (uzunKenar==kisaKenar){
            System.out.println("Kare cevre: "+2*(kisaKenar+uzunKenar) );
        }else{
            System.out.println("Dikdortgen cevre: "+2*(kisaKenar+uzunKenar));
        }
    }

}
