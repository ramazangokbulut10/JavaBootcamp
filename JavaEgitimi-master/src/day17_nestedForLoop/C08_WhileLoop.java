package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan toplanmak üzere sayilar alın
        sayilarin toplami 500 ü gecince (500 dahil)
        sayilarin toplamini ve kac sayi topladigini su sekilde yazdirin

        13 sayi girdiniz ve toplamlari 567
         */

        //veriableler önce yazilmalidir

        int toplam = 0;
        int sayi = 0;
        int sayac = 0;
        Scanner scan = new Scanner(System.in);


        while (toplam<500){

            System.out.println("Lutfen toplamak icin sayi giriniz");
            sayi =scan.nextInt();
            toplam+=sayi;
            sayac++;
        }

        System.out.println(sayac + " sayi girdiniz ve toplamlari :" +toplam);

        System.out.println("");

        //For ile cözümü

        int toplam2 = 0;
        int sayi2 = 0;
        int sayac2 = 0;

        for (int i = 0; i <1 ; i++) {
            if (toplam2<=500) {
                System.out.println("Lutfen toplamak icin sayi girin");
                sayi2=scan.nextInt();
                toplam2+=sayi2;
                sayac2++;
                i--;
            }
        }
        System.out.println(sayac2+" sayi girdiniz ve bu sayilarin toplami "+toplam);

    }
}
