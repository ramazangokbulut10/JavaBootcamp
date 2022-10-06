package day34_inheritance;

public class Isci extends Personel{

    /*
    Slayt not:
    *Alican parent classlarının her birinde kendini ifade edebilir.
* ancak personel Alican dediğimizde alt classlara artık bakmayız,
yani personel alican dediysek bunun artık işçi mi beyaz yakalımı o artık beni ilgilendirmiyor
personel Alican dediysem personel özellikleri beni ilgilendiriyor.
     */

    /*
    Normal hayatımızda parent cocuk sahibi olmaya karar verebilir
    Java'da ise child classlar ozelliklerini inherit etmek istedikleri
    classi kendilerine parent edinirler.


    Mesela isci classını olusturunca nelere ihtiyac var diye dusunursek
    Personel classındaki tum veriable ve methodlara ihtiyaci oldugunu gorebiliriz.

    Bu durumda yeniden o variable ve methodları olusturmak yerine
    Personel classını kendimize parent ediniriz

    Biz classi parent edinmek icin extends keyword kullanmaliyiz

    extends babamızın evi gibidir bizde olmayan onda vardır ve istedigimiz gibi kullaniriz

    bir class baska bir classi parent edindiginde
    1- Child Classlar parent classlar daki tüm özelliklere sahiptir
    2- Child Classlar parent classlardaki bazı özellikleri kendine uyarlayabilir
    3- Child classlar parent classlarda olmayan bazı extra özelliklere sahip olabilir.

     not: parent class'daki ozelliklerden hicbirini reddedemez ama degistirebilir
     */


    int persNo = 1001;

    public static void main(String[] args) {
        Isci isci1 = new Isci();//personel classından degil isci olusturduk
        System.out.println(isci1.isim);
        //kendi classımızda isim variable yok onun icin parente gideriz
        isci1.isim ="Selim";
        System.out.println(isci1.persNo);
        //1001 yazar kendi classımızda varsa onu kullanırız

        isci1.maas(); //Isciler minimum 15 euro saat ucreti alir yazdirir
        //cunku bu class icinde tanimladik 51. satirda
    }

    public void maas(){
        System.out.println("Isciler minimum 15 euro saat ucreti alir.");
        //biz bu classin icinde tanımlama yaptıgımız icin Personel classından almamıza gerek kalmiyor

    }

    public void ozelSigorta(){
        System.out.println("Iscilerden isteyene %50 indirimli ozel sigorta yaptirilir.");
    }


}




