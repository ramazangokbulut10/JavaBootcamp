package day15_overloading_forloop;

public class C02_Overloading {
    public static void main(String[] args) {
        /*javada olustırdugumuz methodlarin isminin yaptıgı islerle uyumlu olmalıdır
        mesela Stringin bir bolumunu almak icin java
        substring(); methodunu oluşturmuştur.
        Verilen Stringdeki bazi parcalari yenileri ile degistirmek icin
        2 adet replace(); metodu vardır.

        Java ayni isimde birden fazla metod varsa hangisinin kullanılacağına
        parametre sayısına ve parametrelerin data türüne gore karar verir.
         */

        String str = "Bu Java ogrenilecek baska yolu yok ";
        str.substring(2);
        str.substring(2,4);
        str.replace('c', 'v');
        str.replace("J", "H");
        // str.replace(5,8);

        /*
           Ayni isimde ama farkli methodlari olusturmak icin degistirebilecegimiz seyler
        1- Parametre sayisi (int a, int b, int c)
        2- Ayni sayida parametreye sahip olsa bile, parametrelerin data türleri (int a, int b), (double a,  double b)
        3- ayni sayida ve ayni data turunde parametreleri olan methodlarda
           parametrelerin siralanisi (int a, double b), (double a,  int b)
         */



    }
}
