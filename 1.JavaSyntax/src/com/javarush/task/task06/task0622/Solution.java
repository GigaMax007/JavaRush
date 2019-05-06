package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Числа по возрастанию
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.

Пример ввода:
3
2
15
6
17

Пример вывода:
2
3
6
15
17

Требования:
1. Программа должна считывать 5 чисел с клавиатуры.
2. Программа должна выводить 5 чисел, каждое с новой строки.
3. Выведенные числа должны быть отсортированы по возрастанию.
4. Вывод должен содержать те же числа, что и были введены (порядок не важен).

*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> numbers =  new ArrayList<>();


        int max;
        int min;

//  Создаем массив из пяти чисел
        for (int i = 0; i < 5; i++) {
            int number = Integer.parseInt(reader.readLine());
            numbers.add(number);
//            System.out.println("Записал в масив " + (i+1) + "-е число");
        }
//        System.out.println("Готово!!!\nРезультат ниже:"); // выводим массив
//        System.out.println(numbers);                      // который мы ввели с клавиатуры

//  Сравниваем числа и записываем в массив в порядке возрастания
        for (int i = 0; i < 4 ; i++) {

            for (int j = 0; j < 4 - i; j++) {

                if (numbers.get(j) >= numbers.get(j + 1)) {
                    max = numbers.get(j);
                    min = numbers.get(j + 1);
                    numbers.set(j, min);
                    numbers.set(j + 1, max);
                }

                else {
                    max = numbers.get(j + 1);
                    min = numbers.get(j);
                    numbers.set(j, min);
                    numbers.set(j + 1, max);
                }
            }
        }
        // Выводим результат в столбик
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers.get(i));
        }
    }
}
