package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayeElementEkleme {
    public static void main(String[] args) {
        //Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun

        String[] sinifListesi = {"Sumeyye G","Deniz Taskiran","İsmail Akdogan"};
        String eklenecekIsim = "Zeliha Oznuk";

        sinifListesi = elemanEkle (sinifListesi,eklenecekIsim);
        System.out.println(Arrays.toString(sinifListesi));



    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {
        String [] yeniSinifListesi = new String[sinifListesi.length+1]; //[null, null]

        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i] = sinifListesi[i];
        }

        yeniSinifListesi[yeniSinifListesi.length-1] = eklenecekIsim;

        return yeniSinifListesi;

    }
}
