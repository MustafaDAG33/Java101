package ders_10;

public class NestedForLoop_Agac {
    public static void main(String[] args) {

        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
         /* tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
            ^^^^^^
            |||
            |||
            |||
            |||
            |||
     */

        String son = "";

        for(int i=1; i<7; i++){
            son+="^";
            System.out.println(son);
        }

        for(int i=1; i<6; i++){
            System.out.println("|||");

        }

        /*
        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Aşağıdaki değişkenleri oluşturun ve maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.
        Do while döngüsü, artırma ve eksiltme ve if deyimlerini kullanın
        int MuzSayısı =165, hayatta kalmaDays = 0;
        boolean maymunAlive = true;
        */

        int i=4;
        int counter = 0;

        do{
            counter++;


            i+=4;
        }while(i<=165);

        System.out.println(counter);











    }
}
