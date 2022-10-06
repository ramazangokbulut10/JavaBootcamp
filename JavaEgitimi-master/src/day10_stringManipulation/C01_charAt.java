package day10_stringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str ="Java ogrenmek ne guzel.";

        System.out.println(str.charAt(0)); // ilk harfi yazdırır(J)

        System.out.println(str.toUpperCase().charAt(7)); //R harfini yazdırır

        System.out.println(str.charAt(21)); // l harfini verir

        /*
        System.out.println(str.charAt(22)); // senin verdiğin indeks sınırların dışında dedi
                                           // son harfi bulmak icin str'in uzunlugunun 1 eksigini index olarak gireriz
                                          // eger index olarak uzunlugu veya daha bir sayiyi girersek Java exception verir

                                        //char karakter demektir sadece harfleri degil karakterleri de yani boşlukları da alır
         */


          //charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
         // String methodlarından kullanmamiz gereken bir method varsa
        // charAt() 'den önce kullanmaliyiz

        //toLowerCase kucuk harf, toUpperCase büyük harftir




    }
}
