package day37_overridding;

public class EToyota extends DAraba {

    @Override
    void marka() {
        /*
        super.marka();
        Eger hem overridden hem de overridding methodun calismasini istersek
        ilk satira super.marka() yazabiliriz
        ama her zaman ilk satıra yazılmak zorunda degildir
        (biz başa ilk o calıssın diye yazarız cünkü Java yukarıdan asagıya calisir)

         */
    }

    void motor(){
        System.out.println("Toyota araclar Toyota marka motor kullair");
    }




}
