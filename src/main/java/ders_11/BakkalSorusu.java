package ders_11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalSorusu {
    /*
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan aşağıysa o günleri return yap.
     */
    public static void main(String[] args) {

        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        List<Integer> gunlukKazanclar = new ArrayList<>();

        Scanner input = new Scanner(System.in);



        for(int i=0; i<gunler.size(); i++) {
            System.out.println(gunler.get(i) + " gununun gunluk kazancini giriniz");
            int kazanc = input.nextInt();
            gunlukKazanclar.add(kazanc);
        }

        System.out.println("gunluk kazanclar " + gunlukKazanclar);
        System.out.println("ortalama kazanc " +  getortalamakazanc(gunlukKazanclar));

        getOrtalamaninUstundeKazancGünleri(gunlukKazanclar, gunler);
        getOrtalamaninAltindaKazancGünleri(gunlukKazanclar, gunler);

    }

    public static int getortalamakazanc (List<Integer> a){

        int sum = 0;
        for(int w : a){
            sum += w;
        }
        int ort = sum/a.size();
        return ort;
    }

    public static void getOrtalamaninUstundeKazancGünleri (List<Integer> a, List<String> b){
        String oukg = "";
        for(int i=0; i<a.size(); i++){
            if(a.get(i)>getortalamakazanc(a)){
                oukg = oukg +" " + b.get(i);
            }
        }
        System.out.println("ortalama ustu kazanc gunleri: " + oukg);



    }
    public static void getOrtalamaninAltindaKazancGünleri (List<Integer> x, List<String> y){
        String oakg = "";
        for(int i=0; i<x.size(); i++){
            if(x.get(i)< getortalamakazanc(x)){
                oakg = oakg + " " +y.get(i);
            }
        }
        System.out.println("ortalama altinda kalan kazanc gunleri: " + oakg);

    }




}
