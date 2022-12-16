package ders_06;

import java.util.Scanner;

public class ContainsSifre {
    public static void main(String[] args) {

        /*
        kullanicidan bir sifre girmesini isteyin.asagidaki sartlari sagliyorsa "sifre basari ile tanimlandi"
        sartlari saglamazsa "islem basarisiz.lutfen yeni bir sifre giriniz"yazdirin.

        -ilk harf buyuk olmali
        -son harf kucuk olmali
        -sifre bosluk icermemeli
        -sifre uzunlugu en az 8 karakter olmali
         */

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen sifrenizi giriniz");
        String psw = input.next();

        boolean first = psw.length()>7;
        boolean second = !psw.contains(" ");
        boolean third = psw.charAt(0)>='A' && psw.charAt(0)<='Z';
        boolean fourth = psw.charAt(psw.length()-1) >='a' && psw.charAt(psw.length()-1) <='z';


        String gecerli = first && second && third && fourth ? "sifre basariyla tanimlandi" : "islem basarisiz, lutfen yeni sifre giriniz";
        System.out.println(gecerli);









    }
}
