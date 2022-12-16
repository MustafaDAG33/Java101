package ders_02;

import java.util.Scanner;

public class IfStatement_01 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        double yas = input.nextDouble();

        if(yas<65){
            System.out.println("emekli olamazsin,calismalisin");
        }else if(yas>=65){
            System.out.println("emekli olabilirsin");
        }else{
            System.out.println("gecersiz karakter girdiniz");
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenarlarini giriniz");
        byte kenar1 = input.nextByte();
        byte kenar2 = input.nextByte();
        byte kenar3 = input.nextByte();

        if(kenar1==kenar2 && kenar2==kenar3){
            System.out.println("eskenar ucgendir");
        }else{
            System.out.println("eskenar ucgen degildir");
        }







    }
}






