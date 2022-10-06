package day37_overridding;

public class FSupra extends EToyota{


    void yakit(){
        System.out.println("Supra benzin kullanir");

        /*
        Private methodlar override edilemez
        Eger Child classda parent classdaki private method ile
        ayni signature da bir method olusturursaniz
        bu overridding method OLMAZ

        *** private final ve static methodlar overridding edilmezler

         */

    }

    @Override //notasyon geldi

    void motor() {

    /*
    @Override notasyonu Javaya bir gorev verir
    Java, bu notasyonla birbirine baglı olan iki methodu
    surekli kontrol eder
    Eger parent classdaki overridden methodu silerseniz
    CTE verir.

    @Override notasyonu kullanmak mecburi degildir
    Eger Overridding method silinirse kodun CTE vermesini istersek
    @Override notasyonu kullanmaliyiz
     */

        System.out.println("Sırali 6 silindir 2JZ kullanır hocam");
    }
}
