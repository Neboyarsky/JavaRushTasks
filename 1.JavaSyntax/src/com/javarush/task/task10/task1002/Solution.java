package com.javarush.task.task10.task1002;

/* 
Задача №2 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
        int a = 15; // 1111
        int b =  4; //   100
        float c = (float) a / b; // 15/4 = 3.0
        double d = a * 1e-3 + c; // 15 * 0.001 + 3.0

        System.out.println(d);
    }
}
