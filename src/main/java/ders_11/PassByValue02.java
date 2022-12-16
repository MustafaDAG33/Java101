package ders_11;

import java.util.ArrayList;
import java.util.List;

public class PassByValue02 {
    public static void main(String[] args) {

        List<Integer> s = new ArrayList<>();
        s.add(10);
        s.add(11);
        s.add(12);

        artirma1(s);
        System.out.println(s);

        artirma2(s);
        System.out.println(s);


    }

    public static void artirma1(List<Integer> s){

        for (Integer w : s) {
            w += 3;
            System.out.println(w + " ");
        }
        System.out.println();
        System.out.println(s);
    }

    public static void artirma2(List<Integer> s){

        for(int i=0; i<s.size(); i++) {
            s.set(i, s.get(i)+3);
            System.out.println(s.get(i)+ " ");
        }
        System.out.println();
        System.out.println(s);
    }


}
