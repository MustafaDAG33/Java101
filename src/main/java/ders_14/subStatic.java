package ders_14;

public class subStatic extends Static01 {


    static void ye(){
        eat();
        Static01.a=88;

    }

    public static void main(String[] args) {
        a=23;
        ye();
        a=22;
        eat();

        System.out.println("a = " + a);





    }



}
