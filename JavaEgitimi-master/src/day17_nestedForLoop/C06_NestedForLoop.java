package day17_nestedForLoop;

import java.util.Scanner;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*
        verilen Stringi asagıdaki gibi yazdiran bir program yazdirin
        D
        De
        Den
        Deni
        Deniz
         */

        /*
        input.substring(j-1,j); //ilk harf icin substring(0,1) olmalıydı ama burada 1'den basladıgı icin
        burada j-1=0'dır seklinde kullanabiliriz
         */

        String input="Deniz";
        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input.substring(j - 1, j));  // ilk harf icin substring(0,1) olmali
            }
            System.out.println("");
        }

        for (int i = input.length(); i > 0; i--) {
            System.out.println(input.substring(0, i - 1));
        }

        System.out.println("");


        /*
        verilen Stringi asagıdaki gibi yazdiran bir program yazdirin
        Z
        Ze
        Zel
        Zeli
        Zelih
        Zeliha

         */

        String input2 ="Zeliha";

        for (int i = 1; i <=input2.length(); i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(input2.substring(j-1,j));
            }
            System.out.println("");
        }

        System.out.println("");

        //ucuncu yol ucgen devam ettir

        String input3="Nilufer";
        for (int i = 1; i <=input3.length() ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(input3.substring(j - 1, j));  // ilk harf icin substring(0,1) olmali
                                                           // (0dan 1e kadar oldugu icin)
            }
            System.out.println("");
        }

        for (int i = input3.length(); i > 0; i--) {
            System.out.println(input3.substring(0, i - 1));
        }

        // şekilde de yapılabilir azalması için

        for (int i = input3.length()-1; i > 0; i--) {
            System.out.println(input3.substring(0, i));
        }


    }
}
