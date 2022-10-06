package day44_collections;

public class CollectionsNedir {

    /*
    1- Collections: Java'da birden fazla data barındırabilen yapılardır. Interface ve Class'dan olusur.

2- Interface'ler ortak ozelliklere sahip child class'lari bir catı altında toplamak için kullanılır.

3-              Collections
        List    Queue (ve Deque)       Set

4- Set -> (kume) elementler tekrarsiz
   Linked -> bagli demek, (Halay) ekleme ve cikarma cok iyi, arama cok yavas
   Tree -> (Dogal Sirali) eklenen her element natural order'a gore yerleştirilir.
   Hash -> her bir element için unique bir hash code olusturup, arşive yerleştirir, bulmada hızlıdır. (Firisten buluyo tak yazdırıyor)
   Queue -> (Yemek Kuyrugu) eklenen sona eklenip, ayrılan bastan ayrılır

5- LinkedList, birbirine baglı node'lar olusur, her bir node'da bir deger ve sonraki node'un adresi bulunur.
   İlk element Head'dir, head sadece adres icerir, deger icermez, son elementde ise değer vardır, adress olarak null pointer kullanılır.

6- Linkedlist'in 3 tane parent Interface'i vardır. LinkedList olustururken data turu LinkedList secilirse tum parent'larindaki
    ozellikleri kullanabiliriz. ( List, Queue, Deque)
    List, Deque veya Queue secilirse o interface'lerdeki ozellikleri kullanabilir
     */
}
