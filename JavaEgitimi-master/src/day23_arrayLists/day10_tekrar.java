package day23_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day10_tekrar {
    public static void main(String[] args) {
         /*
        list ile calısırken en kötü özelligi elemanları tek tek eklemek
         */

        Integer[] arr={2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
        bu kadar cok elemanli bir listeyi
        tek tek eleman olarak girmek yerine
        array olusturup/ for loop ile olusturdugumuz list e tasiyabiliriz.

         */

        List<Integer> sayilar=new ArrayList<>(); //bir tane sayilar isminde  bos list olusturuyoruz

        for (int i = 0; i <arr.length; i++) { //for loop ile array in lengthine kadar alıyoruz ve
            sayilar.add(arr[i]);//array in i inci elementini sayilara ekliyoruz.
   }
        System.out.println(sayilar);// [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        /*
        bu islemi yapması icin java'nın olusturdugu bir method da var
        ancak bu yontemin cok yan etkisi var.

        1-bu sekilde olusturulan listede add remove gibi size ı değistiren method'lar kullanilamaz
        2-asList method'u ile olusturulan liste ve kaynak olan array birbiri ile ilisik olarak hayatlarına devam ederler
        birinde yaptığımız değisiklik, otomatik olarak diğerine de isler.
        */

        //2. yontem (makul değil)
        List<Integer> sayilar2= Arrays.asList(arr);//yeni bir list olusturduk, Arrays.aslist methodunu teklif eder ve oraya
        //bir array ister. arrayimizin adi arr oldugu icin arr yazarız.
        //sol tarafta wrapper class array varken sağ tarafta kucuk int olamaz bu birinci etkidir.
        System.out.println(sayilar2);// burada aynı sonucu verir  [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]

        sayilar.add(5);
        System.out.println(sayilar);//burada 5 i ekler ve yazdırır ancak [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0, 5]
        //  sayilar2.add(5);
        // System.out.println(sayilar2);//burada exception verir, list olusturuyorsun ancak listeye birsey ekleyemiyorsun, anlamsız

        arr[0]=20;//array in 0 ıncı elemanını 20 yaptık
        System.out.println(Arrays.toString(arr));//[20, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]
        System.out.println("array de değisiklik yapınca sayilar2:"+sayilar2);// burası da değisir, ben array de
        // değisiklik yaptım listemde değil
        // sayilar 2 listesinde değisiklik yapmamama rağmen array de değisiklik yapınca listemde değisiyor,
        // listede değisiklik yapınca array de degisiyor
        //   dolayısı ile bu yöntemi kullanmak cokta makul değil

    }

}
