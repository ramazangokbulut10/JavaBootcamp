package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir(7,"Deniz","Sumeyye","Ismail","Zeliha","Yasemen","Feyza","Enes");

        /*
        Varargs teorik olarak sonsuz sayida element alabilir
        bir methodda paramatre olarak varargs varsa
        varargsın sınırlarını bilebilmesi için
        parametrelerin sonuncusu olmalıdır

        Oncesinde farkli parametreler olabilir ama
        varargstan sonra parametre OLAMAZ

        Bu kuraldan oturu bir methodda sadece bir tane varargs olmalidir
         */

    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi,String... kelime) {

        String enUzunKelime =kelime[0];

        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu :" +enUzunKelime);//Girilen kelimelerden en uzunu :Sumeyye



    }
}
