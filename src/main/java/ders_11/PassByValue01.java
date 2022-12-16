package ders_11;

public class PassByValue01 {
    public static void main(String[] args) {


    double x = 100;
    double ind = indirim(x);
        System.out.println(ind);
        System.out.println(x);

        System.out.println(indirimYap10(100));
        System.out.println(indirimYap20(100));
        System.out.println(indirimYap25(100));

    }

    public static double indirim (double fiyat){

        return  fiyat - fiyat/10;
    }

    public static int indirimYap10 (int a){

        a*= 0.90;
        return a;
    }

    public static int indirimYap20 (int b){
        b*= 0.80;
        return b;
    }

    public static int indirimYap25 (int c){
        c*= 0.75;
        return c;

    }






}
