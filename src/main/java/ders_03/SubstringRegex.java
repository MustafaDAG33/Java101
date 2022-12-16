package ders_03;

import java.util.Scanner;

public class SubstringRegex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ad soyad giriniz");
        String name = input.nextLine();

        String ad = name.substring(0, name.indexOf(" "));
        String soyad = name.substring(name.indexOf(" ")+1);
        System.out.println(ad);
        System.out.println(soyad);

        // ilk karakter 1, ikinci karekter 3 noktalama işareti ve kalan 8 karakter rakam toplam 12 karakter olmali.

        String s = "11!?.12345678";

        boolean b = s.matches("[1]{2}[\\p{Punct}]{3}[0-9]{8}");
        System.out.println(b);

        System.out.println("fb" .matches(".b"));
        System.out.println("fbkkkk" .matches(".b.*"));
        System.out.println("adhkl" .matches("[a-zA-Z]{2,5}"));



    }
}
