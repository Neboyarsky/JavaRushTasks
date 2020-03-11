package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.List;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String>[] list = new ArrayList[3];
        list[0] = new ArrayList<>();
        list[1] = new ArrayList<>();
        list[2] = new ArrayList<>();
        list[0].add("wdfwf");
        list[0].add("sfefef");
        list[0].add("wef2fe2f");
        list[1].add("wdfwf");
        list[1].add("r3rf113f");
        list[1].add("r13f97h13hf013h");
        list[2].add("wf2c312f123f");
        return list;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}