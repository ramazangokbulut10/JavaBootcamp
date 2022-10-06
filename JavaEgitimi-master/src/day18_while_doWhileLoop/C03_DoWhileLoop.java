package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {

        /*
        while loopda önce kontrol edip sonra işlem yaptıgımız icin
        işlem bittikten sonra loop un kırılması için bir kez daha başa dönmemiz gerekiyor
        bu durumda fazladan bir işlem yapılıyor
         */
        int sayi = 7;

        while (sayi<10){
            System.out.print(sayi + " ");

            sayi++;
        }

        System.out.println(" ");

        /*
        do-while loop ile bu dezavantaj ortadan kalkar
         */

        sayi=7;

        do {
            System.out.print(sayi +" ");

            sayi++;
        }while (sayi<10);


        System.out.println("");

        int sayi2= 10;

        do {
            System.out.print(sayi2 + " ");
            sayi2++;
        }while (sayi2<20);













    }
}
