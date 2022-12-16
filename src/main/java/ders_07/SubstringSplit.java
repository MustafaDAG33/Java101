package ders_07;

import java.util.Scanner;

public class SubstringSplit {
    public static void main(String[] args) {

        /*
        kullanicidan isim soyisim ve kredi karti bilgisini isteyin.ve asagidaki gibi yazdirin.
        isim-soyisim : M***** B*******
        KART NO : **** **** **** 1234
         */

        Scanner input = new Scanner(System.in);
        System.out.println("isminizi girin");
        String ad = input.nextLine();

        System.out.println("soyisminizi giriniz");
        String soyad = input.nextLine();

        System.out.println("karti bilgisini giriniz");
        String kart = input.next();

        String yeniAd = ad.substring(0,1).toUpperCase() + ad.substring(1).replaceAll("\\S", "*");
        String yeniSoyad = soyad.substring(0,1).toUpperCase() + soyad.substring(1).replaceAll("\\S", "*");
        String yeniKart = kart.substring(0,12).replaceAll("\\S", "*") + " " + kart.substring(12);

        if(kart.length()!=16){
            System.out.println("gecersiz kart no");
        }else{
            System.out.println(yeniAd+ " " + yeniSoyad);
            System.out.println(yeniKart);
        }

















    }
}
