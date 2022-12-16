package ders_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NestedFor_CarpimTablosu {
    public static void main(String[] args) {

        /*
         2 boyutlu bir tablo olarak, ekrana çarpım tablosunu hesaplayıp yazan kodu yazınız.
       Örnek Ekran çıktısı
       1  2  3  4  5
       2  4  6  8 10
       3  6  9 12 15
       4  8 12 16 20
       5 10 15 20 25
       Ekran çıktısı 5 x 5 boyutları için örnek olarak verilmiştir,
       isterseniz boyutları klavyeden okuyup istenen boyutlara göre
       ekrana basan bir kod yazabilirsiniz.
         */




        for(int i=1; i<6; i++){

            for(int j=1; j<6; j++){
                System.out.print(j*i + " ");

            }

            System.out.println();
        }

        //Elementlerini kullanıcan alarak bir integer Array oluşturunuz.
        // Kullanıcıdan bir indeks alınız ve o indeksteki elementi siliniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("sayi adedi giriniz");
        int kac = scan.nextInt();
        int arr[] = new int[kac];

        for(int i=1; i<kac+1; i++){
            System.out.println(i + ". sayiyi giriniz");
            arr[i-1] = scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        List<Integer> s = new ArrayList<>();

        for(int w : arr){
            s.add(w);

        }
        System.out.println("silmek istediginiz elementi giriniz");
        s.remove(s.indexOf(scan.nextInt()));
        System.out.println(s);









    }
}
