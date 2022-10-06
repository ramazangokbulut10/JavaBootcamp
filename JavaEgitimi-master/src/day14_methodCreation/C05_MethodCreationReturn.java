package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
        /*
        Eğer bir class'ın içerisinde herhangi bir hesaplama yapıp
        bunu da kalıcı olaraksaklamak istersek
        kodumuzu sade ve anlaşılır tutmak için islemi bir metodda yapıp
        sonucunu main methoda döndürebiliriz
        Return Type i void olmayan bir methodun sonucunu
        main metod da bir veriable a atama yaparak
         */

        /*
        return methodun çagrıldıgı yere sonucu döndürür
         */

        //Kullanicidan sehir ismini ve dogum tarihini alin
        //bunlari programda kullanagimiz formatta bize donduren bir method olusturun
        //sehir ismini programimizda buyuk harf olarak,
        //tarihi ise 2022-06-30 seklinde kullanmak istiyoruz

        String sehir=sehirAl();
        String tarih=tarihAl();

        System.out.println("Girdiginiz sehir :"+sehir);
        System.out.println("Girdiginiz tarih :"+tarih);




    }

    public static String tarihAl() {
        String tarih ="";
        Scanner scan =new Scanner(System.in);
        System.out.println("yil giriniz");
        int yil =scan.nextInt();
        if (yil>1900 && yil<20100){
            tarih=yil+"-";
        }else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz(1900-2100)");
        }
        System.out.println("Kacinci ay oldugunu tamsayi olarak yaziniz");
        int ay = scan.nextInt();
        if (ay<=0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olmalidir");
        }else if (ay<10 ){
            tarih = tarih+"0"+ay+"-";
        }else {
            tarih = tarih+ay+"-";
        }
        System.out.println("Lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun = scan.nextInt();
        if (gun<=0 || gun>31){
            System.out.println("gun olarak 1-31 arasinda sayi girilmelidir");
        }else if (gun<10){
            tarih = tarih+"0"+gun;
        }else {
            tarih=tarih+gun;
        }
        return tarih;



    }

    public static String sehirAl() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sehir adi giriniz");
        String sehirAdi =scan.next().toUpperCase();

        return sehirAdi;

    }
}
