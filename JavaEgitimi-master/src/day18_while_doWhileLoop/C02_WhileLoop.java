package day18_while_doWhileLoop;

public class C02_WhileLoop {
    public static void main(String[] args) {
        /*
        Soru 7 ) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin
         */

        int input = 5432;

        int rakamlarToplami =0;
        int birlerBasamagi =0;
        int temp =input; //inputu her seferinde tekrar tekrar sıfırlamamak için temp e atıyoruz

        while (temp>0){ //(temp!=0) da yapılabilirdi(while (sayi!=0))
            birlerBasamagi=temp%10;     //birler basamagini bulduk
            rakamlarToplami += birlerBasamagi; //sonra ona rakamlar toplamına ekledik
            temp/=10; //birler basamagıyla onceki satirda isimiz bittigi icin birler basamagını böyle yokettik
        }
        System.out.println(input + " sayisinin rakamlar toplami :" +rakamlarToplami);

    }
}
