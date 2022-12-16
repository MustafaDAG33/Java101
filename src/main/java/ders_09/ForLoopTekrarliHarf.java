package ders_09;

public class ForLoopTekrarliHarf {
    public static void main(String[] args) {

        for(int i =120; i>10; i--){

            if(i%6==0 && i%4==0){
                System.out.print(i + " ");
            }

        }
        System.out.println();

        String s = "Hello world";
        String d = "";

        for(int i=0; i<s.length(); i++){

              String s1 =s.substring(i, i+1);

            if(s.indexOf(s1)!= s.lastIndexOf(s1)){
                if(!d.contains(s1)){
                    d = d + s1;
                }


            }
        }
        System.out.print(d);











    }
}
