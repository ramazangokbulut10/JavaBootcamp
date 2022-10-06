package day21_Arrays;

import java.util.Arrays;

public class C06_ArrayaElemanEklemeFarkli {
    public static void main(String[] args) {
        //C05 teki methodu kullanarak arraya eleman ekleme

        String [] takimListesi = {"Suleyman" , "Osman"};
        String eklenecekIsim = "Talha";

        takimListesi = C05_ArrayeElementEkleme.elemanEkle(takimListesi,eklenecekIsim);

        System.out.println(Arrays.toString(takimListesi));


    }
}
