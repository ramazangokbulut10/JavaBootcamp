package day33_encapsulation;

public class Ogretmen {

    private String isim;
    private String soyisim;
    private String brans;


    /*
    Bazen de yetkileri sınırlamak degil de
    yapilan isi daha iyi tanımlamak icin
    encupsalition kullanılır

    Bu yaklasımı kullanan classlarda
    tum veriableler private yapılıp
    hepsi icin getter ve setter olusturulur
     */


    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getBrans() {
        return brans;
    }

    public void setBrans(String brans) {
        this.brans = brans;
    }
}
