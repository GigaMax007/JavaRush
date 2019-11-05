package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Cамая длинная последовательность

1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.
Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3
Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.

Требования:
1.	Программа должна выводить число на экран.
2.	Программа должна считывать значения с клавиатуры.
3.	В методе main объяви переменную типа List с типом элементов Integer и сразу проинициализируй ee.
4.	Программа должна добавлять в коллекцию 10 чисел, согласно условию.
5.	Программа должна выводить на экран длину самой длинной последовательности повторяющихся чисел в списке.

*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> integerList = new ArrayList<>(10);
        for (int i = 0; i < 10; i++) {
            String data = bufferedReader.readLine();
            integerList.add(Integer.valueOf(data));
        }
        bufferedReader.close();
        int a = 0, b = 1, count = 1;
        for (int i = 0; i < 9; i++) {
            if(integerList.get(i).equals(integerList.get(i + 1))) {
                count++;
                a = count;
                if (a > b) b = a;
            } else {
                count = 1;
            }
        }
        System.out.println(b);
    }
}
