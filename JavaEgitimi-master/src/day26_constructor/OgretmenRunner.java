package day26_constructor;

public class OgretmenRunner {
    public static void main(String[] args) {
        Ogretmen ogretmen1=new Ogretmen();
        System.out.println("Ogretmen 1 " + ogretmen1);

        System.out.println("*********************");
        Ogretmen ogretmen2=new Ogretmen("Emre","Akdogan","1/1/2001","Matematik","Fizik");

        System.out.println("*********************");
        System.out.println("Ogretmen 2 " + ogretmen2);

        System.out.println("*************************");
        Ogretmen ogretmen3=new Ogretmen("Cavidan","Kabinkara","1/1/1991");
        System.out.println("Ogretmen 3 " + ogretmen3);

        System.out.println("*********************");
        Ogretmen ogretmen4=new Ogretmen("Zeliha","Oznuk","16/03/1993","Turkce","Turk Dili ve Edebiyati");
        System.out.println("ogretmen4 = " + ogretmen4);

    }
}
