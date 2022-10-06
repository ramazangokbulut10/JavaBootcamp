package day17_nestedForLoop;

import java.util.Scanner;

public class C04_NestedForLoop {
    public static void main(String[] args) {
        /*
        Verilen inputa göre *'lardan olusan bir ucgen olusturun
        ornek input =4 ise

                  *
                  * *
                  * * *
                  * * * *

         */

        int input =4;

        for (int i = 1; i <=input ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println(" ");



        //ikinci örnek

        int input2 =8;

        for (int i = 1; i <=input2 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

        //Ucuncu yontem

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir input degeri giriniz");
        int input3 = scan.nextInt();

        for (int i = 1; i <=input3 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
