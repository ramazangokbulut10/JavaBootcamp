package day17_nestedForLoop;

public class C02_NestedForLoop {
    public static void main(String[] args) {

        // verilen sayiya gore carpım tablosu olusturun
        /*
        input 3
        1 2 3
        2 4 6
        3 6 9
         */

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {

                System.out.print(i * j + " ");
            }
            System.out.println(" "); //boşluklar yanı alt alta olması icin kullanılır

        }
        System.out.println("");


        //ikinci örnek
        //input 6


        for (int i = 1; i <= 6; i++) {
            for (int j = 1; j <= 6; j++) {

                System.out.print(i * j + " ");
            }
            System.out.println(" "); //boşluklar yanı alt alta olması icin kullanılır

        }


    }
}
