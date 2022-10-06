package day17_nestedForLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        /*verilen Stringdeki kullanılan harfleri
        tekrarsız olarak yazdırıp
        kelimede kullanılan farklı harf sayısını veren bir metod yazınız
         */

        //toLowerCase() yaparsak büyük harf küçük harf kıyaslamıyor
        /*burada işlemi yaparken buyuk kucuk harf şekline dikkat ettik tek tek
        döngüye girmesini sağladık.

         i,i+1 ne anlatmak istiyor?
        i=0 diyelim..substring(i,i+1) olunca substring(0,1) olmus oluyor.
        .substring içindeki ilk parametre dahil ikinci parametre dahil olmadığı için sadece
        0. indexi almış oluyor..i=1 olunca 1. indexi alıyor..bu böyle böyle devam ediyor..

         */


        String input = "Java her zaman guzel";
        tekrarsizYap(input);
    }
    public static void tekrarsizYap(String input) {

        String benzersizInput=""; //dısında kullandıgımız veriable for döngüsünde kullanılır
                                 //ama for döngüsü içinde kullandıgımız veriable dısarıda kullanılmaz dikkat edilmelidir.
        /*
        döngüyü kurarken yazılan sistem döngü olarak başladıgı için kucuk esittir denmez dizin sayısından kaynaklıdır
         */

        String islenecekKelime=input.replaceAll("\\W",""); //Javaherzamanguzel
        System.out.print(islenecekKelime.substring(0,1)); // J
        benzersizInput+=islenecekKelime.substring(0,1);  // J

        for (int i = 1; i <islenecekKelime.length() ; i++) { //Javaherzamanguzel


            if (!benzersizInput.contains(islenecekKelime.substring(i,i+1))){
                System.out.print(", "+ islenecekKelime.substring(i,i+1));
                benzersizInput+=islenecekKelime.substring(i,i+1);
            }
        }

        System.out.println("");
        System.out.println("inpt: " + input);
        System.out.println("benzersiz input : " + benzersizInput);
        System.out.println("Benzersiz input :" + benzersizInput.length());

    }
}
