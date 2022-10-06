package day32_stringBuilder;

public class C06_replace {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Calm down");

        sb.replace(5,10,"Up");

        //replace istediğimiz degere istedigimiz degeri atamamızı saglar
        //nereyi degistirmek istiyorsak onu yapıyoruz

        System.out.println(sb); //Calm Up


        sb.replace(4,5,"---"); //Calm---Up
        //4. index ile 5. index arasına benim istedigimi yaz diyoruz
        System.out.println(sb);

        sb.replace(4,7," ");
        System.out.println(sb); //Calm Up

        sb.replace(5,7,"down");
        System.out.println(sb); //Calm down




    }
}
