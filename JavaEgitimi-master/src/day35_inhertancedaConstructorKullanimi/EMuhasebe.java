package day35_inhertancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel {

    EMuhasebe(){
        System.out.println("Muhasebe parametresiz cons");
    }
    EMuhasebe(String isim){
        System.out.println("Muhasebe parametreli cons");
    }



}
