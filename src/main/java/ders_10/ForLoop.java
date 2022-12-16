package ders_10;

import java.util.Arrays;
import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {

        /*
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
        int MuzSayısı =165, hayatta kalmaDays = 0;
        boolean maymunAlive = true;
         */
        int i = 4;
        int count = 0;
        do{
            count++;

            i+=4;

        }while(i<166);

        System.out.println(count);

        //kullanicidan 5 sayi isteyin. 5 ile 10 arasindakiler haric digerlerinin toplamini bulunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("5 sayi giriniz");

        int arr[] = new int[5];

        for(int j =1; j<arr.length+1; j++){
            System.out.println(j + ". sayiyi giriniz");
            arr[j-1] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int sum = 0;

        for(int w : arr){
            if(w<5 || w>10){
                sum+=w;

            }
        }
        System.out.println(sum);













    }
}
