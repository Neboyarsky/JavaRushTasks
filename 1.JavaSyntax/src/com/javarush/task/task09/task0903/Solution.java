package com.javarush.task.task09.task0903;

/* 
Кто меня вызывал?
*/

public class Solution {
    public static void main(String[] args) {
        method1();
    }

    public static int method1() {
        method2();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        System.out.println("Ожидаемый результат: 9. Фактический результат: " + Thread.currentThread().getStackTrace()[2].getLineNumber());
        System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
        return Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method2() {
        method3();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        System.out.println("Ожидаемый результат: 13. Фактический результат: " + stackTraceElements[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method3() {
        method4();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        System.out.println("Ожидаемый результат: 20. Фактический результат: " + stackTraceElements[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method4() {
        method5();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        System.out.println("Ожидаемый результат: 27. Фактический результат: " + stackTraceElements[2].getLineNumber());
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }

    public static int method5() {
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        return  Thread.currentThread().getStackTrace()[2].getLineNumber();
    }
}
