package day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*
        Soru 1) Kullanicidan email adresini girmesini isteyin,
        mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen email yaziniz");
        String email = scan.nextLine();

        if (!email.contains("@gmail")) {                   // icermiyorsa demek için basina ! konulur
            System.out.println("lutfen gmail adresi giriniz");

        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
                                                    //kullanıcının ne girecegini bilmedigimiz zaman length den
                                                   // @gmail.com kısmının degerini cıkarmak bizim için onemlidir

            System.out.println("Email adresiniz kaydedildi");

        }else {
            System.out.println("lutfen yazimi kontol edin");

        }




    }
}
