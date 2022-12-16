package ders_05;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("haftanin kacinci gunu oldugunu giriniz");
        int gunNo = input.nextInt();

        switch(gunNo){
            case 1 :
                System.out.println("pazar");
                break;
            case 2 :
                System.out.println("pazartesi");
                break;
            case 3 :
                System.out.println("sali");
                break;
            case 4 :
                System.out.println("carsamba");
                break;
            case 5 :
                System.out.println("persembe");
                break;
            case 6 :
                System.out.println("cuma");
                break;
            case 7 :
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("gecersiz no girdiniz");


        }

        System.out.println("bir sayi giriniz");
        int sayi = input.nextInt();

        switch(sayi){
            case 10:
                System.out.println("iki basamakli en kucuk sayi");
                break;
            case 100:
                System.out.println("uc basamakli en kucuk sayi");
                break;
            case 1000:
                System.out.println("dort basamakli en kucuk sayi");
                break;
            default:
                System.out.println("girdiginiz sayiyi degistirin");
        }

        System.out.println("SDET kisaltmasindaki harflerden birini giriniz");
        char s = input.next().charAt(0);

        switch(s){
            case 'S':
                System.out.println("Software");
                break;
            case 'D':
                System.out.println("Developer");
                break;
            case 'E':
                System.out.println("Engineer");
                break;
            case 'T':
                System.out.println("In Testing");
                break;
            default:
                System.out.println("SDET harflerinden birini giriniz");

        }

        System.out.println("gun ismi giriniz");
        String gun = input.next().toUpperCase();

        switch(gun){
            case "CUMARTESI": case "PAZAR":
                System.out.println("haftasonu");
                break;
//            case "PAZAR":
//                System.out.println("haftasonu");
//                break;
            case "PAZARTESI":
                System.out.println("hafta ici");
                break;
            case "SALI":
                System.out.println("hafta ici");
                break;
            case "CARSAMBA":
                System.out.println("hafta ici");
                break;
            case "PERSEMBE":
                System.out.println("hafta ici");
                break;
            case "CUMA":
                System.out.println("hafta ici");
                break;
            default:
                System.out.println("gecerli gun ismi giriniz");
        }



    }
}
