package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str="Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o"));   // 5 verir
        System.out.println(str.indexOf('g'));  // 6 verir
        System.out.println(str.indexOf("t")); // bana integer döndürür
                                             //int'de yok diye bir deger yoktur.
                                            // 0 dersek J'in index'idir.
                                           // - bir deger girersek biz aranan strig'in str'da olmadıgını anlarız.
                                          // Java -1 dondurmeyi tercih etmistir.
                                         // Olmayan her karakter için her -1 karakter döndürür.
                                        // tek tırnak veya cift tırnak fark etmez

        String str5= "wertyuio;sdfkjweıfjlkdkjnahwkjfnkjflksdnckjbfvkjnfdjnfhvb";


                                     // str5'de p harfi var midir?
        if (str5.indexOf("=")==-1){
            System.out.println("str5'de istenen karakter kullanilmamis");
        }else {
            System.out.println("str5'de istenen karakter kullanilmis");
        }

    }
}
