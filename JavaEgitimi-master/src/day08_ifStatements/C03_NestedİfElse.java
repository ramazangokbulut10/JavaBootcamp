package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedİfElse {
    public static void main(String[] args) {

        /*
        emeklilik kontrolü yapan bir program yazınız
        cinsiyet olarak E(erkek) veya K(kadın) değişkenlerini kabul etsin
        farklı bir harf veya sembol girilirse hata mesajı versin

        emeklilik için kadınlarda yas sınırı 60
        erkeklerde 65 olsun

        negatif yas veya 80'den buyuk yas girilirse hata mesajı versin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyeti yaziniz" +
                "\n Kadin icin K Erkek icin E harfini giriniz.");
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet == 'E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yasi giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin");
            } else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet == 'K') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsin");

            } else {
                System.out.println("emekli olabilirsin");
            }
        } else {
            System.out.println("Lütfen gecerli bir tercih giriniz");
        }

    }
}
