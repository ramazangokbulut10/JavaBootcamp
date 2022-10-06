package day11_stringManipulation;

public class C05_endsWith {
    public static void main(String[] args) {

        String str ="Ah be Java";

        System.out.println(str.endsWith("ava"));//true

        System.out.println(str.endsWith("be Java")); //true

        System.out.println(str.endsWith("Ah be Java")); //true

        System.out.println(str.endsWith("")); //true verir cunku sonda hicbir sey yoktur.
                                             // karakteri olmayan karaktersiz Java diyebiliriz.
       /*
       sadece son kelimeye bakar ve son kelime içnde arar
        */

    }
}
