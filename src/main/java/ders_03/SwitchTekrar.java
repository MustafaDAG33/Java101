package ders_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchTekrar {
    public static void main(String[] args) {

        //kullanicidan gun sayisini aliniz ve gun ismini ekrana yazdiriniz.
        //        1==>pazar 2==>pazartesi

        Scanner input = new Scanner(System.in);
        System.out.println("gun sayisini giriniz");
        byte gunNo = input.nextByte();

        switch(gunNo){

            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;

            default:
                System.out.println("gecerli gun ismi giriniz");



        }
        //kullaniciya ay ismi sorun ve kullanicinin verdigi ay isminden son aya kadar ekrana yazdirin

        System.out.println("ay ismi giriniz");
        String ayIsmi = input.next().toLowerCase();

        switch(ayIsmi){

            case "ocak":
                System.out.println("ocak");
            case "subat":
                System.out.println("subat");
            case "mart":
                System.out.println("mart");
            case "nisan":
                System.out.println("nisan");
            case "mayis":
                System.out.println("mayis");
            case "haziran":
                System.out.println("haziran");
            case "temmuz":
                System.out.println("temmuz");
            case "agustos":
                System.out.println("agustos");
            case "eylul":
                System.out.println("eylul");
            case "ekim":
                System.out.println("ekim");
            case "kasim":
                System.out.println("kasim");
            case "aralik":
                System.out.println("aralik");
                break;

            default:
                System.out.println("gecerli ay ismi giriniz");


        }

        //kullanicidan islem ve iki tane sayi alarak islemin sonucunu ekrana yazdiran basit bir hesap makinasi yaziniz.

        System.out.println("islem giriniz: +,-,/,&");
        char islem = input.next().charAt(0);

        System.out.println("bir sayi giriniz");
        int sayi1 = input.nextInt();

        System.out.println("ikinci sayiyi giriniz");
        int sayi2 = input.nextInt();

        switch(islem){

            case '+':
                System.out.println(sayi1+sayi2);
                break;

            case '-':
                System.out.println(sayi1-sayi2);
                break;

            case '/':
                System.out.println(sayi1/sayi2);
                break;

            case '*':
                System.out.println(sayi1*sayi2);
                break;

            default:
                System.out.println("bu islem tanimlanmamistir.");




        }







    }
}
