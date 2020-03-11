package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static java.lang.Integer.parseInt;

/* 
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите дату в формате ГГГГ-ММ-ГГ");
        String inputDate = bufferedReader.readLine();
//        System.out.println(inputDate);
        bufferedReader.close();

        String[] dateSplit = inputDate.split("-");

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM d, yyyy");

        Date date = new Date();
        date.setDate(parseInt(dateSplit[2]));
//        System.out.println("Day: " + date.getDate());
        date.setMonth((parseInt(dateSplit[1])-1));
//        System.out.println("Month: " + date.getMonth());
        date.setYear(parseInt(dateSplit[0])-1900);
//        System.out.println("Year: " + date.getYear());

        System.out.println(simpleDateFormat.format(date).toUpperCase());

    }
}
