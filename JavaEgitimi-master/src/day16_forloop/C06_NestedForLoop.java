package day16_forloop;

import java.util.Scanner;

public class C06_NestedForLoop {
    public static void main(String[] args) {

        /*Bazen tek değişken sonucu çözmeye yetmez
        *
        * *
        * * *
        * * * *
        * * * * *
         */

        //yan yana 3 tane * yaz

        for (int i = 1; i <=3; i++) {
            System.out.println("*");
        }

        //yan yana 4 tane yıldız yazın
        System.out.println(" ");
        for (int i = 1; i <=4; i++) {
            System.out.print("*");
        }

        System.out.println(" ");

        //Bu tur durumlarda ic ice(nested) loop kullanmak gerekir.

        for (int i = 1; i <=5; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println(" ");
        /*
        /*
        verilen yukseklik ve boy degerine gore *'lardan olusan bir dikdortgen
        olusturalim
        yukseklik:3 ve boy :4 ise;
        * * * *
        * * * *
        * * * *
         */

        for (int i = 0; i <=3; i++) {
            for (int j = 0; j <=4; j++) {
                System.out.print("* ");
            }
        }

        System.out.println("  ");

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen input giriniz");

        int input = scan.nextInt();

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
        }
        for (int i = input-1; i >=0 ; i--) {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
