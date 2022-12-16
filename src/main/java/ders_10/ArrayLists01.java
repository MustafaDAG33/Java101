package ders_10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayLists01 {
    public static void main(String[] args) {

        //elemanlari A,C,E VE F olan bir string arraylist olusturup yazdirin.
        List<String> s = new ArrayList<>();
        s.add("A");
        s.add("C");
        s.add("E");
        s.add("F");
        System.out.println(s);//[A, C, E, F]

        s.add("B");
        System.out.println(s);//[A, C, E, F, B]

        s.add(1, "L");
        System.out.println(s);//[A, L, C, E, F, B]

        s.set(3, "D");
        System.out.println(s);//[A, L, C, D, F, B]

        s.remove("F");
        System.out.println(s);//[A, L, C, D, B]

        Collections.sort(s);
        System.out.println(s);//[A, B, C, D, L]

        System.out.println(s.contains("L"));//true
        System.out.println(s.contains("m"));//false

        System.out.println(s.size());//5

        s.clear();
        System.out.println(s.isEmpty());//true










    }
}
