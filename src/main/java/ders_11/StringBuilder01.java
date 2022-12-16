package ders_11;

public class StringBuilder01 {
    public static void main(String[] args) {


        StringBuilder str1 = new java.lang.StringBuilder("Ahmet1234567890981");
//        StringBuilder str2 = new java.lang.StringBuilder("Ahmet");

        StringBuilder str2 = new StringBuilder("AhMet");

        StringBuilder str3 = new java.lang.StringBuilder("Mehmet");
        str3.append(str1).append(3);





        str2.setCharAt(2, 'y');
        System.out.println(str2);

        str2.delete(1, 3);
        System.out.println(str2);











    }
}
