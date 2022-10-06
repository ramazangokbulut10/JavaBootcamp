package day12_stringManipulations;

public class C04_substring {
    public static void main(String[] args) {

        String str= "Java cok yasa";


        System.out.println(str.substring(3,4)); //3den basla 4. icin bir karakter al yani "a" olur

        System.out.println(str.substring(5,7));//5den basla 2 karakter al 7ye kadar yani "co" olur

        System.out.println(str.substring(6,6));// "" hiclik cıkar karsimiza (6dan sonra 6dan önce dediği icin)

        System.out.println("====");

        //System.out.println(str.substring(6,2));  //exception:hata demektir
                                                  // sintex hatası yok java altını cizmiyor
                                                 // ama 6dan basla -2 karakter al dedigi icin
                                                // StringIndexOutOfBoundsException hatası verir
                                               //buna run time error(RTE) denir calısırken hata vermesidir

        //String str2= "23"; // javanın hatanın olsugunu söylemesine compaile time error(CTE) hata denir.






    }
}
