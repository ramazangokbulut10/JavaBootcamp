package day46_maps;

import java.util.List;
import java.util.Map;

public class C02_MapsMethodIle {
    public static void main(String[] args) {


        Map<Integer,String> ogrenciMap =ReusableMethods.mapOlustur();
        System.out.println(ogrenciMap);
        //{101=Ali, Can, JDev, 102=Enes ,Cem, Tester, 103=Taha ,Emre, JDev, 104=Derya ,Deniz, Tester}

        //value'lari sıra numaralı olarak yazdırın

        ReusableMethods.tumValueSiraliYazdir(ogrenciMap);

        //Isım ve soyisimlerin birlikte yazılacagı bir liste olusturun

        List<String> sinifIsimSoyisimListesi = ReusableMethods.isimSoyisimListesiOlustur(ogrenciMap);
        System.out.println("Isim soyisim listesi :" +sinifIsimSoyisimListesi);



        //

    }
}
