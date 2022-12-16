package ders_14;

public class Static01 {

    int age=2;

    @Override
    public String toString() {
        return "Static01{" +
                "age=" + age +
                ", b=" + b +
                '}';
    }

    public static void main(String[] args) {
        Static01 static01 = new Static01();
        static01.age=25;

        System.out.println("static01.a = " + static01.a);

        Static01 static011 = new Static01();

        System.out.println("static011 = " + static011);
        System.out.println("static01 = " + static01);
    }



    static int a;
    public int b=8;

    static void eat(){
        System.out.println("static method");
        a=11;

    }

    void drink(){
        a=88;

    }



}
