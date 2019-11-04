package com.javarush.task.task08.task0814;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

/* 
Больше 10? Вы нам не подходите

Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.

Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Класс Solution должен содержать только три метода.
4.	Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
5.	Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.

*/

public class Solution {
    public static Set<Integer> createSet() {
        Set<Integer> integerSet = new HashSet<>();
        while (integerSet.size() != 20) {
            integerSet.add((int)(Math.random() * 40));
        }
        return integerSet;
    }

    public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() > 10 ) iterator.remove();
        }
        return set;

    }

    public static void main(String[] args) {

    }
}
