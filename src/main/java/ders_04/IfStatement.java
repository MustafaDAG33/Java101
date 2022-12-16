package ders_04;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        int yas = input.nextInt();

        if(yas<0){
            System.out.println("gecerli bir yas giriniz");
        }else if(yas<5){
            System.out.println("bebek");
        }else if(yas<13){
            System.out.println("cocuk");
        }else if(yas<21){
            System.out.println("genc");
        }else if(yas<31){
            System.out.println("yetiskin");
        }else{
            System.out.println("tanimlanmamis");
        }











    }
}
