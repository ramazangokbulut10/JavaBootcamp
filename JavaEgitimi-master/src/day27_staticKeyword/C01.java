package day27_staticKeyword;

public class C01 {

    static int sayi =10;//static variabledir
    int rakam =5;//instance variabledir

    public static void main(String[] args) {

        /*
        class levelda iki tur variable olusturabiliriz
        static (class) variable
        instance (class) variable

        static variableler tum classlardan kullanılabilirken
        instance olanlar sadece static olmayan methodlarda direkt kullanılabilir
        instance variablelara static methoddan ulasmak istersek
        obje olusturmamız gerekir

        instance variablelar obje variable oldugu için
        herhangi bir satırda instance variablein degerinin ne oldugunu bulmak için
        OBJE OLUSTURULAN SATIRDAN İTİBAREN kod incelenmelidir

        static variableler class variable oldugu için
         herhangi bir satirda static variable in degerini bulmak icin
         CLASSIN BASINDAN itibaren kod incelenmelidir.


         */

        C01 obj1 = new C01();
        System.out.println("obj1'in rakam deger :" +obj1.rakam);//5
        System.out.println("obj1'in sayi degeri :" +obj1.sayi);//10


        obj1.rakam+=1;//5+1=6
        sayi+=1;//10+1=11

        System.out.println("1 artırdıktan sonra oby1'in rakam degeri :" +obj1.rakam);//5
        System.out.println("1 artırdıktan sonra oby1'in sayi degeri :" +obj1.sayi);//11

        C01 obj2 = new C01();

        System.out.println("obj2'nin rakam deger :" +obj2.rakam);//5
        System.out.println("obj2'nin sayi degeri :" +obj2.sayi);//class variable olduğu için baştan beri inceler
                                                      // ve son almış olduğu son degeri yazdırır yani 11 yazdırır

        obj2.rakam++;//5+1=6
        obj2.sayi++;//11+1=12

        System.out.println("1 artırdıktan sonta obj2'in rakam deger :" +obj2.rakam);//6
        System.out.println("1 artırdıktan sonra obj2'in sayi degeri :" +obj2.sayi);//12


    }
}
