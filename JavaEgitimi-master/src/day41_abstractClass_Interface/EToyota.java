package day41_abstractClass_Interface;

public abstract class EToyota extends DAraba{


    @Override
    protected void motor() {
        System.out.println("Toyota arabalar cevreci motor kullanir");
    }

    /*
    parent classdaki standart belirleyici methodlat
    (abstract method)'ların tamamı child class tarafından override edilmelidir

    concrete methodların override edilme mecburiyetleri yoktur
    istersek override edebiliriz, istemezsek etmeyiz

    Aslında Toyota classı da obje uretecegimiz bir class degil
    bu dueumda eger proje tasarımı yapıyorsanız
    Toyota classını da abstract yapmanız guzel olur
     */
}
