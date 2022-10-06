package day10_stringManipulation;

import java.util.Locale;

public class C02_toLowerCase_toUpperCase {
    public static void main(String[] args) {

        String str = "Benı psıkopata baglamayın.";

        System.out.println(str.toUpperCase());

        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

        /*
        Eger buyuk-kucuk harf donusumunde local bir dili esas almak isterseniz
        bu method kullanılabilir.
         */

        //equals(=) verilen iki secenegin(String'in) birbirine esit olup olmadıgına bakar


    }
}
