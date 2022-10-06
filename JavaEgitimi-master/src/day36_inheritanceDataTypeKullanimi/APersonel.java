package day36_inheritanceDataTypeKullanimi;

public class APersonel {

    String isim = "Isim belirtilmedi";
    String soyisim ="Soyisim belirtilmedi";
    String departman ="Departman belirtilmedi";


    protected void maas(){
        System.out.println("Tum personelimiz maas alir");
    }

    protected void sigorta(){
        System.out.println("Tum personele sigorta yapilir");
    }



}
