package day11_stringManipulation;

public class C01_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";
        /*
        Velinen bir stringde herhangi bir String veya char'in
        ilk kullanıldıgı indexi bize döndürür.
         */

        System.out.println(str.indexOf('g'));// 6 degerini döndürür
        System.out.println(str.indexOf("r"));// 7 degerini döndürür
        System.out.println(str.indexOf("j"));// -1 (olmadıgı inin) döndurur
        System.out.println(str.indexOf("mek"));// 10 degerini döndürür

        //Eger istedigimiz indexten sonrasini kontrol etmek istersek
        // o zaman aynı method'u iki parametreli olarak kullanabiliriz

        System.out.println(str.indexOf("g",(6+1))); //yazilan indexden baslar yani
                                                          // 6. indexten itibaren buldugu ilk g'nin index'ini bulur

        //Yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        //2. e'yi bulabilmek için birinci e'nin indexine ihtiyaç vardır

        int ilke = str.indexOf("e");
        int ikincie= str.indexOf("e",ilke+1); //burada dikkat edilmesi gereken
                                                  // ilk eyi bulduktan sonraki e'yi bulmak için +1 kullanılır

        //eger 2. e varsa 3. e'nin olup olmadıgını
        // ve varsa index'ini yazdıralim


        /*
        cümlede istenen kelimenin olup olmadığını buradaki sorgulama sistemi ile bulunup cozulur.
         */


        if (ikincie==-1){
                             //ikinci enin var olup olmadıgını sorgular
            System.out.println("Veilen str'da 2.e yok");

        }else {
                        //ikinci e varsa buradan itibaren taramaya başlar
                       // çünkü bir önceki kısım -1 degerini vermemiş demektir.

            int ucuncue = str.indexOf("e", ikincie+1);
                                       //ikinci endexten sonra aramaya başla demektir yoksa -1 degeri ver demektir

            if (ucuncue==-1){
                System.out.println("verilen str'da 3.e yok");
            }else{
                System.out.println("verilen str'da 3.e'nin index'i : " + ucuncue);
            }
        }





    }
}
