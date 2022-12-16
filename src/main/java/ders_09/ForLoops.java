package ders_09;

import java.util.Scanner;

public class ForLoops {
    public static void main(String[] args) {

        /*
         Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
      tekrarlayan kodu yaziniz
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

         */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir string girin");
        String s = scan.nextLine();
        System.out.println("tekrar edilecek sayiyi giriniz");
        int tekrar = scan.nextInt();

        String ilk =s.substring(0,1);
        String son = s.substring(s.length() - 1);
        String t = ilk+son;
        System.out.println(t.repeat(tekrar));

        /*

         *
        * *
       *   *
      *     *
     *********
         sekilde gorulen ucgeni yazdirin.

         */
        System.out.println();



        for(int i=1; i<=5; i++){
            for(int j=1; j<=9; j++){

                if((i==1 && j==5) || (i==2 && (j==4 || j==6)) || (i==3 && (j==3 || j==7)) || (i==4 && (j==2 || j==8)) || (i==5)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();

        }











    }
}
