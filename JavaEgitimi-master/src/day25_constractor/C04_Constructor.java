package day25_constractor;

public class C04_Constructor {
    public static void main(String[] args) {
        C03 obj1=new C03();


        obj1.method01();//C03 method çalıştı
        System.out.println(obj1.isim);//Etka yazdı


        obj1.isim="Ali";
        System.out.println(obj1.isim);//Ali olarak degiğti

    }
}

