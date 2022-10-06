package day08_ifStatements;

import java.util.Scanner;

public class C02_İfElseİfStatements {
    public static void main(String[] args) {

        /*
        Soru 7) Kullanicidan 100 uzerinden notunu isteyin.
        Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”,
        50ye eşit 60dan kücükse “C”,
        60ye eşit 80den kücükse “B”,
        80e esit veya uzerinde ise “A”
        gecersiz not girince uyarı verelim.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 0'dan 100'e kadar bir not degeri giriniz :");
        double note =scan.nextDouble();

        if (note<0 || note>100){ //iki sayıdan ve onların arasından soruluyorsa and(&&) kullanılır.
                                 // Ama biz burada veya(||) kullanmalıyız.

            System.out.println("Lutfen gecerli bir not giriniz");
                               //bu satıra geldiysek notumuz 0 ile 100 arasındadır.
        }  else if (note<50){
            System.out.println("Notunuz : D");
                              //bu satıra geldiysek notumuz 50 ile 100 arasındadır.
        } else if (note<60){
                               //Eleye eleye bu satıra gelindi amaç elde olanı net bulmaktır.
            System.out.println("Notunuz : C");
                               //bu satıra geldiysek notumuz 60 ila 100 arasındadır.

        } else if (note<80){
            System.out.println("Notunuz : B");
        }  else {
            System.out.println("Notunuz : A");
        }






    }
}
