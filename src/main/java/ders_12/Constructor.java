package ders_12;

public class Constructor {

    String isim = "Ali Can";
    int yas = 33;
    int kilo = 85;

//    Constructor(){
//
//    }

    Constructor(String name, int age){
        this.isim=name;
        this.yas=age;
    }

    Constructor(String ad){
        this.isim=ad;

    }

    public static void main(String[] args) {
        Constructor insan1 = new Constructor("adem");
        System.out.println(insan1.isim + insan1.kilo + insan1.yas);


    }



}
