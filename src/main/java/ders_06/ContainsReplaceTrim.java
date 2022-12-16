package ders_06;

import java.util.Scanner;

public class ContainsReplaceTrim {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String cumle = input.nextLine();

        boolean c = cumle.contains("buyuk");

        boolean k = cumle.contains("kucuk");


        if(c==true){
            System.out.println(cumle.toUpperCase());

        }else if(k==true){
            System.out.println(cumle.toLowerCase());
        }else{
            System.out.println("buyuk kucuk kelimesi icermiyor");
        }


        //" Java ogrenmek123 Cok guzel@ " stringini "Java ogrenmek cok guzel." seklinde yazin.

        String s = " Java ogrenmek123 Cok guzel@ ";

        String s1 = s.trim();
        String s2 = s1.replaceAll("\\d", "");
        String s3 = s2.replace("@", ".");
        String s4 = s3.replace("C", "c");

        System.out.println(s4);







    }
}
