package ders_01;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir gun ismi giriniz");
        String gun = input.next();

        if(gun.equalsIgnoreCase("cuma")){
            System.out.println("muslumanlar icin kutsal gun");
        }else if(gun.equalsIgnoreCase("cumartesi")){
            System.out.println("yahudiler icin kutsal gun");
        }else if(gun.equalsIgnoreCase("pazar")){
            System.out.println("hristiyanlar icin kutsal gun");
        }else{
            System.out.println("kutsal gun degildir");
        }



    }
}
