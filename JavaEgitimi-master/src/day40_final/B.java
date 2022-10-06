package day40_final;

final public class B extends A{
    public static void main(String[] args) {

        B obj = new B();
        obj.isim = "Zeliha";
        //obj.okul="Java koleji";//Cannot assign a value to final variable 'okul' dedigi icin degismez


        System.out.println(obj.isim);
        System.out.println(A.OKUL);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


        /*
        bir class final olarak belirlenirse,
        o class inherit edilemez
         */



    }
}
