package day09_ternary;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //Soru4 ) Kullanicidan bir sayi alin. Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        //Eger ternary içindeki sonuclar farklı data türlerinde ise
        //atama yapamayız, sadece yazdırabiliriz
        //double sonuc = sayi>0 ? "sayi pozitif" : (sayi*sayi);

        System.out.println(sayi>0? "sayi pozitif" : (sayi*sayi));
    }
}
