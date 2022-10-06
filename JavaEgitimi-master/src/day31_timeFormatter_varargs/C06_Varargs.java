package day31_timeFormatter_varargs;

public class C06_Varargs {
    public static void main(String[] args) {
        new C06_Varargs().Go(1,"Hello");
        new C06_Varargs().Go(2,"Hello", "hi");
    }
    public void Go(int x, String... y){
        System.out.println(y[y.length-x]+" ");

        /*
        output:
        Hello
        Hello

         */
    }
}
