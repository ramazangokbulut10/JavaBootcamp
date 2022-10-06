package day28_staticBlock;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        %20 indirimli fiyatı hesaplayıp bize döndüren bir method olusturun
         */

        double satisFiyati =100; //burada tanımlanmıs
        double indirimOrani =60;

        double indirimliFiyat =indirimliFiyatHesapla(satisFiyati,indirimOrani);
        System.out.println("indirimli fiyat :" +indirimliFiyat);
        System.out.println("indirimli fiyat :" +indirimliFiyat);
        System.out.println("indirimli fiyat :" +indirimliFiyat);
        System.out.println("indirimli fiyat :" +indirimliFiyat);




    }

    public static double indirimliFiyatHesapla(double satisFiyati, double indirimOrani) { //burada declare edilmis

        double indirimliFiyat = satisFiyati*(1-indirimOrani/100);

        return indirimliFiyat;

    }
}
