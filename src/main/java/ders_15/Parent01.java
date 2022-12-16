package ders_15;

public class Parent01 {
    String ad = "Mustafa";
    int k;
    void eat(){
        System.out.println("void");
    }
    Parent01(){
        System.out.println("cons");
    }

    @Override
    public String toString() {
        return "Parent01{" +
                "ad='" + ad + '\'' +
                ", k=" + k +
                '}';
    }

    public static void main(String[] args) {
        Parent01 p = new Parent01();
        p.eat();
        System.out.println(p);
    }
}
