package ders_07;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("tam sayi giriniz");
        int sayi = input.nextInt();

        String num = sayi%2==0 ? "cift sayi" : "tek sayi";
        System.out.println("num = " + num);

        System.out.println("ad soyad giriniz");
        String adSoyad = input.nextLine();

        System.out.println("kart bilgisini giriniz");
        String kartNo = input.next();






    }
}
