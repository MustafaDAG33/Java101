package ders_15;

import java.util.ArrayList;
import java.util.List;

public class Equals01 {

    public static void main(String[] args) {

        String s1 = "Mustafa";
        String s2 = "Mustafa";

        if(s1==s2){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(s1.equals(s2)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        String s3 = new String("M");
        String s4 = new String("M");
        if(s3==s4){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        if(s3.equals(s4)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }




    }



}
