package ders_08;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {

        /*
        Ask user to their weight and height and type a program with calculates mass index

* HINT : Body Mass Index = Weight (kg) / Square of height (m)

Then give a message to user as following:

If BMI is less than 18.5 , you re weak
If BMI is between 18.5 and 25 , your weight is ideal
If BMI is between 25 and 30, you re fat
If BMI is more than or equal to 30, obese

EXAMPLE :
INPUT:
Weight : 71
Height : 1,72

OUTPUT :
Your BMI is  : 23.99945916711736
Your weight is ideal
         */
        Scanner input = new Scanner(System.in);
//        System.out.println("lutfen  kilonuzu giriniz");
//        double weight = input.nextDouble();
//        System.out.println("lutfen boyunuzu giriniz");
//        double height = input.nextDouble();
//
//        double bmi = weight/(height*height);
//
//        if (bmi < 18.5){
//            System.out.println("your BMI is :" + bmi);
//            System.out.println("you are weak");
//        }else if (bmi>=18.5 && bmi<=25){
//            System.out.println("your weight is ideal");
//        }else if (bmi>25 && bmi<30){
//            System.out.println("you are fat");
//        }else if (bmi>=30){
//            System.out.println("obese");
//        }

        //kullanicidan 100'den kucuk bir sayi isteyin. 1'den baslayarak girilen sayiya kadar 3'un kati olan sayilari yazdirin.

        System.out.println("bir sayi gitriniz");
        int s = input.nextInt();


        for(int i=1; i<s; i++){
            if(i%3==0){
                System.out.println(i);


            }


        }
























    }
}
