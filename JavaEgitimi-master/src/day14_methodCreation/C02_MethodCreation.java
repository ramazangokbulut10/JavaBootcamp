package day14_methodCreation;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //Verilen 3 basamakli bir sayinin
        //rakamlari toplamini yazdiran bir method olusturalim

        int input =423;
        rakamlariTopla(input);

        C04_MethodCreation.topla(6,3);
        C01_MethodCreation.terstenYazdir("Nuri");


    }

    public static void rakamlariTopla(int input) { //her yerden kullanmak icin private public yapilir
        int birlerBasamagi =0;
        int rakamlarToplami =0;
        int temp= input;

        birlerBasamagi=input%10; //birler basamagini verir
        rakamlarToplami+=birlerBasamagi; //rakamlar toplamina esitledik
        input/=10; //birler basamagı bulunur

        birlerBasamagi=input%10; //birler basamagini verir
        rakamlarToplami+=birlerBasamagi; //rakamlar toplamina esitledik
        input/=10; //birler basamagı bulunur

        birlerBasamagi=input%10; //birler basamagini verir
        rakamlarToplami+=birlerBasamagi; //rakamlar toplamina esitledik
        input/=10; //birler basamagı bulunur

        System.out.println("Girdiginiz " + temp + "sayisinin rakamlar toplami:" +rakamlarToplami);
    }

}
