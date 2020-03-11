package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Алфавит
        List<Character> alphabet = Arrays.asList(
                'а','б','в','г','д','е','ё','ж',
                'з','и','й','к','л','м','н','о',
                'п','р','с','т','у','ф','х','ц',
                'ч','ш','щ','ъ','ы','ь','э','ю','я');

        // Ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }
        reader.close();

        // напишите тут ваш код
        Map<Character, Integer> lettersCount = new HashMap<>(); // мапа хранить пары буква - количествоБукв
        for (Character character : alphabet) {
            lettersCount.put(character, 0);
        }

        //пробуем с одной строкой для начала
        for (int a = 0; a < list.size(); a++) {
            char[] lettersInString = list.get(a).toCharArray();
            for (int i = 0; i < lettersInString.length; i++){
                if (lettersCount.containsKey(lettersInString[i])) {
                    lettersCount.replace(lettersInString[i], lettersCount.get(lettersInString[i]) + 1);
//                System.out.print("Ключ: " + lettersInString[i] + "; ");
//                System.out.println("Значение: " + lettersCount.get(lettersInString[i]));
                }
            }
        }

//        System.out.println(lettersCount);
        for (char character : alphabet) {
            System.out.println(character + " " + lettersCount.get(character));
        }
    }
}
