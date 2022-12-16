package ders_14;

public class Rabbit extends Animal{

    String ad="mustafa";
    int j=10;
    static final int b=20;
//    Rabbit(){
//
//    }
//
//    Rabbit(int a){
//        System.out.println("rabbit cons a");
//    }

    void fb(){
        this.j=100;
        System.out.println(j);





    }



    public static void main(String[] args) {
//        Rabbit rabbit = new Rabbit();

        new Rabbit().fb();





    }


}
