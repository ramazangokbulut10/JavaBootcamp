package day12_stringManipulations;

public class C03_substring {
    public static void main(String[] args) {

        String isim = "Suleyman";
        String soyisim = "Karanfil";
        String kartNo = "1234 6589 7458 9658";

        System.out.println(isim.substring(3)); //3 harf sonrası eyman
        System.out.println(soyisim.substring(soyisim.length()-3));//f ve sonrasını alır fil yani

        System.out.println(isim.substring(2,4));// 2den sonrası 4den öncesi gelir yani le


        //isim ve soyismin ilk harfi buyuk harf, geriye kalan *
        //kredi kartinin ilk 4 rakami gorunsun geriye kalan *

        String isimIlkHarf= isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar= isim.substring(1).replaceAll("\\w", "*");

        String soyisimIlkHarf= soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar= soyisim.substring(1).replaceAll("\\w", "*");

        String kkIlk4= kartNo.substring(0,4);
        String kkGeriyeKalanlar= " **** **** ****";

        System.out.println(isimIlkHarf+isimGeriyeKalanlar+" "+
                soyisimIlkHarf+soyisimGeriyeKalanlar+"\n "+
                kkIlk4+kkGeriyeKalanlar);


    }
}
