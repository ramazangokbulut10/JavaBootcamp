package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {

        // input olarak verilen 2 int'ı toplayıp sonucunu yazdıran
        // bit method oluşturalım

        int input1 = 20;
        int input2 = 20;

        // method 4 adımda oluşturulu
        // 1. adım method call
        // 2. adım argument eklenmesi gerekiyorsa ekleyelim
        //  eğer methodun return type'ı void'den farklı olacaksa
        //  bir variable oluşturup mehtod call'u assign edelim

        topla(input1, input2);

    }

    public static void topla(int input1, int input2) {

        // 3. adım method deklarasyonunda değişmesi gereken bölümleri değiştirelim
        // access modifier, return type vs...
        // 4. adım eğer return type void dışında bir şey ise
        //  return keyword'u ve dönecek değeri hesaplamalıyız

        System.out.println("Girilen iki sayinin toplami : " + (input1+input2));

    }


}