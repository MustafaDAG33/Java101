package ders_14;

public class Fin extends FinalKeyword{

    int b;

     void eat(){
        System.out.println("drink");
    }

    static void drink(){
        System.out.println("drinking");
    }


    public static void main(String[] args) {
        FinalKeyword f = new Fin();
        f.eat();




    }
   

}

