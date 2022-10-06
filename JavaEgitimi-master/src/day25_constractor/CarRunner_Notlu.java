package day25_constractor;

public class CarRunner_Notlu {
    public static void main(String[] args) {

            Car car1 = new Car();

            car1.fiyat = 150000;
            car1.yil = 2020;
            car1.marka = "Toyota";
            System.out.println("Car1 bilgileri\nMarka : " + car1.marka + "\nModel : " + car1.model +
                    "\nYil :   " + car1.yil + "\nFiyat : " + car1.fiyat);

            car1.benzinliArac();

            System.out.println("**************************************************");

            Car car2 = new Car();       //obje olusturuldu..

        /*                          FAKAT..
        marka
        model     ...          icin deger atamasi yapilmadi
        yil
        fiyat

         */
            System.out.println("Car2 bilgileri\nMarka : " + car2.marka + "\nModel : " + car2.model +
                    "\nYil :   " + car2.yil + "\nFiyat : " + car2.fiyat);
            car2.maxHiz(120);

        /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- O obje olusturulduktan sonra bir deger atandimi ?
        2- Objenin olusturuldugu class'da variable'a bir deger atanmismi ?
        3- O zaman data turune gore Java default degeri atar
         */

    }
}
