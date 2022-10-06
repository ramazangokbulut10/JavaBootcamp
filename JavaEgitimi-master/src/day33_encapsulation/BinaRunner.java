package day33_encapsulation;

public class BinaRunner {

    public static void main(String[] args) {

        Bina bina1=new Bina();

        bina1.setIsim("Yildiz Apartmani");
        bina1.setMalzeme("Isi yalitim");
        bina1.setYas(5);
        bina1.setDepremeDayanikliMi(true);

        System.out.println(bina1.getIsim()+"\n"
                +bina1.getMalzeme()+"\n"+bina1.getYas()+
                "\n"+bina1.isDepremeDayanikliMi());








    }
}
