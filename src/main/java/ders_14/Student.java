package ders_14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Student {

    public static void main(String[] args) {

        Can std1 = new Can("kis","tech",100,98);
        Can std2 = new Can("yaz","clarGun",94,154);
        Can std3 = new Can("yaz","diff",85,255);
        Can std4 = new Can("kis","ocean",57,25);

        Can s1 = student("yaz", "tech",100,100);
        student("kis", "solar", 99, 555);

//        List<Can> list = new ArrayList<>(Arrays.asList(std1,std2,std3,std4));


        List<Can> lista = new ArrayList<>();
        System.out.println(listeEkle(lista, std1, std2, std3, std4));
        ortalamaPuan(lista);
        System.out.println("--------");
        kursAdi(lista);
        System.out.println("--------");
        no154(lista);

        mevsimKis(lista);
        System.out.println();

        averageSort(lista);

        System.out.println();
        ogrSayisiSort(lista);

        System.out.println();
        kursAdiSort(lista);



    }
    public static void ortalamaPuan(List<Can> list){
        System.out.println("tum puanlar 98'den az mi = " + list.stream().allMatch(t -> t.getAverageScore() < 98));
    }

    public static void kursAdi(List<Can> list){
        System.out.println("tum kurslar gun kelimesi iceriyor mu = " + list.stream().allMatch(t -> t.getCourseName().contains("gun")));
    }

    public static void no154(List<Can> list){
        System.out.println("154 nolu ogrenci var mi = " + list.stream().anyMatch(t -> t.getNumberOfStudents() == 154));
    }
    public static void mevsimKis(List<Can> list){
        System.out.println("hic kis mevsimi var mi = " + list.stream().anyMatch(t -> t.getSeason().equalsIgnoreCase("kis")));
    }
    public static void averageSort(List<Can> list){
        list.stream().map(t->t.getAverageScore()) . sorted().forEach(t-> System.out.print(t+" "));
    }

    public static void ogrSayisiSort(List<Can> list){
        list.stream().map(t->t.getNumberOfStudents()).  sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    public static void kursAdiSort(List<Can> list){
        list.stream().map(t->t.getCourseName()).  sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }


    public static List<Can> listeEkle(List<Can> a, Can ...stds){

        for(Can w : stds){
            a.add(w);
        }
        return a;
    }

    public static Can student(String season, String courseName, int averageScore, int numberOfStudents){
        return new Can(season,courseName, averageScore, numberOfStudents);
    }






}
