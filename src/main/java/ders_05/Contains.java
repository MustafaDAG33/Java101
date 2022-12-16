package ders_05;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String mail = input.next();

//        boolean b = mail.contains("@gmail.com");
//        boolean c = mail.endsWith("@gmail.com");

        if(!mail.contains("@gmail.com")){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(mail.endsWith("@gmail.com")){
            System.out.println("gmail adresiniz kaydedildi");
        }else{
            System.out.println("lutfen yazimi kontrol ediniz");
        }







    }
}
