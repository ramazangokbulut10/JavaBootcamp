package day16_forloop;

public class C01_ForLoop {
    public static void main(String[] args) {

        // verilen bir pozitif tam sayinin
        // tam bolenlerini yazdiralim

        int input = 20;

        for (int i = 1; i <=input; i++) {
            if (input%i==0){
                System.out.print(i+ " ");
            }

        }
        System.out.println("");


        for (int i = 0; i <=24; i+=3) {     //tam bölenlerini bulmak amacıyla o sayı yazılır
            if (i%3==0){
                System.out.print(i + " ");
            }
        }



    }
}
