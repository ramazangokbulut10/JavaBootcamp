package day11_stringManipulation;

public class C07_startsWith {
    public static void main(String[] args) {

        String imput = "Java gun gectikce guzellesiyor";

        System.out.println(imput.startsWith("J"));//true

        System.out.println(imput.startsWith(""));//true

        System.out.println(imput.startsWith("gun",5));
                                            //true (5. deger dahil olan sonrası gun ile mi baslıyor diyor)


    }
}
