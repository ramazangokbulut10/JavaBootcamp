package day44_collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class C05_LinkedList_ListDataTuru {
    public static void main(String[] args) {

       /*
      set(kume)--> benzersiz kumeler gibi uniq
     Queue--> yemekhane kuyrugu gibi dusunulebilir
     linked (Hlalay)-->  birbirine bagli
     Tree (Agac gibi)--> dogal sirali ozel  sorltlanmis gibi
     hash(hizli) --> ozel raf adi sayesinde hizli erisim
         */

        /*
        LinkedList
    Halaya benzer, birbirine bagli. Ekleme ve cikarmada rahat, arama yaparken yavas.
    Ilk eleman her zaman head'dir. Head'te data yoktur, sadece adress vardir.
    Son eleman(tail) null'i point eder.
    Her elemanin icinde data ve adress kismi olmak uzere iki kisim vardir.
    Tum elemanlar pointer'lar/adress'ler kullanilarak birbirine baglanir.
    Her eleman node olarak adlandirilir.
         */



        LinkedList<String> ll1 = new LinkedList<>();

        List<String> ll2 =new LinkedList<>();

        Queue<String> ll3 = new LinkedList<>();

        Deque<String> ll4 = new LinkedList<>();


        ll2.add("Berk");
        ll2.add("Done");
        ll2.add("Enes");
        ll2.add("Ayse");

        System.out.println(ll2);
        System.out.println(ll2.remove(3));

        //eger listemiz Integer elemetlerden olusuyorsa
        //direkt sayi yazarsak index olarak kabul eder
        //bir variable a atama yapar ve o remove da o variable in ismini yazarsak obje olarak kabul eder

        System.out.println(ll2.remove("Kemal"));
        System.out.println(ll2.isEmpty());

        ll2.set(1,"Serap");
        System.out.println(ll2);


        ll1.add("Berk");
        ll1.add("Ismail");
        System.out.println(ll1);//ll2 deki tum elementleri ll1 ille karsılastırır
        //ll1 de olmayanları siler

        ll2.retainAll(ll1);
        System.out.println(ll2);

        System.out.println(ll2.hashCode());//2066939

        ll2.add("Fatih");
        System.out.println(ll2.hashCode());//131726141







    }
}
