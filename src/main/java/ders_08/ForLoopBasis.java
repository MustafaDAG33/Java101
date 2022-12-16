package ders_08;

public class ForLoopBasis {
    public static void main(String[] args) {

        //example1:

        int sum = 0;
        for(int i=1; i<6; i++){
//            sum = sum + i;
        }
        System.out.println("Toplam:" + sum);//15

        //example2:

        int sum1 = 0;
        for(int i=10; i>0; i=i-5){
            sum1=sum1+i;
        }
        System.out.println(sum1);//15

        //example3:

        int pro = 1;
        for(int i=5; i>=0; i--){
            pro = pro * i;
        }
        System.out.println(pro);//0

        //example4:

        for(int i=1; i<=6; i++){
            System.out.print(i + " ");
            i++;
        }

        //example5:

//        for(int j=10; j>0; j++){
//            System.out.print("Hello"); //sonsuz kere hello
//        }

        //example:6

        for(char i='f'; i>'a'; i--){
            System.out.println(i  + " ");
            i--;
        }

        //example:7

        for(int i=1; i<=5; i++){
            for(int j=(5-i); j>1; j--){
                System.out.print(i+j);
            }
            System.out.println();
        }

        //example:8



        











    }
}
