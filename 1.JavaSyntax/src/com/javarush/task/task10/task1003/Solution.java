package com.javarush.task.task10.task1003;

/* 
Задача №3 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        float f = (float) 128.50;
//        System.out.println("f: " + f);
        int i = (int) f;
//        System.out.println("f: " + f);
//        System.out.println("i: " + i);
        int b = (int) ((byte)i + f);
//        System.out.println("i: " + (byte)i);
//        System.out.println(b);

        System.out.println(b);
    }
}
