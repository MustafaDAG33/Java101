package ders_10;

public class PassByValue {
    public static void main(String[] args) {


        int s = topla(20, 30, 100);
        System.out.println(s);

        int m = add(15, 200, 100, 100, 600);
        System.out.println(m);



    }

    public static int topla(int a, int b, int c) {

        return a * b * c;
    }

    public static int add(int ...a) {

        int sum=0;
        for(int w : a){
            sum+=w;
        }
        return sum;
    }







}
