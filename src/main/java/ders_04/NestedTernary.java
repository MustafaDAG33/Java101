package ders_04;

import java.util.Scanner;

public class NestedTernary {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();

        String y = sayi<100 ? sayi<10 ? "rakam" : "iki bas sayi" : "uc bas ve daha buyuk sayi";
        System.out.println(y);

        System.out.println("bir harf giriniz");
        char h = input.next().charAt(0);

        String ch = h>='A' && h<='z' ? h>='A' && h<='Z' ? "BUYUK HARF" : "KUCUK HARF" : "HARF DEGIL";
        System.out.println(ch);



        System.out.println("kisa kenar");
        byte a = input.nextByte();

        System.out.println("uzun kenar");
        byte b = input.nextByte();

        String ka = a==b ? "kare" : "dikdortgen";
        System.out.println(ka);

        System.out.println("bir sayi giriniz");
        int sayi1 = input.nextInt();

        String bas = sayi1>99 && sayi1<1000 ? "uc basamakli sayi" : "uc basamakli degil";
        System.out.println(bas);










    }
}
