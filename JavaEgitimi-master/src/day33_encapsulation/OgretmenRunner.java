package day33_encapsulation;

public class OgretmenRunner {
    public static void main(String[] args) {

        Ogretmen ogr1 =new Ogretmen();

        ogr1.setIsim("Zeliha");//degistirip
        System.out.println(ogr1.getIsim()); //yazdiririz

        ogr1.setSoyisim("Oznuk");
        System.out.println(ogr1.getSoyisim());

        ogr1.setBrans("Turkce");
        System.out.println(ogr1.getBrans());

        /*
        Bu yontemde data hiding degil
        daha anlasilir bir kod amaclanmıs olur
        hepsi icin getter ve setter olusturulur
         */



    }
}
