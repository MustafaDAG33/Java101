package ders_15;

import java.util.Random;

public class Runner {

    public static void main(String[] args) {
        Civciv civciv = new Civciv();
        Ordek ordek = new Ordek();

        Animal animal = new Civciv();
        hayvanSesiCikar(animal);

        Random r = new Random();
        int e = r.nextInt(100);
        System.out.println("e = " + e);


        hayvanSesiCikar(civciv);
        hayvanSesiCikar(ordek);




    }

    public static void hayvanSesiCikar(Animal animal){
        animal.sesiCikar();

    }
}
