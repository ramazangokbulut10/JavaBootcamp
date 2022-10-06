package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class C02_ListIterator {
    public static void main(String[] args) {
        /*
        Soru 4) Bir listedeki elementleri iterator kullanarak sondan basa dogru yazdirin
         */

        List<Integer> liste =new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);

        //sondan basa gelenilmek için
        //once sona gitmek lazım
        ListIterator li1 = liste.listIterator();
        System.out.println(liste); //[2, 13, 56, 23, 45, 14, 40]
                // burada iterator basta öncesinde eleman varsa al yana kaydır

        while (li1.hasNext()){
            li1.next();
        }
        //bu loop bizi sona götürür

        while (li1.hasPrevious()){
            System.out.print(li1.previous()+" "); //40 14 45 23 56 13 2
                        //öncesinde eleman varsa al ve başa koy diyoruz
        }






    }
}
