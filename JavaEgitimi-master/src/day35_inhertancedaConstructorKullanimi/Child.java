package day35_inhertancedaConstructorKullanimi;

public class Child extends BParent {

    String isim = "Child isim belirtilmedi";

    protected String childKlupAdi = "Child Klubu";

    Child(){
        System.out.println("Child constructor calisti");
    }


    public static void main(String[] args) {

       // AGrandParent gp1 = new AGrandParent();
        //bu objeyi olusturmak icin Grandpa Cons. calisir
        //Parent veya Child con calismaz

        Child child1 = new Child();
        child1.grandpaKlupAdi ="Child1";
        child1.parentKlupAdi ="Child2";

        //child1 objesi icin Child constructor objesi calisır

        /*
        Javada bir classı kullanabilmek icin
        o classdan obje olusturur dolayısıyla
        o classın costructorunu kullanırdık

        Java inheritance de parent classlardaki
        ozellikleri kullanabilmek icin
        o classların constructorlarini
        otomatik calistiran bir yapi kurulmustur

        Ornegin biz child classında
        Child classında bir obje olusturmak istedigimizde
        Child cons ını kullanırız

        Java Child(){} gordugunde
        once parentin constructorini calıstırmam lazım der
        buradan parent con a gider
        Parent classında Prent(){}gorunce
        once bunun parent inin yani Grandparent cons.
        calismasi lazim der
        Boylece extends keyword olmayan classa kadar gider ve oradan baslayarak
        tum constructorlari asagı dogru calistirir
         */





    }



}
