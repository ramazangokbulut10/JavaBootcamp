package day35_inhertancedaConstructorKullanimi;

public class AGrandParent {

    protected String isim = "Grandpa ismi belirtilmedi";

    /*
    her classda görünmese bile bir constructor vardır
    bu classdan obje olusturmak istedigimizde
    default constructor devreye girecektir

    Default constructoru gözlemleyemeyecegimiz icin
    onun yerine kullanılabilecek parametresiz constructor olusturalim
     */

    protected String grandpaKlupAdi ="Grandpa Klubu";

    AGrandParent(){
        System.out.println("Grandpa constructor calisti");
    }










}
