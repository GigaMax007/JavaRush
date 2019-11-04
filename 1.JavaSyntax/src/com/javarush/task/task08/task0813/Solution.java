package com.javarush.task.task08.task0813;

import org.w3c.dom.ls.LSOutput;

import java.util.HashSet;
import java.util.Set;

/* 
20 слов на букву «Л»

Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».

Требования:
1.	Не изменяй заголовок метода createSet().
2.	Программа не должна выводить текст на экран.
3.	Программа не должна считывать значения с клавиатуры.
4.	Метод createSet() должен создавать и возвращать множество (реализация HashSet).
5.	Множество из метода createSet() должно содержать 20 слов на букву &laquo;Л&raquo;.

*/

public class Solution {
    public static Set<String> createSet() {
        Set<String> setWords = new HashSet<>();
        for (int i = 0; i < 20; i++) {
            setWords.add("Лень" + i);
        }
        return setWords;
    }

    public static void main(String[] args) {

    }
}
