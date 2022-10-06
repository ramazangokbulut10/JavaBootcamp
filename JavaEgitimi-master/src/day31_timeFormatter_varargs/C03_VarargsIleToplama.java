package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {
    public static void main(String[] args) {
        // verilen kac 2 int olursa olsun
        // hepsini toplayip sonucu yazdiran bir method olusturun


        int sayi1 =10;
        int sayi2 =20;
        int sayi3 =30;
        int sayi4 =40;
        int sayi5 =50;

        toplaYazdir(sayi1,sayi2,sayi3,sayi4,sayi5);
        toplaYazdir(sayi1,sayi2,sayi3,sayi4);
        toplaYazdir(sayi1,sayi2,sayi3);
        toplaYazdir(sayi1,sayi2);


    }

    public static void toplaYazdir(int...sayi) {
        //degisken sayida argüment almamızı ... saglar

        /*
        int...sayi bu gosterim ınteger variable lardan olusan bir varargs demektır
        varargs array alt yapisini kullanır

         */

        int toplam =0;
        int sayiAdedi =sayi.length;
        for (int each: sayi) {
            toplam+=each;
        }
        System.out.println("Girilen " +sayiAdedi+" adet sayinin toplami :" +toplam);
        /*
        output :
        Girilen 5 adet sayinin toplami :150
Girilen 4 adet sayinin toplami :100
Girilen 3 adet sayinin toplami :60
Girilen 2 adet sayinin toplami :30
         */

    }
}
