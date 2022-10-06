package day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime ="Java";

        /*Kullanicidan bir cumle ve bir kelime isteyim
         kelimenin cumledeki kullanımına bakarak asagıdaki 3 cumleden uygun olanı yazdırın
          - verilen kelime cumlede kullanilmamis
          - verilen kelime cumlede sadece 1 kere kullanılmıs
          - verilen kelime cumlede birden fazla kullanilmis
         */

        // == eşit mi diye sormak icin kullanilir

        int kelimeIlkIndex = cumle.indexOf(kelime); //ilk kullanımını verir
        int kelimeSonIndex = cumle.lastIndexOf(kelime); //varsa son kullanımını verir

        if (kelimeIlkIndex==-1){                 //öncelikle verilen cumlede var mı yok mu
                                                // diye ilk sorgulamak gerekir bunun icin -1 kullanmak gerekir

            System.out.println("verilen kelime cumlede kullanilmamis");
        }else if (kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede sadece 1 kere kullanilmis");
        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }


    }
}
