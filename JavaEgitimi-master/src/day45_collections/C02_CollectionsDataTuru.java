package day45_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class C02_CollectionsDataTuru {
    public static void main(String[] args) {

        /*
        Collections <dataTuru> nu Object secmeniz durumunda
        Collection a farklı data turlerinden objeler koymamıza izin verir
        Bu depolama acısından bize esneklik saglar
        Ancak islem yaparken tum objeleri Object olarak tanımladıgımızdan
        cok fazla casting yapmamiz gerekebilir.
         */

        List<String> liste = new ArrayList<>();
        //liste.add(5);
        //liste.add('s');
        //liste.add(true);

        List list = new ArrayList<>();//List<Object> list = new ArrayList<>(); de olabilir

        list.add(5);
        list.add('s');
        list.add(true);
        list.add("Ali");

        System.out.println(list);//[5, s, true, Ali]

        //list.set(0,list.get(0)+5); //obje olduğu için olmaz ama
        list.set(0,(Integer)list.get(0)+5); //yapınca olur

        list.set(3,list.get(3)+" Can");


        System.out.println(list);


        Set<Object> set1 = new HashSet<>();
        set1.add(5);
        set1.add(true);
        set1.add('5');

        System.out.println(set1);


    }
}
