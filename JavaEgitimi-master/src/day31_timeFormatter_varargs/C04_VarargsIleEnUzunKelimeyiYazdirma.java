package day31_timeFormatter_varargs;

public class C04_VarargsIleEnUzunKelimeyiYazdirma {
    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Deniz","Sumeyye","Ismail","Zeliha","Yasemen","Feyza","Enes");


    }

    public static void enUzunKelimeyiYazdir(String... kelime) {

        String enUzunKelime =kelime[0];

        for (String each:kelime) {
            if (each.length()>enUzunKelime.length()){
                enUzunKelime=each;
            }
        }
        System.out.println("Girilen kelimelerden en uzunu :" +enUzunKelime);//Girilen kelimelerden en uzunu :Sumeyye



    }
}
