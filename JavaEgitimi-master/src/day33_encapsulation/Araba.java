package day33_encapsulation;

public class Araba {
    String marka ="Marka belirtilmedi";//markanın access mofier i default access modifier
                                 //oldugundan packace icerisinde kullanilabilir
    private String model ="Model belirtilmedi";
    private String yakit ="Elektrikli"; //Tum arabalar elektrikli ise bu variablenin degistirilmemesi gerekir


    // private yaptigimiz model ve yakit variable'larina erisimi yetkilendirelim
    // model'e deger atanabilsin ama gorulemesin(setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter)
    //


    public void setModel(String model) { //deger atamaya izin verir
        this.model = model;
    }


    public String getYakit() { // sadece getirebiliyor
        return yakit;
    }
}
