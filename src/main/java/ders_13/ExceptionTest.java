package ders_13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

    final int x;

    void eat(){
    }
    ExceptionTest(){
        x=4;

    }


    public static void main(String[] args) {

        try {
            FileInputStream f = new FileInputStream("C:\\Users\\LENOVA\\IdeaProjects\\JavaCalismalarim101\\src\\main\\java\\ders_13\\Test11");
            int i=0;
            while((i=f.read())!=-1){
                System.out.print((char)i);
            }
            f.close();

        }catch(FileNotFoundException e){
            System.out.println("xxx");
        }catch(IOException e){
            System.out.println("vvv");
        }finally{
            System.out.println("www");
        }

    }
}
