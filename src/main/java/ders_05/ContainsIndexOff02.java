package ders_05;

import java.util.Scanner;

public class ContainsIndexOff02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//        System.out.println("bir cumle giriniz");
//        String cml = input.nextLine();
//
//        System.out.println("bir harf giriniz");
//        String hrf = input.next();
//
//        boolean b = cml.contains(hrf);
//        System.out.println(b);

        System.out.println("cumle girin");
        String cumle = input.nextLine();

        System.out.println("kelime girin");
        String kelime = input.next();

        int deger = cumle.indexOf(kelime);

        if(deger<0){
            System.out.println("kelime cumlede kullanilmamistir");
        }else if(cumle.indexOf(kelime)==cumle.lastIndexOf(kelime)){
            System.out.println("girdiginiz kelime bir kez kullanilmistir");
        }else{
            System.out.println("girdiginiz kelime birden cok kez kullanilmistir");
        }







    }
}
