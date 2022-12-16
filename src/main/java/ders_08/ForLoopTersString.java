package ders_08;

import java.util.Scanner;

public class ForLoopTersString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String s = input.nextLine();



        for(int i=s.length()-1; i>-1; i--){

            System.out.print(s.charAt(i));

        }








    }
}
