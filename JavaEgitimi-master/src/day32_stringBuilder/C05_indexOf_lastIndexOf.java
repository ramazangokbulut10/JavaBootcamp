package day32_stringBuilder;

public class C05_indexOf_lastIndexOf {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Pay attention please");

        sb.indexOf("Pay"); //Bize Integer dondurecek
        //indexOf bastan baslayarah Pay kelimesini arar P harfi 0 da başladıgı icin sonuc 0 gelir

        System.out.println(sb.indexOf("Pay")); // 0 verir

        System.out.println(sb); //Pay attention please

        System.out.println(sb.indexOf("e")); //7

        System.out.println(sb.indexOf("e",10)); //16
        //10. indexten sonra buldugu ilk e nin indexini verir

        System.out.println(sb.lastIndexOf("e")); //19
        //aramayı sondan yapıyor ve ilk buldugu e nin bastan sayarak indexini döndürür

        System.out.println(sb.lastIndexOf("e",10)); //7
        //ilk once 10. indexe gider daha sonra buldugu karakterden sonra geriye donup e yi bulur ve degerini döndürür




    }

}
