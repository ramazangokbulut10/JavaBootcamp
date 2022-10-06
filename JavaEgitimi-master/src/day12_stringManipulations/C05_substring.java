package day12_stringManipulations;

public class C05_substring {
    public static void main(String[] args) {

        // Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        String imput = "Kaya";

        String tersImput = imput.substring(3) + //4.harf
                           imput.substring(2, 3) + //3.harf
                           imput.substring(1, 2) + //2.harf
                           imput.substring(0, 1); //1. harf

        System.out.println(tersImput);


    }
}
