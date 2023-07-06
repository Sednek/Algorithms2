package org.example;

import org.example.myList.MyList;
import org.example.myList.StringList;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        MyList arr = new StringList();
        Random rnd = new Random();

        for (int i = 0; i < 1000; i++) {
            arr.add(rnd.nextInt(1000));
        }
        System.out.println(arr);
        System.out.println(arr.contains(35));
    }
}