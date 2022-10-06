package day10_stringManipulation;

public class C04_equalsIgnoreCase {

    public static void main(String[] args) {

         String str1= "Ali Can";
         String str2= "ali can";
         String str3= "ALI CAN";
         String str4="Ali Can_";

        System.out.println(str1.equals(str2));                   //false yazar cunku isisi birbirine esit degildir
        System.out.println(str1.equalsIgnoreCase(str2));        //true olur hiçbir seyi onemsemedigi icin

        System.out.println(str2.equals(str3));                //false
        System.out.println(str2.equalsIgnoreCase(str3));     //true buyuk kucuk harf onemsemedigi icin

        System.out.println(str1.equals(str4));             //false
        System.out.println(str1.equalsIgnoreCase(str4));  //false verir cunku sonda (_) isareti var

                                                        //equalsIgnoreCase (==) demektir.
                                                       //equals ise (=) demektir.

    }
}
