package day36_inheritanceDataTypeKullanimi;

import java.util.List;

public class DIsci extends BMuhasebe{

    protected int saatUcreti =11;
    protected int gunlukMesai =7;



    protected void maasIsci(){

        System.out.println("Isciler :" +(30*saatUcreti*gunlukMesai) + " maas alir.");
    }

    protected void ozelSigortaIsci(){

        System.out.println("Isciler %70 indirimli ozel sigorta yaptirabilir.");
    }

    public static void main(String[] args) {

       BMuhasebe isci1 = new DIsci();
       //İsci hem iscidir ve aynı zamanda muhasebenin bir calisanidir bu sebeple BMuhasebe yapınca hata vermez

        /*
        Bir obje olusturulurken
        Data turu ve cons. aynı classdan ise direkt o classa gidiyorduk

        (BMuhasebe isci1 = new DIsci(); DIsci olan kısım cons.dur)
        (BMuhasebe isci1 = new DIsci(); nurada iscini
         muhasebe classında tum calısanlarla birlikte haklarını görmek istiyoruz)


        Eger data turu ve cons. farkli ise
        oncelikle Data turunun oldugu classa gideriz
        ancak bizden istenen
        Isci classındaki spesifik ozellikler degil
        tum calisanlarla bereber sahip oldugu
        genel ozellikleri yazdirir

        Data türüyle variable aynı olursa dikkat edilmeli

         */

        System.out.println(isci1.gunlukMesai);//Muhasebeden alıp 8
        System.out.println(isci1.saatUcreti);//Muhasebeden alıp 10

        isci1.maas();//Muhasebeden alıp (Personel minimum :2400 maas alir)
        isci1.ozelSigorta();//Muhasebeden alıp
        isci1.sigorta(); //Personel

        System.out.println(isci1.isim);//Personel
        System.out.println(isci1.soyisim);//Personel
        System.out.println(isci1.departman);//Personel

        System.out.println("*************************");

        APersonel isci2 = new DIsci();

        //System.out.println(isci2.gunlukMesai);//Personel classında gunlukMesai olmadıgı icin hata verir
        //System.out.println(isci2.saatUcreti);//Personel classında saatUcreti olmadıgı icin hata verir

        isci2.maas();//

        //isci2.ozelSigorta();//Personel classında ozelSigorta olmadıgı icin hata verir
        isci2.sigorta(); //Personel

        System.out.println(isci2.isim);//Personel
        System.out.println(isci2.soyisim);//Personel
        System.out.println(isci2.departman);//Personel

        /*
        Eger Data turu olan classda aradıgımız ozellik
        varsa onun parentine gidenilir
        ama child a dönüs olmaz
        Aradıgı ozelligi bulamazsa CTE hatası verir
         */

       // BMuhasebe mhsb1=new BMuhasebe();//hem muhasebe classından olusmus hemde muhasebede arama yapar
       // BMuhasebe isci=new DIsci();//bu isci classında olusup aramaya muhasebeden baslar







    }


}
