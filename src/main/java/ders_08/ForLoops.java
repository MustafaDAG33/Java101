package ders_08;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        //kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin.

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi giriniz");

        int s = input.nextInt();

        for(int i=1; i<s; i++){

            if(i%3==0 || i%5==0){
                System.out.print(i + " ");
            }else if(i>100){
                System.out.println("1 ile 100 arasi bir sayi giriniz");
            }

        }

        //kullanicidan 100'den kucuk bir tamsayi isteyin. 1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. ancak;
        //sayi 3'un kati ise sayi yerine "java" yazdirin.
        //sayi 5'in kati ise sayi yerine "guzeldir" yazdirin.
        //sayi hem 3'un hem 5'in kati ise sayi yerine "java guzeldir" yazdirin.

        System.out.println("100'den kucuk bir sayi giriniz");
        int a = input.nextInt();

        for(int i=1; i<a; i++){

            if(i%3==0 && i%5==0){
                System.out.println("java guzeldir");
            }else if(i%3==0){
                System.out.println("java");
            }else if(i%5==0){
                System.out.println("guzeldir");
            }else {
                System.out.println(i);
            }


        }











    }
}
