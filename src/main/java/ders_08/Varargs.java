package ders_08;

public class Varargs {

    public static void main(String[] args) {

        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 3;
        int sayi5 = 1;

        topla(sayi1, sayi2, sayi3, sayi4, sayi5);
    }


    public static void topla(int b, int ...a){

        int sum=0;
        for(int w: a){
            sum+=w;
        }

        System.out.println(sum*b);

    }
}
