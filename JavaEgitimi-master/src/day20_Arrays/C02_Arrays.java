package day20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        int sayilar[] =new int[3];

        System.out.println(sayilar); //[I@4dd8dc3 = bulunduğu yeri verir eger deger atamazsak

        //non primitive data türündeki dataları
        // her zaman direk yazdıramayabiliriz
        //Array yazdırmak istersek javadaki arrays classından yardım isteriz

        System.out.println(Arrays.toString(sayilar)); //[0, 0, 0] degeri verir yani Arrays.toString() yapmalıyız.


        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

        System.out.println(sayilar); //[I@4dd8dc3

        System.out.println(Arrays.toString(sayilar)); // [5, 3, 10] degeri verir


        String sinifList[] = {"Ali", "Ayse", "Ahmet"};

        System.out.println(Arrays.toString(sinifList)); //[Ali, Ayse, Ahmet]

        sinifList[1] ="Hasan";

        System.out.println(Arrays.toString(sinifList));//[Ali, Hasan, Ahmet] burada Ayşe yerine Hsan kişisini atadık

        System.out.println(sinifList[1]);// Hasan
        System.out.println(sinifList[0]); //Ali


        System.out.println("");

        /*
        Elemanlari “Ali” , “Veli”, “Ayse” ve “"Fatma"” olan bir array olusturun ve bu
        array’i yazdirin.
         */

        String eleman[] = {"Ali" , "Veli", "Ayse", "Fatma"};
        System.out.println(Arrays.toString(eleman));// [Ali, Veli, Ayse, Fatma]

        eleman[0]="Can";
        eleman[2]="Gul";

        System.out.println(Arrays.toString(eleman)); //[Can, Veli, Gul, Fatma] oldu



























    }
}
