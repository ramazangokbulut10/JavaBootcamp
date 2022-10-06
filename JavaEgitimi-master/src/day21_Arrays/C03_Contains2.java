package day21_Arrays;

import java.util.Scanner;

public class C03_Contains2 {
    public static void main(String[] args) {
        //soru 3 - kullanicidan aldiginiz bir ismin, verilen array'de olup olmadigini kontrol edip,
        //bize true veya false sonucu donen bir method olusturun
        String[] isimler= {"Basak", "Nurullah", "Fatih", "Adem", "Enes"};
        Scanner scan=new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim=scan.nextLine();
        boolean sonuc= contains(arananIsim,isimler);
        //sonucu buraya yazdiriyoruz
        if (sonuc){ //eger sonuc var ise
            System.out.println("girilen isim listede var");//yazdir
        }else{//yoksa
            System.out.println("girilen isim listede yok");//yazdir.
        }
    }
    public static boolean contains(String arananIsim, String[] isimler) {
        boolean sonucMethod=false; //
        //true ya da false nasıl karar verecegiz, eğer array deki her isme bakıp
        // bu isimlerden herhangi biri aranan isme esit ise o zaman sonuc true olacak
        //hic birisi esit degil ise zaten false idi, false devam edecek.
        for (int i = 0; i < isimler.length; i++) {// for loop umuzu olusturduk, isimler. length e kadar.
            if ((isimler[i].equalsIgnoreCase(arananIsim)))//eğer isimler equalsignorecase (buyuk kucuk bakma) (esitse aranan isimlerden birine)
                sonucMethod=true; //eğer aranan isimlerde var ise sonucumuzu true döndür
            //sonucu yazdirmak icin main methoda git ve sout u oraya yazdir.


            //her seferinde ayni islemi yapiyoruz, elemanları bir bir aliyoruz, kontrol ediyoruz, isimize yariyor ise
            //onu bir yere deger olarak atiyoruz

            //array de contains methodu yoktur. bir array de ihtiyacızınız olursa contains methodunu ekleyebilirsiniz
            //bunu da contains methodu olusturup üzerine gelince more seceneginden method olusturmayi secerek yapabilirz.

        }

        return sonucMethod;//yukariya default olarak false atatik, atamasaydik burası itiraz ederdi (alti kirmizi cizer)
    }
}

