package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
        islemi bitirmek icin 0’a basmasini soyleyin.
        Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
        ve “Negatif sayi giremezsiniz” yazdirip basa donun
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
        yanlislikla kac negative sayi girdigini ve
        girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        int sayi =0;
        int pozitifSayiAdedi =0;
        int negSayiAdedi =0;
        int pozSayilarToplami =0;

        do {
            System.out.println("Lutfen toplamak uzere pozitif tamsayi giriniz. Islemi bitirmek istediginizde 0'a basiniz.");
            sayi =scan.nextInt();
            if (sayi>0){
                pozSayilarToplami+=sayi;
                pozitifSayiAdedi++;
            }else if (sayi<0){
                negSayiAdedi++;
                System.out.println("Negatif sayi giremezsiniz");
            }

        }while (sayi!=0);

        System.out.println(pozitifSayiAdedi + " adet pozitif sayi girdiniz, toplamlari :" + pozSayilarToplami);
        System.out.println(negSayiAdedi + " negatif sayi girdiniz ancak onlar toplama dahil edilmedi");














    }
}
