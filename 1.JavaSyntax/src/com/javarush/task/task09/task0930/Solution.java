package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
//        System.out.println("Введите строки и числа, каждое с новой строки:");
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) {
                break;
            }
            list.add(s);
        }

        String[] array = list.toArray(new String[list.size()]);
        sort(array);

//        System.out.println("Отсортированный список:");
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        // напишите тут ваш код
        List<String> words = new ArrayList<>();
        List<String> numbers = new ArrayList<>();
        // запоминаем позиции чисел и слов
        // и одновременно создаем еще два списка - "слова" и "числа"
        boolean[] numbersPositions;
        {
            numbersPositions = new boolean[array.length];
            for (int i = 0; i < array.length; i++) {
                numbersPositions[i] = false;
                if (isNumber(array[i])) {
                    numbersPositions[i] = true;
                    numbers.add(array[i]);
                } else {
                    words.add(array[i]);
                }
            }
        }

        // сортируем список чисел в обратном порядке пузырём
        {
            if (numbers.size() > 1) {
                String temp;
                for (int i = 0; i < numbers.size(); i++) {
                    for (int j = 0; j < numbers.size(); j++) {
                        if (Integer.parseInt(numbers.get(i)) > Integer.parseInt(numbers.get(j))) {
                            temp = numbers.get(i);
                            numbers.set(i, numbers.get(j));
                            numbers.set(j, temp);
                        }
                    }
                }
            }

//            System.out.println("числа, обратная сортировка:");
//            for (String number : numbers)
//                System.out.println(number);
        }

        // сортируем список слов в прямом порядке пузырём
        // и проверяем правильность сортировки спискаи
        {
            if (words.size() > 1) {
                String temp;
                for (int i = 0; i < words.size(); i++) {
                    for (int j = i; j < words.size(); j++) {
                        if (isGreaterThan(words.get(i), words.get(j))) {
                            temp = words.get(i);
                            words.set(i, words.get(j));
                            words.set(j, temp);
                        }
                    }
                }
            }
//            System.out.println("\nслова, прямая сортировка:");
//            for (String word : words) {
//                System.out.println(word);
//            }
        }
        /* тут у нас есть 2 ArrayLists - words & numbers
        // слова отсортированы по возрастанию
        // а числа по убыванию
        // и массив, в нем позиции чисел
        */

        int wordsCount = 0;
        int numbersCount = 0;
        for (int i = 0; i < numbersPositions.length; i++) {
            if (numbersPositions[i]) {
                array[i] = numbers.get(numbersCount);
                numbersCount++;
            } else {
                array[i] = words.get(wordsCount);
                wordsCount++;
            }
        }
    }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String s) {
        if (s.length() == 0) {
            return false;
        }

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') // Строка содержит '-'
                    || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
                    || (chars.length == 1 && c == '-')) // или одиночный '-'
            {
                return false;
            }
        }
        return true;
    }
}
