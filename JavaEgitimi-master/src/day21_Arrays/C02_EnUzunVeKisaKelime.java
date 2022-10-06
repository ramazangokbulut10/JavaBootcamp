package day21_Arrays;

public class C02_EnUzunVeKisaKelime {
    public static void main(String[] args) {
        //Soru 2- Verilen String bir array’de en uzun ve en kisa String’leri yazdiran bir method olusturun

        String[] isimler = {"Erdal" , "Onur" ,"Mehmet" , "Hayrullah" , "Mihrican"};

        enUzunVeKisayiYazdir(isimler);


    }

    public static void enUzunVeKisayiYazdir(String[] isimler) {

        String enUzunKelime = isimler[0];
        String enKisaKelime = isimler[0];

        for (int i = 1; i < isimler.length; i++) {
            if (isimler[i].length()>enUzunKelime.length()){ //burada stringin uzunlugunu aldıgımız icin length() parantezlidir
                                                          //yoksa Array length olmalıdır
                enUzunKelime=isimler[i];
            }

            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];
            }
        }

        System.out.println("Arraydeki en uzun kelime :" +enUzunKelime);
        System.out.println("Arraydeki en kisa kelime :" +enKisaKelime);

        /*
        NOT:
         for (int i = 1; i <isimler.length ; i++) { // 1inci indexten baslarız cunku 0 ı yukarıda aldık
                                                    //length de parantez yok cunku Array length, stringte length yanina parantez koy
                                                //burada iki tane bağımsız if yaparız biri uzun biri kisa icin
            if (isimler[i].length() > enUzunKelime.length()) {//burada stringin uzunlugunu aldığımız icin length in yanında parantez kullaniyoruz.
                enUzunKelime=isimler[i];
            }

            //iki ayrı if cunku iki sartımız var en kısa ve en uzun
            if (isimler[i].length()< enKisaKelime.length()) {
                enKisaKelime=isimler[i];
         */
    }
}
