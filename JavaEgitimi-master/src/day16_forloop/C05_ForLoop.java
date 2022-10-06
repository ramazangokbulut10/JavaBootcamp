package day16_forloop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir program yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen baslangic ve bitis degerlerini pozitif tamsayi olarak girin.");
        int bas = scan.nextInt();
        int bitis = scan.nextInt();

        aralariniTopla(bas,bitis);


    }

    private static void aralariniTopla(int bas, int bitis) {
        int toplam = 0;
        if (bas<=bitis){
            for (int i = bas; i <=bitis; i++) { //başlangıc sayısı 10 diğeri 12 olursa diye,
                toplam += i;  //toplam =+ toplam +i; yazmamak için böyle yazdık daha kolaydır ve kuraldır, şık gözükür.
            }
        }else {
            for (int i = bitis; i <=bas; i++) { // baslangıc sayisi 12 diğeri 10 olursa diye böyle yazildi.
                toplam+= i;
            }
        }
        System.out.println("Aradaki sayilarin toplami :" + toplam);
    }
}
