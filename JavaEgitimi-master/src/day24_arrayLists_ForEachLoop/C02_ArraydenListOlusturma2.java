package day24_arrayLists_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class C02_ArraydenListOlusturma2 {
    public static void main(String[] args) {

 /*
        icinde 200 tane 1000'den kucuk pozitif tam sayi olan bir list olusturun.
        kullanicidan bir sayi isteyip listede var olup olmadığını kullaniciya yazalim
         */
        //java da scanner gibi calısan random class ı var
        //random un özelligi sayi üretmesidir.
        Random rnd=new Random();//scanner gibi olusturduk,
        int sayi=0; //bunlari koymak icin bir tane de list lazım
        List<Integer> sayiListesi=new ArrayList<>();
        while(sayiListesi.size()<200){ //sayilistesi size 200 oldugu müddetce calıssın, 200 e kadar sayı üretsiz listeye eklesin
            //eğer listenizde yoksa ekleyeceksiniz var ise eklemeyeceksiniz seceneği koymak gerekli ,unique olmasını istiyorsan
            sayi= rnd.nextInt(1000);
            //rnd nextın() olan 0 ile 1 arasında sayı üretir rnd int bound olan sınıra kadar sayı üretir.
            if (!sayiListesi.contains(sayi)){ //eğer sayi yoksa eklemek istediğimiz icin basına ünlem koyduk
                sayiListesi.add(sayi);
            }
        }  System.out.println(sayiListesi);//her calıstırdığımızda farklı değerler üretir.
    }
}
