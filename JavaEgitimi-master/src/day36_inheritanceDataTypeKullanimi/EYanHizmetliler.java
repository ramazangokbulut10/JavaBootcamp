package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetliler extends BMuhasebe{

   protected int saatUcreti =12;
   protected int gunlukMesai =9;



    protected void maas(){

        System.out.println("Yan Hizmetliler :" +(30*saatUcreti*gunlukMesai) + " maas alir.");
    }

    protected void issizlikSigortasi(){

        System.out.println("Yan Hizmetliler %30 indirimli issizlik sigortasi yaptirabilir.");
    }

    public static void main(String[] args) {
        /*
        Overriding child class daki bir methodun
        parent class daki ayni isimdeki methodu
        etkisiz hale getirerek
        kendisinin spesifik ozelligini ortaya cikarmasidir

        Overriding'i nerede dikkate aliyoruz?
        bir obje olusturulurken
        data turu ve cons. farkli ise

        eger bir obje olusturulurken
        data turu ve cons. farkli ise
        objenin ozelliklerini belirlerken
        3 konuya dikkat edilmeli
        1- Obje cons.ın oldugu classda olusur
        2- objenin ozelliklerini aramaya data turunun oldugu class dan baslarız
         bu class da aranan ozellik bulunamazsa parent class lara bakilir
         orada bulamazsak CTE verir.

         eger aranan ozellik variable ise buldugumuz ilk degeri yazdirir

         3- Aranan ozellik method ise
         degeri yazdirmadan once
         override edilmis mi diye kontrol edilmelidir
         (yani etkisiz(gecersiz) hale gelmiş mi diye bakılmalıdır)
         eger override edildiyse en guncel degeri yazdiririz


         */

        BMuhasebe yh1 = new EYanHizmetliler();
        System.out.println(yh1.gunlukMesai);//Muhasebe Classından alır veriable oldugu icin = 8
        System.out.println(yh1.saatUcreti);//Muhasebe Classından alır veriable oldugu icin  = 10

        yh1.maas(); //muhasebe degil YH Classından alır
        yh1.ozelSigorta();// Muhasebeden alır
        yh1.sigorta();// Personelden calıstırır

        System.out.println(yh1.isim);//Personelden calıstırır
        System.out.println(yh1.soyisim); //Personelden calıstırır
        System.out.println(yh1.departman);//Personelden calıstırır

        //System.out.println(yh1.issizlikSigorta);
        //Aramaya muhasebeden basladıgımız icin
        //issizlikSigorta bulamadık CTE verir







    }








}
