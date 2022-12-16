package ders_04;

import java.util.Scanner;

public class TernaryTekrar {
    public static void main(String[] args) {


        int x = 13;

        String poz = x>0 ? "pozitif" : "pozitif degildir";
        System.out.println(poz);

        int a = 33;
        int b = 44;

        int kucukSayi = a<b ? a : b;
        System.out.println("iki sayidan kucuk olan = " + kucukSayi);

        //verilen bir sayinin mutlak degerini hesaplayan kodu giriniz.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

        int mutlak = sayi<0 ? sayi*-1 : sayi;
        System.out.println(mutlak);

        //iki sayi ayni isaretliyse sayilari carpiniz, farkli isaretliyse islem yapamam yaziniz.

        System.out.println("iki sayi giriniz");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        Object sonuc = (sayi1>0 && sayi2>0) || (sayi1<0 && sayi2<0) ? sayi1*sayi2 : "islem yapamam";
        System.out.println(sonuc);














    }
}
