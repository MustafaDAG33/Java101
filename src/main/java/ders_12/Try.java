package ders_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Try {


    public static void main(String[] args) {


        int arr[] = new int[3];
        System.out.println(arr[1]);

        arr[0] = 11;
        arr[1] = 12;
        System.out.println(Arrays.toString(arr));

        char arr1[] = new char[4];
        arr1[0] = 'A';
        arr1[2] = 'E';
        arr1[3] = 'M';
        System.out.println(Arrays.toString(arr1));

        ArrayList<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");

        System.out.println(list.remove(2));
        System.out.println(list.remove("C"));






    }
}
