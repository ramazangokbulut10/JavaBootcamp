package day36_inheritanceDataTypeKullanimi;

import java.util.ArrayList;

public class CMemur extends BMuhasebe{

   protected int saatUcreti =12;
   protected int gunlukMesai =9;



   protected void maas(){
       System.out.println("Memurlar :" +(30*saatUcreti*gunlukMesai) + " maas alir.");
   }

   protected void ozelSigorta(){
       System.out.println("Memurlar %60 indirimli ozel sigorta yaptirabilir.");
   }

    public static void main(String[] args) {

       CMemur mmr1 = new CMemur();

        System.out.println(mmr1.gunlukMesai);//9
        System.out.println(mmr1.saatUcreti);//12

        mmr1.maas(); //memurlar classından (Memurlar :3240 maas alir.)
        mmr1.ozelSigorta();//"Memurlar %60 indirimli ozel sigorta yaptirabilir."
        mmr1.sigorta();//sigorta bilgisi personelden gelecek

        System.out.println(mmr1.isim);//isim personel classından gelir
        System.out.println(mmr1.soyisim); //personel
        System.out.println(mmr1.departman);//personel


        BMuhasebe mhsb1 =new BMuhasebe();//CLASS ismi oldugu icin ; ile biter

        /*
        her ne kadar Memur classının icinde olsak da
        olusturdugumuz obje Muhasebe classından
        cunku data türü ve cons BMuhasebededir


        String str = "Memur";
        ArrayList<Integer> list = new ArrayList<>();
        Integer sayi =20;

        BMuhasebe classıda obje olusturulabilen bir classdır yani data turudur
        */

        // obje olusturulan her class aynı zamanda bir data turudur

        System.out.println("***************************");


        System.out.println(mhsb1.gunlukMesai);//8
        System.out.println(mhsb1.saatUcreti);//10

        mhsb1.maas(); //Personel minimum :2400 maas alir
        mhsb1.ozelSigorta();//"Isteyen calisanlara %50 indirimli ozel sigorta yapilir."
        mhsb1.sigorta();//personel

        System.out.println(mhsb1.isim);//isim personel classından gelir
        System.out.println(mhsb1.soyisim); //personel
        System.out.println(mhsb1.departman);//personel

        /*
        data turü ve cons aynıysa direk o classa gider varsa vardır
        yoksa extends yaptıgımız yere gider ve oradan alır
        bende yoksa babamdan alır kullanırım
        ama bende varsa önce onu kullanırım
         */




    }



}
