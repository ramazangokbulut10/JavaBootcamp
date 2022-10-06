package day15_overloading_forloop;

public class C01_ReturnMethod {
    public static void main(String[] args) {
        //Verilen iki sayıyı carpip sonucu bize döndüren metod yazalım


        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1,sayi2);              //getirdiği değeri atamak icin bir veriablee gerek vardır.
        System.out.println("Illa da sonucu goreyim diyenlere :" +sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {
        int sonuc = sayi1*sayi2; //olusturulan her veriable sonuc kendi bulunduğu yerde işlemdedir.
        System.out.println("Illa da sonucu goreyim diyenlere :" +sonuc);
        return sonuc;//return işlemin dönüşünü sağlar. Yani sonuç methodda böyle gelir.
    }
}
