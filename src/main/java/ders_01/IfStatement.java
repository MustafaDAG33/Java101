package ders_01;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("bir sayi giriniz");
//        int sayi = input.nextInt();
//
//        if(sayi%2==0){
//            System.out.println("cift sayi");
//
//        }else{
//            System.out.println("tek sayi");
//        }

//        System.out.println("bir gun isminin ilk harfini giriniz");
//        String gun = input.next();
//
//        if(gun.equalsIgnoreCase("p")){
//            System.out.println("pazar, pazartesi veya persembe");
//        }else if(gun.equalsIgnoreCase("s")){
//            System.out.println("sali");
//        }else{
//            System.out.println("cuma veya cumartesi");
//        }

//        System.out.println("bir gun ismi giriniz");
//        String gun = input.next();
//
//        if(gun.equalsIgnoreCase("pazar") || gun.equalsIgnoreCase("cumartesi")){
//            System.out.println("hafta sonu");
//        }else if(gun.equalsIgnoreCase("pazartesi") ||
//                gun.equalsIgnoreCase("sali") ||
//                gun.equalsIgnoreCase("carsamba") ||
//                gun.equalsIgnoreCase("persembe") ||
//                gun.equalsIgnoreCase("cuma")){
//            System.out.println("hafta ici");
//        }else{
//            System.out.println("gecerli bir gun ismi giriniz");
//        }

        System.out.println("dikdortgenin kenar uzunlugunu giriniz");
        byte kenar1 = input.nextByte();
        byte kenar2 = input.nextByte();

        if(kenar1 == kenar2){
            System.out.println("kare");
        }else{
            System.out.println("kare degildir");
        }



    }
}
