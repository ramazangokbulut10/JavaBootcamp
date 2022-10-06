package day17_nestedForLoop;

import java.util.Scanner;

public class C05_NestedForLoop {
    public static void main(String[] args) {
        /*
        verilen ınputa gore yildizlardan olusan asagıdaki sekli olusturun
                 *
                 * *
                 * * *
                 * * * *
                 * * *
                 * *
                 *

         */

        //artan kısmı nested forloop ile yapalım

        int input =4;

        for (int i = 1; i <=input; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //burada azalacagı için i-- yapılır ve i >=1 şeklinde bir döngü olusturulur.

        for (int i = input-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        System.out.println("");

        //ikinci ornek

        int input2 =9;

        for (int i = 1; i <=input2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //burada azalacagı için i-- yapılır ve i >=1 şeklinde bir döngü olusturulur.

        for (int i = input2-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //ucuncu yol

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir input degeri giriniz :");
        int input3 = scan.nextInt();

        for (int i = 1; i <=input3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        //burada azalacagı için i-- yapılır ve i >=1 şeklinde bir döngü olusturulur.

        for (int i = input3-1; i >=1 ; i--) {
            for (int j = i; j >=1 ; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }






    }
}
