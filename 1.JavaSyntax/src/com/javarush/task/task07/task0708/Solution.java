package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка

1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.


Требования:
1. Инициализируй существующее поле strings класса Solution новым ArrayList<>
2. Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
3. Программа должна выводить самую длинную строку на экран.
4. Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.

*/

public class Solution {
    private static List<String> strings;

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        ArrayList<Integer> aLiLength = new ArrayList<>();
        int maxLength = 0;
//        int minLength;

        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
            aLiLength.add(strings.get(i).length());
        }
//        System.out.println(aLsLines);
//        System.out.println(aLiLength);

        for (int i = 0; i < 4; i++) {
            if (i == 0) if (strings.get(i).length() >= strings.get(i + 1).length()) {
                maxLength = strings.get(i).length();
//                minLength = strings.get(i + 1).length();
            }

            if (i == 0) if (strings.get(i).length() < strings.get(i + 1).length()) {
                maxLength = strings.get(i + 1).length();
//                minLength = strings.get(i).length();
            }

            if (i > 0) if (maxLength < strings.get(i + 1).length()) maxLength = strings.get(i + 1).length();
        }

//        System.out.println(maxLength);
        for (int i = 0; i < 5; i++) {
            if (strings.get(i).length() == maxLength) System.out.println(strings.get(i));
        }
    }
}
