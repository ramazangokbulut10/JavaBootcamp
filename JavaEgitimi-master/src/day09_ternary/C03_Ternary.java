package day09_ternary;

import java.util.Scanner;

public class C03_Ternary {
    public static void main(String[] args) {

        //Kullanıcıdan bir sayi isteyin
        // sayi pozitifse sayiyi yazdirin
        // sayi sifir veya negatifse bir sayi daaha isteyin ve ikisinin caepimini yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi>0){
            System.out.println(sayi);
        }else{
            System.out.println("Lutfen bir sayi daha giriniz");
            double sayi2= scan.nextDouble();
            System.out.println(sayi*sayi2);
        }

        /*
        Eger if else icerisinde yeni kodlar varsa
        ternary ile islem yapamamiz mumkun olmaz
         */

    }
}
