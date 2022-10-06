package day33_encapsulation;

public class MobilyaRunner {
    public static void main(String[] args) {
        Mobilya masa=new Mobilya();
        masa.setMalzeme("Mdf");
        masa.setMarka("Istikbal");
        masa.setIsim("Oturma Grubu");
        masa.setFiyat(12000);
        System.out.println(masa.getMalzeme()+
                "\n"+masa.getMarka()+"\n"+masa.getIsim()+"\n"
                +masa.getFiyat());
    }
}
