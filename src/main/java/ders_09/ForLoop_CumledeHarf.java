package ders_09;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop_CumledeHarf {
    public static void main(String[] args) {

                /*
        Kullanicidan bir cumle ve bir harf alin,
      Cumlede verilen harfin kac kere
      kullanildigini bulup, yazdirin
      ORNEK:
      INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
      OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("bir cumle giriniz");
        String c = input.nextLine().toLowerCase();

        System.out.println("bir harf giriniz");
        String h = input.next().toLowerCase();

        int sum = 0;

        for(int i=0; i<c.length(); i++){
            String s = c.substring(i, i+1);
            if(s.equals(h)){
                sum++;

            }
        }
        System.out.println(sum);

        /*
        Kullanicidan bir kelime isteyiniz
     alinan kelimenin karakter dizisinin her harfi ve
     bu harfin karakter dizisi içindeki indexini birer satıra yazdirin
             ORNEK
      Bir kelime giriniz:istanbul
       Karakter        Index
         i               0
         s               1
         t               2
         a               3
         n               4
         b               5
         u               6
         l               7

         */
        String kelime = "istanbul";



        for(int i = 0; i <kelime.length(); i++){
            String k = kelime.substring(i, i+1);
            int sira = kelime.indexOf(k);
            System.out.println(k + "-" + sira);
        }








    }
}
