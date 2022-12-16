package ders_12;

public class Student {

    String name = "Emily";
    int age=20;

    Student (String name, int age){
        this.name="Tom";
        this.age=age;
    }

    public static void main(String[] args) {

        Student st = new Student("Oliver", 21);
        System.out.print(st.name);
        System.out.print("," + st.age);


    }
}
