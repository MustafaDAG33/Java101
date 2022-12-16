package ders_14;

import java.util.ArrayList;
import java.util.List;

public class FinalKeyword {

    int a;
//    final int b;

    void eat(){
        System.out.println("eat");
    }

    static int c;
    static final int d;

    static {
        d=77;
        c=7;
    }

    public static void main(String[] args) {
        FinalKeyword fn = new Fin();


    }



//    FinalKeyword(){
//        b=6;
//        a=9;
//        a=99;
//        c=1;
//        c=11;
//
//    }




}


