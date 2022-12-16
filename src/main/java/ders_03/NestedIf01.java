package ders_03;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {

        /*
        Password'un ilk harfi buyukse
           'A' olursa gecerli password aksi halde gecersiz password
           Password'un ilk harfi kucukse
           'z' olursa gecerli aksi halde gecersiz password

           not: java nested kodlari calistirirken cok zaman harcar. buna time complexity denir.
           bu yuzden mumkunse nested kod yazmamaya calisiriz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("password giriniz");
        String pass = input.next();

        char ilkHarf = pass.charAt(0);

        if (ilkHarf >= 'A' && ilkHarf <= 'Z') {

            if (ilkHarf == 'A') {
                System.out.println("gecerli password");

            }else{
                System.out.println("gecersiz password");
            }

        }else if(ilkHarf >= 'a' && ilkHarf <= 'z'){

            if(ilkHarf=='z'){
                System.out.println("gecerli password");

            }else{
                System.out.println("gecersiz password");
            }

        }else{
            System.out.println("ilk karakter harf olmalidir");
        }


//        else if {
//            System.out.println("gecersiz password");
//        }
//        if (ilkHarf >= 'a' && ilkHarf <= 'z') {
//            if (ilkHarf == 'a') {
//                System.out.println("gecerli password");
//            } else if {
//                System.out.println("gecersiz password");
//            }
//        } else {
//            System.out.println("ilk harf karakter olmalidir");
//        }


    }
}
