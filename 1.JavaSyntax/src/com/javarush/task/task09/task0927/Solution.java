package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        Cat cat0 = new Cat("Magic");
        map.put(cat0.name, cat0);
        Cat cat1 = new Cat("Murzik");
        map.put(cat1.name, cat1);
        Cat cat2 = new Cat("Vasily");
        map.put(cat2.name, cat2);
        Cat cat3 = new Cat("Jess");
        map.put(cat3.name, cat3);
        Cat cat4 = new Cat("Brennan");
        map.put(cat4.name, cat4);
        Cat cat5 = new Cat("Amos");
        map.put(cat5.name, cat5);
        Cat cat6 = new Cat("Duncan");
        map.put(cat6.name, cat6);
        Cat cat7 = new Cat("Jared");
        map.put(cat7.name, cat7);
        Cat cat8 = new Cat("Leto");
        map.put(cat8.name, cat8);
        Cat cat9 = new Cat("Rembrandt");
        map.put(cat9.name, cat9);

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> set = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
