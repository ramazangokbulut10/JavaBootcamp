package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {
        //Verilen bir Array deki tekrar eden elementleri silip
        //tekrarsız halini Array a atayan bir kod yazınız

        int[] arr = {4,5,3,6,8,5,1,9,0,4,2,5,7,9,1,2,5,7,6};
        Set<Integer> tekrarsızSet = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            tekrarsızSet.add(arr[i]);

        }
        System.out.println(tekrarsızSet); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        //kendi kendine halletti. sadece döngü kurduk

        System.out.println("Ikinci yol");

        for (int w:arr) {
            tekrarsızSet.add(w);
        }
        System.out.println(tekrarsızSet);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        Integer[] arr2= tekrarsızSet.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr2));//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


        System.out.println("Ucuncu yol");

        for (int each:arr) {
            tekrarsızSet.add(each);
        }
        System.out.println("Set :"+tekrarsızSet);//Set :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

        int[] tekrarsizArr = new int[tekrarsızSet.size()];

        System.out.println(Arrays.toString(tekrarsizArr));//[0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

        int i =0;
        for (Integer each:tekrarsızSet) {
            tekrarsizArr[i] =each;
            i++;
        }

        arr =tekrarsizArr;
        System.out.println("Bizim Array'in son hali :"+Arrays.toString(tekrarsizArr));
                          //Bizim Array'in son hali :[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]


        System.out.println("Eskiden böyle cozmustuk ve daha uzundu cozum");
        /*
        verilen bir elementteki tekrar eden elementleri yazdirin

        int[] input={1,4,3,6,3,2,1,7,8,4};

        for (int ii = 0; ii < input.length ; i++) {
            for (int j = ii+1; j < input.length ; j++) {
                if(input[ii]==input[j]){
                    System.out.println("Soru:1 Tekrar eden elemanlar : "+input[ii]);
                }
            }
        }
        Kod sonsuz donguye giriyor calistirma
       */





    }
}
