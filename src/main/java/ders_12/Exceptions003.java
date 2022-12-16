package ders_12;

public class Exceptions003 {

    public static void mailDogrula(String eMail) throws InvalidEmailCheckedExeption{


        if(eMail.contains("@gmail") || eMail.contains("@hotmail")){
                System.out.println(eMail);
            }else{

            throw new InvalidEmailCheckedExeption("email uygun degil");
        }

    }

    public static void main(String[] args) throws InvalidEmailCheckedExeption {
        mailDogrula("gmail.co");
    }
}
