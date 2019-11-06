package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/* 
Омовение Рамы

Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
мама мыла раму.

Пример вывода:
Мама Мыла Раму.

Требования:
1.	Программа должна выводить текст на экран.
2.	Программа должна считывать строку с клавиатуры.
3.	Класс Solution должен содержать один метод.
4.	Программа должна заменять в тексте первые буквы всех слов на заглавные.

*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        reader.close();
        StringTokenizer wordsString = new StringTokenizer(string); // Класс StringTokeniser и примеры -> http://bit.ly/2qy5xVl
        String upLettersString = "";
        while (wordsString.hasMoreTokens()) {
            String word = wordsString.nextToken();
            String newWord = word.substring(0,1).toUpperCase() + word.substring(1); // О методе substring(), пример -> http://bit.ly/2NmGjT3
            upLettersString = upLettersString + newWord + " ";
        }
        System.out.println(upLettersString);
    }
}