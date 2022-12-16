package ders_05;

import java.util.Scanner;

public class ContainsIndexOff01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("bir cumle giriniz");
//        String cumle = input.nextLine();
//
//        System.out.println("bir harf giriniz");
//        String harf = input.next();
//
//        int a = cumle.indexOf(harf);
//        String varYok = a>-1 ? "girilen harf vardir" : " girdiginiz harf yoktur";
//        System.out.println(varYok);

//        boolean b = cumle.contains(harf);
//        System.out.println(b);
//
        System.out.println("bir cumle giriniz");
        String cml = input.nextLine();

        System.out.println("bir kelime giriniz");
        String klm = input.next();

        int v = cml.indexOf(klm);
        boolean y = cml.indexOf(klm)==cml.lastIndexOf(klm);

        if(v==-1){
            System.out.println("girilen kelime cumlede kullanilmamis");
        }else if(y==true){
            System.out.println("girilen kelime bir kere kullanilmis");
        }else{
            System.out.println("kelime birden fazla kullanilmis");
        }






    }
}
