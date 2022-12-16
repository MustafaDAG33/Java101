package ders_02;

import java.util.Scanner;

public class IfElse01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("notunuzu giriniz");
        int not = input.nextInt();

        if(not>100 || not<0){
            System.out.println("100'luk sistemde bir not giriniz");
        }else if(not<50){
            System.out.println("D");
        }else if(not>=50 && not<=60){
            System.out.println("C");
        }else if(not>=60 && not<=80){
            System.out.println("B");
        }else if(not>80){
            System.out.println("A");
        }else{
            System.out.println("gecerli bir not giriniz");
        }

        System.out.println("maas teklif ediniz");
        double maas = input.nextDouble();

        if(maas>80.000){
            System.out.println("kabul ediyorum");
        }else if(maas>60.000 && maas<80.000){
            System.out.println("konusabiliriz");
        }else if(maas<60.000){
            System.out.println("maalesef kabul edemem");
        }





    }
}
