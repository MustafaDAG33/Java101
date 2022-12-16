package ders_13;

import java.util.Random;

public class Exception_Throw_01 {
    //rastgeleSayi isminde bir method oluşturunuz.
    //   Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
    //   Bu iki random sayının toplamını yazdırın.
    //   Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
    //   ("Sayı 12'den küçük ise hata verir") yazdırın.

    public static void rastgele() throws Exception {

        Random random = new Random();
        int a = random.nextInt(11);
        int b = random.nextInt(11);


        if((a+b)<12){
            throw new Exception("sayilarin toplami 12'den kucuk olamaz!!..");
        }else{
            System.out.println(a+b);
        }


    }

    public static void rastgeleSayi(){

        while(true){
            int a = (int)(Math.random()*11);
            int b = (int)(Math.random()*11);


            try{
                if((a+b)<12){
                    throw new Exception();
                }else{
                    System.out.println(a+b);
                    break;
                }

            }catch(Exception e){
                System.out.println(a+"+"+b+"="+(a+b));
                System.out.println("sayilarin toplami 12'den kucuk olamaz!!!...");
            }
        }


    }

    public static void main(String[] args) throws Exception {

        rastgele();
        rastgeleSayi();

    }
}
