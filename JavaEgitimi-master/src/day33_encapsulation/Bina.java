package day33_encapsulation;

public class Bina {
    private String malzeme;
    private String isim;
    private int yas;
    private boolean depremeDayanikliMi;
    public String getMalzeme() {
        return malzeme;
    }
    public void setMalzeme(String malzeme) {
        this.malzeme = malzeme;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public int getYas() {
        return yas;
    }
    public void setYas(int yas) {
        this.yas = yas;
    }
    public boolean isDepremeDayanikliMi() {
        return depremeDayanikliMi;
    }
    public void setDepremeDayanikliMi(boolean depremeDayanikliMi) {
        this.depremeDayanikliMi = depremeDayanikliMi;
    }
}
