package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {

        LocalDateTime tarhSaat = LocalDateTime.now();
        System.out.println("ilk olusturulan tarih :" +tarhSaat);
        //ilk olusturulan tarih :2022-07-25T21:45:49.438021

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd/M/yy hh:mm");

        System.out.println(dtf1.format(tarhSaat));// 25/7/22 09:45

        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");

        System.out.println(dtf2.format(tarhSaat));// 25/Tem/2022 21:48

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("d/MMMM/yyyy HH:mm");

        System.out.println(dtf3.format(tarhSaat));// 25/Temmuz/2022 21:51

        /*-------------------- GUN  -----------------------------------------
        d        : basta 0 varsa onu yazmadan gun numarasi
        dd       : tek haneli gunleri 01 gibi basina sifir yazarak gun numarasi
        DDD      : yilin kacinci gunu oldugunu yazar
        E,EE,EEE : gun isminin ilk 3 harfi
        EEEE     : gun isminin tamamini
        --------------------   AY  ----------------------------------------
        M    : basta 0 varsa onu yazmadan ay numarasini
        MM   : tek haneli aylari 01 gibi basina sifir yazarak ay numarasini
        MMM  : Ay isminin ilk 3 harfini
        MMMM : Ay isminin tamamini
        YY   : yilin son iki rakamini
        YYYY : Yilin tamamini
        -------------------   Saat  ----------------------------------------
        HH : saatin tamami, tek rakamli saat olursa 02 gibi
        H  : 24 saati uzerinden
        hh : pm / am format 12 duzeni
        m  : minute
        a  : yazarsak AM veya PM yazar */



    }
}
