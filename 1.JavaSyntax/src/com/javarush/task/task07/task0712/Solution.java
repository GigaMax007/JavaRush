package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самые-самые
1. Создай список строк.
2. Добавь в него 10 строчек с клавиатуры.
3. Узнай, какая строка в списке встретится раньше: самая короткая или самая длинная.
Если таких строк несколько, то должны быть учтены самые первые из них.
4. Выведи на экран строку из п.3. Должна быть выведена одна строка.

Требования:
1. Объяви переменную типа список строк и сразу проинициализируй ee.
2. Программа должна считывать 10 строк с клавиатуры и добавлять их в список.
3. Программа должна выводить на экран самую короткую строку, если она была раньше самой длинной.
4. Программа должна выводить на экран самую длинную строку, если она была раньше самой короткой.
5. Должна быть выведена только одна строка.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> alString = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            alString.add(reader.readLine());
        }
        String sMax = alString.get(1);
        int iMax = 1;
        String sMin = alString.get(0);
        int iMin = 0;
        for (int i = 0; i < alString.size() - 1; i++) {
            if ((i == 0)&(alString.get(i).length() > alString.get(i + 1).length())) {
                sMax = alString.get(i);
                iMax = i;
                sMin = alString.get(i + 1);
                iMin = i + 1;
            }
            if (i != 0) {
                if (alString.get(i).length() > sMax.length()) {
                    sMax = alString.get(i);
                    iMax = i;
                }
                if (alString.get(i).length() < sMin.length()) {
                    sMin = alString.get(i);
                    iMin = i;
                }
            }
        }
        if (alString.get(0).length() == sMax.length()) {
            sMax = alString.get(0);
            iMax = 0;
        }
        if (iMin < iMax ) System.out.println(sMin);
        else System.out.println(sMax);
    }
}
