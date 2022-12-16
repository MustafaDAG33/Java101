package ders_02;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("gun ismi giriniz");
        String gun = input.nextLine();





        if(gun.equals("Pazartesi")){
            System.out.println("Paz");
        }else if(gun.equals("Sali")){
            System.out.println();
        }else if(gun.equals("Carsamba")){
            System.out.println("Car");
        }else if(gun.equals("Persembe")){
            System.out.println("Per");
        }else if(gun.equals("Cuma")){
            System.out.println("Cum");
        }else if(gun.equals("Cumartesi")){
            System.out.println("Cum");
        }else if(gun.equals("Pazar")){
            System.out.println("Paz");
        }else{
            System.out.println("Gecerli gun ismi giriniz");
        }

        System.out.println("ilk sayiyi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        if(sayi1>0 && sayi2>0){
            System.out.println("toplam =" + (sayi1 + sayi2));
        }else if(sayi1<0 && sayi2<0){
            System.out.println("carpim =" + (sayi1*sayi2));
        }else if (sayi1<0 && sayi2>0){
            System.out.println("farkli isaretli sayilarla islem yapamazsin");
        }else if(sayi1>0 && sayi2<0){
            System.out.println("farkli isaretli sayilarla islem yapamazsin");
        }else if(sayi1==0 || sayi2==0){
            System.out.println("sifir carpmaya gore yutan elemandir");
        }else{
            System.out.println("gecerli bir sayi giriniz");
        }











    }
}
