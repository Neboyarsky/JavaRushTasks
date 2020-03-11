package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        String interimString = s;
//        System.out.println(s);
        for (int i = 0; i < 40; i++) {
            System.out.println(interimString);
            interimString = s.substring(i + 1);
        }
    }
}

