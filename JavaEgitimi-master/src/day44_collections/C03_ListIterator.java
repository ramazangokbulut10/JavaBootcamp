package day44_collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class C03_ListIterator {
    public static void main(String[] args) {
        /*
     Bir listi istenen n. elemana kadar 5 artır
    */
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(13);
        liste.add(56);
        liste.add(23);
        liste.add(45);
        liste.add(14);
        liste.add(40);
        System.out.println("Liste Başlangıç Hali : " + liste); // Liste Başlangıç Hali : [2, 13, 56, 23, 45, 14, 40]


        Scanner scan = new Scanner(System.in);
        System.out.println(" Kaç Eleman 5 Artırılacak : ");

        int index = scan.nextInt();
        int i = 1;
        int temp;
        ListIterator lit1 = liste.listIterator();

        while (lit1.hasNext()) {
            temp = (Integer) lit1.next();
            if (i <= index) {
                lit1.set(temp + 5);
            }
            i++;
        }
        System.out.println(liste);
    }

}
