package day32_stringBuilder;

public class C03_reverse {
    public static void main(String[] args) {

        //verilen bir ımputu tersine cevirip
        // bize döndüren bir method olusturun

        String input = "Hey gidi for loop gunleri";

        String tersInput = tersineCevir(input);
        System.out.println(tersInput); //Hey gidi for loop gunleri





    }

    public static String tersineCevir(String input) {

        StringBuilder sb = new StringBuilder(input);

        sb.reverse(); //burada StringBuilder'ı tersine ceviriyoruz

        return sb.reverse().toString();





    }
}
