package day38_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_ExceptionOdev {
    public static void main(String[] args) {

        String[] urunler = {"Nutella", "Cokokrem", "Sut", "Cay", "Findik"};
        Scanner scan = new Scanner(System.in);
        int istenenIndex = 0;
        while (true) {
            try {
                System.out.println("Istediginiz urunun sira nosunu giriniz");
                istenenIndex = scan.nextInt();
                System.out.println("Aradiginiz urun : " + urunler[istenenIndex - 1]);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Urun index'i icin bir tam sayi girmeniz gerekli");
                scan.next();
                continue;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Girdiginiz sira listemizde bulunmuyor " +
                        "\nSira numarasi en fazla : " + (urunler.length) + " olabilir");
                scan.nextLine();
                continue;
            }
        }
    }
}
