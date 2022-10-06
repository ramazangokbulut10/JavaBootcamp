package day20_Arrays;

import java.util.Arrays;

public class C03_Length {
    public static void main(String[] args) {



    /*
    iki sekilde array oluşturabiliriz
     */
        int sayilar[] = {1, 2, 3};
    /*
    ikinci durumda da bu şekilde yapılır
    direk degerleri yazarak yaparsak süslü parantez
    uzunlugu sorarsak köşeli parantez olur
     */

        String harfler[] = new String[4];

        System.out.println("sayilar array'in uzunlugu :" + sayilar.length); //3
        //String length() methodunda parantez var
        //Arrayda yoktur

        System.out.println("harfler array'in uzunlugu :" + harfler.length);//4

        System.out.println(Arrays.toString(harfler)); //[null, null, null, null]

        //harfler array'inin son elementini yazdiralim

        //Bir Array'in uzunlugu length ile bulunur yanında parantez olmaz

        System.out.println(harfler[harfler.length-1]); //null

        //System.out.println(harfler[5]); //ArrayIndexOutOfBoundsException hatası verir


    }
}
