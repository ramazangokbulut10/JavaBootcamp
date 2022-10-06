package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str =" Bu gun ha va cok gu zel ";
        System.out.println(str.replace("",""));

        //hava kelimesini java yapalim dersek
        System.out.println(str.replace("h","J").replace(" ", ""));

        //ayni satirda bosluklari kaldırmak icin //System.out.println(str.replace(" ", "")); birlestirilebilir

        // guz el yerine harika yazalim
        System.out.println(str.replace("gu zel", "harika"));

        //cumleyi replace kullanarak Bugun Java cok guzel yapalim
        System.out.println(str.replace("Bu gun", "Bugun")
                .replace("ha va", "Java")
                .replace("gu zel", "guzel"));

        //yerine baska kelime atamak icin bu sistem kullanılır
        // ama kelimenin yukarıdakiyle aynı olmasına dikkat dilmelidir.



    }
}
