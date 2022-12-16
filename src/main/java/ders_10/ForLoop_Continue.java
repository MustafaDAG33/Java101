package ders_10;

import java.util.Scanner;

public class ForLoop_Continue {
    public static void main(String[] args) {

        // Girilen bir stringin harflerini teker teker ekrana alt alta olacak
        // sekilde yazdiriniz, bosluk veya a harfi geldiginde bunlari yazmasin

        String s = "Sampiyon Fenerbahce";

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' || s.charAt(i) == 'a') {
                continue;
            }
            System.out.println(s.charAt(i));
        }

        /*
            Kullanicidan toplanmak uzere sayilar isteyin.
            Sayi adedi 10'u gecerse yada toplami 500'u gecerse
            " Bu kadar sayi yeter ...adet sayi girdiniz toplami..." yazdirin
         */

        Scanner input = new Scanner(System.in);

        int sayi;
        int toplam =0;
        int sayac = 0;


        while (sayac<11 && toplam<500){
            System.out.println("sayi giriniz...");
            sayi = input.nextInt();
            toplam+=sayi;
            sayac++;

        }

        if(toplam>500){
            System.out.println(sayac + " adet sayi girdiniz" + "toplam :" +toplam);
        }else{
            System.out.println("bu kadar sayi yeter" + sayac + "adet sayi girdiniz" + "toplam :" +toplam);
        }




    }


}

