package day21_Arrays;

import java.util.Arrays;

public class C07_sort {
    public static void main(String[] args) {

        int [] sayilar = {5,7,1,6,4,3,9};

        // Array'i Arrays class'ini kullanarak natural sirali hale getirebiliriz


        Arrays.sort(sayilar);


        System.out.println(Arrays.toString(sayilar));


    }
}
