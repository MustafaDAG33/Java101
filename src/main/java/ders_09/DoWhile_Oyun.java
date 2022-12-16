package ders_09;

import java.util.Scanner;

public class DoWhile_Oyun {
    public static void main(String[] args) {

        //0 ile 100 arasında rastgele numara tahmini yapan bir kod yazın.
        //İpucu: Girdiğiniz numara rastgeleNumara'dan küçükse ==> Daha büyük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'dan büyükse ==> Daha küçük bir numara giriniz.
        //       Girdiğiniz numara rastgeleNumara'ya eşitse ==> Tebrikler!!!.


        Scanner input = new Scanner(System.in);
        System.out.println("0-100 arasinda bir sayi tahmininde bulunun");

        int sayi;
        int r = (int)Math.random() * 100;

        do{

            sayi = input.nextInt();

            if(sayi==r){
                System.out.println("tebrikler!!");
            }else if(sayi>r){
                System.out.println("daha kucuk sayi giriniz");
            }else{
                System.out.println("daha buyuk sayi giriniz");
            }


        }while(sayi!=r);











    }
}
