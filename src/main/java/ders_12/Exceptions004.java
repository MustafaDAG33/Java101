package ders_12;

public class Exceptions004 {

    public static void eMailDogrula(String mail) throws InvalidEMailUnCheckedException{

        if(mail.contains("@gmail") || mail.contains("@hotmail")){
            System.out.println(mail);
        }else{
            throw new InvalidEMailUnCheckedException("Mail uygun degil");
        }
    }

    public static void main(String[] args) throws InvalidEMailUnCheckedException {

        eMailDogrula("@hotmai");
    }
}
