package day40_final;

public abstract class CAbstract {

    /*
    abstract class:
    bu classlar methodlarla ilgilidir variableler ile degil
     */


    void toplama(){
        System.out.println("Bu method toplama yapar.");
    }


   abstract void carpma();


    abstract void bolme();

    void cıkarma(){
        System.out.println("Bu method cikarma yapar");
    }


    //abstract void cıkarma(){}//Abstract methods cannot have a body diye hata verir


    /*
    bir methodun basına abstract yazarsanız
    bu methodun child classlar icin bir standart oldugunu declare ederiz
    ve method bodysine ıhtiyac kalmaz
     */
}
