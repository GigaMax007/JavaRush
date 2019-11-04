package com.javarush.task.task07.task0728;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
В убывающем порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        reader.close();

        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {

        boolean flag = true;
        int a, t;

        //1
        while (flag) {
            flag = false;    // устанавливаем флаг в false в ожидании возможного свопа (замены местами)
            for (a = 0; a < array.length - 1; a++) {
                if (array[a] < array[a + 1]) { // измените на > для сортировки по возрастанию
                    t = array[a];         // меняем элементы местами
                    array[a] = array[a + 1];
                    array[a + 1] = t;
                    flag = true;  // true означает, что замена местами была проведена
                }
            }
        }
        //1
/*        for (a = 1; a < size; a++) {
            for (b = size - 1; b >= a; b--) {
                if (array[b - 1] > array[b]) {
                    t = array[b - 1];
                    array[b - 1] = array[b];
                    array[b] = t;
                }
            }
        } */
    }
}
