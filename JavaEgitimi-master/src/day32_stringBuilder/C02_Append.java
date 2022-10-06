package day32_stringBuilder;

public class C02_Append {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");

        sb.append("?");

        System.out.println(sb); //Java daha ne yapsin?

        //String Strongdur ne eklersek ekleyelim ony Stringe ekler

        //append istedigimiz Stringi en sona ekler


        sb.append("Java", 2,4);
        System.out.println(sb);//Java daha ne yapsin?va


        sb.insert(4," her seyi dusunmus,");
        System.out.println(sb); //Java her seyi dusunmus, daha ne yapsin?

        // araya ekleme yapmak istediğimiz zaman appent degil ınsert kullanmalıyız


        sb.insert(22,"valla valla",5,11);
        //bir strin verip istediğimiz parcasını almamızı saglıyorux
        System.out.println(sb); //Java her seyi dusunmus valla, daha ne yapsin?

    }
}
