package ders_14;

public class ThisSuper {

    int a;
    int b=8;

    String eat(){
       return "ahmet";

    }
    ThisSuper(int a){

        System.out.println("a = " + a);

        System.out.println("parametreli");
    }

    ThisSuper(){
        this(5);
        this.eat();
    }

    void drink(){
        System.out.println("this.eat() = " + this.eat());
        System.out.println(this.b);
        System.out.println(this.a);

    }



    public static void main(String[] args) {



        ThisSuper t = new ThisSuper();
        t.drink();




    }
}
