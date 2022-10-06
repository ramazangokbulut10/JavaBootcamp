package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {

        Araba arb1 = new Araba();

        //arb1 objesi uzerinden marka variablesine ulasabildim
        // degistirebildim(yazma(set)), ve yazdirabildim(okuma(get))

        arb1.marka ="Toyota";
        System.out.println(arb1.marka); //Toyota

        //access modifier kullanarak marka veriablea ulasımı
        //tamamen serbest yapabilir veya tamamen engelleyebilirim
        //bunu yapmak icin ise privete yaparız modeli
        //private yaptıgımız modele hicbir sekilde ulasamayız
        // kanıtlamak icin Araba classında modeli private yaptık

        //yani accest modifier ya hep ya hiç der
        // Ya ulasabilirsin ya da degistirebilirsin birini sec

        // modeli degistirelim ama goremeyelim
       // yakiti da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //          private bir dataya baska classlardan ulasmak mumkun olmadigindan
        // 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim


        arb1.setModel("Corolla"); //model olarak Corolla atadık
        //arb1.getYakit();//kullanmak istiyorsak eger sout icine yazilmalidir
        System.out.println(arb1.getYakit());//elektrikli bilgisini aldik

        //modeli yazdirma imkanımız yok cunku getter yoktur
        //ayrica yakiti degistiremeyiz cunku setter yok







    }
}
