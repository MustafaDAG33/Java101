package ders_13;

import java.util.ArrayList;
import java.util.Scanner;

public class SchoolMain {

    public static void main(String[] args) {

        School school1 = new School("MKAL", 2);








        ArrayList<Student> studentsOfSchool1 = school1.getStudents();

        int count =1;
        Scanner scan = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        do{
            System.out.println(count + ". ogrencinin adini giriniz");
            String stdName = scan.nextLine();

            System.out.println(count + ". ogrencinin soyadini giriniz");
            String stdSurName = scan.nextLine();

            System.out.println(count + ". ogrencinin yasini giriniz");
            int stdAge = input.nextInt();


            try{
                Student stds = new Student(stdName, stdSurName, stdAge);
                school1.getStudents().add(stds);
//                studentsOfSchool1.add(stds);
                count++;

            }catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println("Yeni ogrenci giriniz");
            }







        }while(count<=school1.getMaxNumberOfStudent());

        System.out.println("Name of School : " +  school1.getNameOfSchool());
        System.out.println("Maximum Number of Student : "+ school1.getMaxNumberOfStudent());



        for(Student w : school1.getStudents()){
            System.out.println(w);
        }








    }

}
