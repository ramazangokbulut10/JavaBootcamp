package day20_Arrays;

import java.util.Arrays;

public class C05_SolaKaydirma {
    public static void main(String[] args) {
        /*
        Soru 1: Verilen 3 elemanli bir array’in
        tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
         Ornek; array [1,2, 3] ise output [2, 3, 1] olacak.
         */

        int arr[] = {1,2,3};

        int temp = arr[0]; // 1 i kaybetmemek için temp diye bir şeyin içine sabitledik

        for (int i = 0; i < arr.length-1; i++) {

            arr[i] = arr[i+1];
        }
        arr[arr.length-1] =temp; //[2, 3, 1] temp olarak atadıgımız degeri bu sekilde yaparız
        System.out.println(Arrays.toString(arr)); //[2, 3, 3] degerini verdi ama biz bunu istemiyoruz bunun için
                                                 // arr[arr.length-1] =temp; yaparız




    }
}
