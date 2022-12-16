package ders_04;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sifrenizi giriniz");
        String sifre = input.next();

        if(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
            if(sifre.charAt(0)=='A'){
                System.out.println("gecerli sifre");
            }else{
                System.out.println("gecersiz sifre");
            }


        }else if(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'){
            if(sifre.charAt(0)=='z'){
                System.out.println("gecerli sifre");
            }else{
                System.out.println("gecersiz sifre");
            }
        }else{
            System.out.println("ilk karakter harf olmalidir");
        }

        //kullanicidan 4 basamakli bir sayi girmesini isteyin. sayi 5'e bolunuyorsa son rakami kontrolet.
        //son rakam 0 ise ekrana 5'e bolunen cift sayi yaz. son rakam 0 degilse 5'e bolunen tek sayi yazdirin.
        //password 5'e bolunmuyorsa ekrana tekrar deneyin yazdirin.

        System.out.println("dort basamakli bir sayi giriniz");
        int s = input.nextInt();

        if(s%5==0){
            if(s%10==0){
                System.out.println("5'e bolunen cift sayi");
            }else{
                System.out.println("5'e bolunen tek sayi");
            }
        }else{
            System.out.println("tekrar deneyin");
        }






    }
}
