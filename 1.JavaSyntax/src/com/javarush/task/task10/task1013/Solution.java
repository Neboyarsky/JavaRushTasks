package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // Напишите тут ваши переменные и конструкторы
        private String name;
        private int age;
        private Human mom;
        private Human dad;
        private boolean sex;
        private Calendar birthday;

        public Human() {
        }
        public Human(String name, int age, boolean sex, Human mom, Human dad, Calendar birthday){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mom = mom;
            this.dad = dad;
            this.birthday = birthday;
        }
        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Human(int age, boolean sex){
            this.age = age;
            this.sex = sex;
        }
        public Human(int age, boolean sex, Calendar birthday){
            this.age = age;
            this.sex = sex;
            this.birthday = birthday;
        }
        public Human(int age, boolean sex, Human mom, Human dad, Calendar birthday){
            this.sex = sex;
            this.age = age;
            this.mom = mom;
            this.dad = dad;
            this.birthday = birthday;
        }
        public Human(String name, boolean sex, Human mom, Human dad, Calendar birthday){
            this.name = name;
            this.sex = sex;
            this.mom = mom;
            this.dad = dad;
            this.birthday = birthday;
        }
        public Human(String name, int age, Human mom, Human dad, Calendar birthday){
            this.name = name;
            this.age = age;
            this.mom = mom;
            this.dad = dad;
            this.birthday = birthday;
        }
        public Human(String name, int age, boolean sex, Human dad, Calendar birthday){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.dad = dad;
            this.birthday = birthday;
        }
        public Human(String name, int age, boolean sex, Human mom, Human dad){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mom = mom;
            this.dad = dad;
        }

    }
}
