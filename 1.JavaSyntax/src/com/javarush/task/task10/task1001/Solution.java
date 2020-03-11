package com.javarush.task.task10.task1001;

/* 
Задача №1 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 0; // 0, до 2 млрд
        int b = (byte) a + 46; // 46, до 127
        byte c = (byte) (a * b); // 0 * 46 = 0, до 127
        double f = (char) 1234.15;
//        System.out.println(f);
        long d = (char) (a + f / c + b);
        System.out.println(d);
    }
}
