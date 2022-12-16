package ders_12;

public class Exeptions001 {

    public static void main(String[] args) {


        carpma("b");




    }

    public static void carpma(String a){


        try{
            int x = Integer.parseInt(a);

                System.out.println(x*2);


        }catch(NumberFormatException e){
            System.out.println("Girdiginiz string sayiya cevrilemez!!");
        }





        }
    }

