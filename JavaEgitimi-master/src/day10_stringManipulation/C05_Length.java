package day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";
        System.out.println(str.length());               // str'in karakter sayısını verir yani 19
        System.out.println(str.charAt(str.length()-1));//son karakterini yazdırmak icin  (p verir)
                                                      //charAt karakter verir unutulmamalıdır

        System.out.println(str.charAt(str.length()-3)); //sondan 3. karakteri bu sekilde verir  (k)

        /*
        Java'da  null pointer (isaretleyici) bir deger degil,
        karsısına yazildigi veriable'in hicbir deger almadıgının isaretcisidir
         */

        String str2 = "";  //str2'ye bir deger atanmıs mıdır EVET
                          //bu deger nedir: hiclik

        System.out.println(str2.length());//Hic karakter olmadıgı icin 0 yazdirir

        String str3=null;
                           //null ozel bir yazimdir deger degildir deger atanmadıgının isaretidir
                          // str3' bir deger atanmıs mıdır HAYIR
                         // null bu deger atamamayı isaretlemektedir
                        //null bir esitligin karsinda olsa bile bu bir atama degildir
                       //esitligin karsisina null yazarsak bu bir atama degildir, null sadece deger atanmadiginin isaretcisidir


        System.out.println(str3.length()); //Bir deger atanmamıs ki nasıl uzunlugu olsun
                                          //NullPointerException olarak hata verir

    }
}
