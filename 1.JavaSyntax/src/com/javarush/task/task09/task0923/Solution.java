package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        Scanner scanner = new Scanner(System.in);

        String inputString = scanner.nextLine();
        String vowels = "";
        String consonants = "";

        for (int i = 0; i < inputString.length(); i++) {
            if (isVowel(inputString.charAt(i))) {
                vowels = vowels + inputString.substring(i, i + 1) + " ";
            }
            else
                if (!Character.isWhitespace(inputString.charAt(i))){
                consonants = consonants + inputString.substring(i, i + 1) + " ";
            }
        }
//        consonants = consonants.substring(0, consonants.length() - 1);
//        vowels = vowels.substring(0, vowels.length() - 1);

        System.out.println(vowels);
        System.out.println(consonants);

        scanner.close();
        }

        // метод проверяет, гласная ли буква
        public static boolean isVowel ( char c){
            c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам
            for (char d : vowels) {  // ищем среди массива гласных
                if (c == d) {
                    return true;
                }
            }
            return false;
        }
    }
