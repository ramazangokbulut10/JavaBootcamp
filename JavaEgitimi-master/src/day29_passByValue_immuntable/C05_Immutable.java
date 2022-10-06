package day29_passByValue_immuntable;

public class C05_Immutable {
    public static void main(String[] args) {
        String isim= "Mine";
        isim=isim.toUpperCase();
        System.out.println(isim); // MINE
        isim="Zeliha";
        System.out.println(isim);
        for (int i = 0; i <100 ; i++) {
            isim += ".";
        }
        System.out.println(isim);
    }
}
