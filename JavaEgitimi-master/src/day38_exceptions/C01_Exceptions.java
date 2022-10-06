package day38_exceptions;

public class C01_Exceptions {
    public static void main(String[] args) {

        /*
        int a = 10;
        int b = 0;

        System.out.println(a/b); // ArithmeticException / by zero hatası verir

         */

        /*
        bir sorunla karsilasmayi beklediginiz noklarda
        if else ile sorunu yakalayıp onunla ilgili
        cozum uretebilirsiniz

        ama sorunu her zaman if else ile cozemeyecegimizden
        Java try-catch bloklar'i olusturmustur.
         */

        int c =1000;
        int d =50;
        int sayac =1;

        while (sayac<100){

            if (d==0){
                System.out.println("İslem yapilirken payda sifir oldu. dikkat etmelisiniz");
            }else {
                System.out.println(c/d);
            }

            d--;
            sayac++;
        }





    }
}
