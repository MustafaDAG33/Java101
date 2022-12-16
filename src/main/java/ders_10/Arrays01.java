package ders_10;

import java.sql.SQLOutput;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        //elemanlari ali, veli ayse ve fatma olan array olustur ve yazdir.

        String a[] = new String[4]; //[null, null, null, null]
        System.out.println(Arrays.toString(a));

        a[0]= "Ali";
        a[1]= "Veli";
        a[2]= "Ayse";
        a[3]= "Fatma";

        System.out.println(Arrays.toString(a)); //[Ali, Veli, Ayse, Fatma]
        System.out.println(a[0]);//Ali

        int u =a.length;//4

        //example; verilen uc elemanli bir array'in tum elemanlarini bir soldaki konuma tasiyacak bir program yazin.
        //         [1, 2, 3,] ==> [2, 3, 1]

        int b[] = {1, 2, 3,};

        System.out.println(Arrays.toString(b));

        int yeni[] = new int[b.length];
        yeni[yeni.length-1]=b[0];



        for(int i=0; i<b.length-1; i++){

            yeni[i] = b[i+1];
        }
        System.out.println(Arrays.toString(yeni));







        //example 3; verilen bir array'in tum elemanlarini toplayan program yazdirin.

        int sayi[] = {5, 45, 3,};

        int sum = 0;

        for(int w : sayi){
            sum += w;
        }
        System.out.println(sum);












    }
}
