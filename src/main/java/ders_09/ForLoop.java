package ders_09;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /*
        Interview Question
          Kullanicidan 100’den kucuk bir tamsayi isteyin.
          1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
          Ancak;
          - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
          - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
          - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("100'den kucuk bir sayi giriniz");
        int sayi = input.nextInt();

        int i =1;

        do{
            if(i%3==0 && i%5==0){
                System.out.print("**Java Guzeldir**");
            }else if(i%5==0){
                System.out.print("Guzeldir ");
            }else if(i%3==0){
                System.out.print("Java ");
            }else{
                System.out.print(i + " ");
            }
            i++;

        }while(i<=sayi);







    }
}
