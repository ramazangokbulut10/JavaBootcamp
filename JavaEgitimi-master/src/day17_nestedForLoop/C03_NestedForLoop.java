package day17_nestedForLoop;

import java.util.Scanner;

public class C03_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen yukseklik ve boy degerine gore
        *'lardan olusan bir dikdortgen olusturalim
        yukseklik:3  boy:4
        * * * *
        * * * *
        * * * *
        * * * *
         */

        //dikdortgen şeklinde olması için yükseklik ve boy belirlenmelidir.

        int yukseklik=4;
        int boy=8;

        for (int i = 1; i <=yukseklik ; i++) {
            for (int j = 1; j <=boy ; j++) {
                System.out.print ("* ");
            }
            System.out.println("");
        }

        System.out.println("");

        //İkinci yöntem

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yukseklik ve boy'u aralarinda entera basarak yaziniz");
        int yukseklik2= scan.nextInt();
        int boy2= scan.nextInt();

        for (int i = 1; i <=yukseklik2 ; i++) {
            for (int j = 1; j <=boy2 ; j++) {
                System.out.print ("* ");
            }
            System.out.println("");
        }

    }
}
