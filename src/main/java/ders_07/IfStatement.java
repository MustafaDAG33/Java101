package ders_07;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("100 uzerinden bir not giriniz");
        int not = input.nextInt();

        if(not<50){
            System.out.println("D");
        }else if(not<61){
            System.out.println("C");
        }else if(not<81){
            System.out.println("B");
        }else if(not<101){
            System.out.println("A");
        }else{
            System.out.println("100'luk sistemde bir not giriniz");
        }


    }
}
