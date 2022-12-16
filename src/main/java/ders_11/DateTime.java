package ders_11;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public static void main(String[] args) {

        LocalDate dt = LocalDate.now();
        System.out.println(dt);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime japon = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(japon);

        LocalDateTime istanbul = LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(istanbul);

        LocalDate bugun = LocalDate.now();
        LocalDate emekli = bugun.plusDays(789);
        System.out.println(emekli);

        LocalDate sabitTarih = LocalDate.of(2022, 10, 23);
        LocalDate emeklilik = sabitTarih.plusDays(789);
        System.out.println(emeklilik);

        //iki cocugun dogum tarihi arasindaki farki gun olarak hesaplayan kodu yaziniz.

        LocalDate cocuk1 = LocalDate.of(1991, 3, 3);
        LocalDate cocuk2 = LocalDate.of(1992, 3, 15);

        long fark = ChronoUnit.DAYS.between(cocuk1, cocuk2);
        System.out.println(fark);

        LocalDate istFethi = LocalDate.of(1453, 5, 29);
        LocalDate cumh = LocalDate.of(1923, 10, 29);

        long fark1 = ChronoUnit.MONTHS.between(istFethi, cumh);
        System.out.println(fark1);//ist fethi ile cumhuriyetin ilani arasindaki ay farki.

        LocalDate dogum = LocalDate.of(1991, 3, 12);
         int gun = dogum.getDayOfMonth();
        System.out.println(gun);//12

        int ay = dogum.getMonthValue();
        System.out.println(ay);//3

        Month s= dogum.getMonth();
        System.out.println(s);//march

        //

        LocalDate tarih = LocalDate.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String dtf1 = tarih.format(dtf);
        System.out.println(dtf1);

        LocalDateTime jap = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime alm = LocalDateTime.now(ZoneId.of("Europe/Berlin"));

        long f = ChronoUnit.HOURS.between(alm, jap);//almanyada ayin 21'i, japonya'da 22'si. onceki tarihi once yaziyoruz.
        System.out.println(f);










    }
}
