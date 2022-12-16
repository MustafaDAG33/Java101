package ders_06;

import java.util.Scanner;

public class ContainsLengthTernary {
    public static void main(String[] args) {


        /*
           Kullanicidan isim isteyin eger;
           1)isim "a" harfi iceriyorsa "girdiginiz isim a harfi iceriyor
           2)isim "Z" harfi iceriyorsa "girdiginiz isim Z harfi iceriyor"
           3)ikiside yoksa "girdiginiz isim a veya Z harfi icermiyor" yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");
        String isim = input.nextLine();

        if(isim.contains("a")){
            System.out.println("girdiginiz isim a harfi iceriyor");
        }else if(isim.contains("Z")){
            System.out.println("girdiginiz isim z harfi iceriyor");
        }else{
            System.out.println("girdiginiz isim a veya z harfi icermiyor");
        }

        System.out.println("isminizi giriniz");
        String name = input.nextLine();

        System.out.println("soy isminizi giriniz");
        String soyad = input.next();

        String buyuk = name.length()> soyad.length() ? name : soyad;
        System.out.println(buyuk);






    }
}
