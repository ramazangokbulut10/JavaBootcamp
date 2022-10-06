package day09_ternary;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {

                 /*
                 kullanicidan gun numarasini alip
                 1 ise pazartesi,
                 ...
                 7 ise pazar yazdiralim
                 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo = scan.nextInt();

        /*
        switch yanına yazılan () neye gore case atayacagımızı gosterir
        Java girilen degere gore case'i bulur ve o satirdan calismaya baslar
        break yazisi gorunceye veya switch parantezine kadar devam eder

        if-else if- ... yapisinda oldugu gibi
        hiçbir sarta uymayanları default keyword kullanır
         */


        switch (gunNo) {

            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Sali");
                break;
            case 3:
                System.out.println("Carsamba");
                break;
            case 4:
                System.out.println("Persembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Gecerli gun numarasi giriniz");

        }

    }
}
