package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        kullanıcıdan tam sayıları alın
        kullanıcı çift sayi girdigi muddetce sayıları yazdirin
        tek sayi girdiginde işlemi bitirin
         */

        //ram dolmasın diye loopun dısında atamalar yapılmalıdır
        Scanner scan = new Scanner(System.in);
        int sayi =0;

        //While ile yapalım
        /*
        Looplarda kullanacağımız veriableleri looptan önce yazmalıyız
        While loopda loopdan önce olusturdugumuz bu veriablea
        atayacağımız degeri iyi dusunmemiz gerekiyor.
         */

        while (sayi%2==0){ //  (0%2==0  true)  (!0%2==0  false) dir önemli

            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift :" +sayi);
            }else {
                System.out.println("Girilen sayi tek, benden bu kadar");
            }
        }


        //do while loop ile yapalım
        //do While loopda onceden olusturulan veriableada hangi deger atandıgının
        //hic bir onemi yok kodumuz her durumda calısır

        /*
        do while in dezavantajı:
        ilk calistirma kontrol yapılmadan oldugu icin
        loopun body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */

        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift : " + sayi);
            }else{
                System.out.println("Girilen sayi tek, benden bu kadar");
            }

        }while (sayi%2==0);
    }
}
