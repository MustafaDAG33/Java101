package ders_10;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Toplam_Dolar {
    public static void main(String[] args) {

        //kullanicidan 5 sayi isteyin. 5 ile 10 arasindakiler haric digerlerinin toplamini bulunuz.

        Scanner input = new Scanner(System.in);
        System.out.println("kac sayi gireceksiniz");

        int arr[] = new int[input.nextInt()];


        for(int i=1; i<arr.length+1; i++){
            System.out.println(i + ". elemani giriniz");
            arr[i-1] = input.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;

        for(int w : arr){
            if(w<5 || w>10){
                sum += w;

            }

        }
        System.out.println(sum);

        /*
        Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
      Ornek:
       [$1 $12 €34 €56 $45 €78]
        dolarToplami: 58
        euroToplami: 168
         */

        String ed = "$1 $12 €34 €56 $45 €78";
        String edr[] = ed.split(" ");
        System.out.println(Arrays.toString(edr));

        int dtoplami = 0;
        int etoplami = 0;

        for(String w : edr){
            if(w.contains("$")){
                dtoplami+=Integer.parseInt(w.replace("$", ""));
            }else{
                etoplami+=Integer.parseInt(w.replace("€", ""));
            }
        }
        System.out.println("dtoplami = " + dtoplami);
        System.out.println("etoplami = " + etoplami);












    }
}
