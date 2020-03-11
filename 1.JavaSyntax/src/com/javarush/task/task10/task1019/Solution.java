package com.javarush.task.task10.task1019;

/* 
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> map = new HashMap<>();
        Integer notToLoseInt = null;

        while (true) {
            String anInt = reader.readLine();
            if (anInt.isEmpty()) break;
            int id = Integer.parseInt(anInt);
            String name = reader.readLine();
            if (name.isEmpty()) {
                notToLoseInt = id;
                break;
            }
            map.put(name, id);
            // System.out.println("Id=" + id + " Name=" + name);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getValue() + " " + entry.getKey());
        }
        if (!(notToLoseInt == null))
            System.out.println(notToLoseInt);

        reader.close();
    }
}
