package day09_ternary;


import java.util.Scanner;

public class C06_SwitchCase {
    public static void main(String[] args) {

        /*
        kullanicidan gun ismi alin
        hafta ici veya hafta sonu oldugunu yazdirin
         */

        String input = "pazar";
        // kodun çalışma seklini buraya yazıyoruz scanner yerine sistem kullandıgımız icin boyledir (ınput sistemi)
        input = input.toLowerCase();

        switch (input) {
            case "pazartesi":
                System.out.println("Hafta ici");
                break;
            case "sali":
                System.out.println("Hafta ici");
                break;
            case "carsamba":
                System.out.println("Hafta ici");
                break;
            case "persembe":
                System.out.println("Hafta ici");
                break;
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");
        }

        Scanner scan = new Scanner(System.in);
                                   //yukarıdaki sorunun scanner halidir
        System.out.println("Lutfen bir gun adi giriniz");
        String gun = scan.next().toLowerCase();


        switch (gun) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Hafta sonu");
                break;
            case "pazar":
                System.out.println("Hafta sonu");
                break;
            default:
                System.out.println("Lutfen gecerli bir gun giriniz");


        }


    }
}
