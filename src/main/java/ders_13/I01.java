package ders_13;

import java.util.LinkedList;
import java.util.Queue;

public interface I01 {

    public static void main(String[] args) {

        Queue<String> q = new LinkedList();
        q.add("Ali");
        q.add("Ahmet");
        q.add("Veli");
        q.add("Ali");

//        System.out.println(q.poll());

        System.out.println(q.element());

        System.out.println(q);
    }
}
