package ders_04;

import java.util.Scanner;

public class TernaryTekrar01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" ilk sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("2.sayiyi giriniz");
        int sayi2 = input.nextInt();

        int kucuk = sayi1>sayi2 ? sayi2 : sayi1  ;

        System.out.println(kucuk);

        System.out.println("bir sayi giriniz");
        int a = input.nextInt();

        String tekCift = a%2==0 ? "cift sayi" : "tek sayi";
        System.out.println("tekCift = " + tekCift);

        System.out.println("bir sayi giriniz");
        int abs = input.nextInt();

        int mutlak = abs<0 ? abs*-1 : abs;
        System.out.println(mutlak);

        System.out.println("bir sayim giriniz");
        int b = input.nextInt();

        Object sayi = b>0 ? "sayi pozitif" : b*b;
        System.out.println(sayi);




    }
}
