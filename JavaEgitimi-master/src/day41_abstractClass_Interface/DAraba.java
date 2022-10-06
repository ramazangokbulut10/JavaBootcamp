package day41_abstractClass_Interface;

public abstract class DAraba {
    /*
    abstract classda main method opsiyoneldir
    eger abstarct class sadece child classların
    tasımak zorunda oldugu ozellikleri belirlemek icin olusturulduysa
    main methoda ihtiyac olmaz
    sadece abstract methodlar olur

    ama bir abstract method da
    standart belirlemek dısında da methodlar calisabilir
    bu durumda ihtiyac olursa method olusturulabilir

     */

    protected abstract void yakit();

    protected abstract void kaporta();
    protected abstract void motor(); //soyut method

    /*
    sadece child classların mecburi tasıyacakları ozellikleri belirleyen methodlar
    abstract metdod olur ve abstract methodların body si olmaz
     */


    public void klima(){ //concrete method
        System.out.println("Bazi arabalarda klima olmayabilir");

        /*
        abstract olmayan methodlara concrete method denir
        abstract bir methodu abstract keyword ile belirtmek zorunludur
        concrete methodlarda bunun declare edilmesine gerek yoktur
        biz sadece abstraction ile ilgili konustugumuzda
        abstract olmayan methodlardan bahsetmek icin concrete tabirini kullanırız
         */
    }



}
