package ders_12;

import java.util.Scanner;

public class Exeptions002 {

    public static void main(String[] args) {


        String str[] = {"elma, armut, karpuz"};

        Scanner input =new Scanner(System.in);
        System.out.println("istediginiz urunun sirasini giriniz");
        int sira = input.nextInt();


        try{

            System.out.println(str[sira]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("girdiginiz sira urun sayisindan buyuk!!");
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.err.println("girdiginiz sira urun sayisindan buyuk!!");
        }




    }
}
