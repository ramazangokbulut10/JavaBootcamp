package day28_staticBlock;

public class C01_StaticBlock {

    static int sayi;
    static {
        /*
        static block class uyelerinin tamamından once calisir
        (main method'dan bile once)

        static block class olusturuldugunda calisir
        genellikle de classla ilgili ön ayarlamalar
        veya static variablelara deger atamak icin kullanılır

        static blokların class icerisinde nerede oldugu onemli degildir
        once static blocklar calisir

        birden fazla block varsa yukarıdan asagıya dogru calisir

        burada birden çok yerde static blok olabilmesinin amacı;
         yazılımcının kod yazarken aklına geldiği anda istediği yerde
         class ile ilgili hemen düzenleme yapsın diyedir
         */
        System.out.println("static blok calisti");
        sayi=10;
    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }

    static {
        System.out.println("Main method altındaki static block calisti");
    }


}
