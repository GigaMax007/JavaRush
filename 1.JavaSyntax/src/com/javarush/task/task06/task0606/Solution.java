package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
Ввести с клавиатуры число. Определить, сколько в введенном числе четных цифр, а сколько нечетных.
Если число делится без остатка на 2 (т. е. остаток равен нулю), значит оно четное.
Увеличиваем на 1 счетчик четных цифр (статическая переменная even).
Иначе число нечетное, увеличиваем счетчик нечетных цифр (статическая переменная odd).
Вывести на экран сообщение: "Even: а Odd: b", где а - количество четных цифр, b - количество нечетных цифр.

Пример для числа 4445:
Even: 3 Odd: 1

Требования:
1. Программа должна считывать данные с клавиатуры.
2. Метод main должен посчитать сколько четных цифр во веденном числе и записать это количество в переменную even.
3. Метод main должен посчитать сколько нечетных цифр во веденном числе и записать это количество в переменную odd.
4. Программа должна выводить текст на экран.
5. Выведенный текст должен соответствовать заданию.
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
//        even = 0;
//        odd = 0;
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String sN = r.readLine();
//        System.out.println("sN=" + sN);
        int iN = Integer.parseInt(sN);
//        System.out.println("iN=" + iN);
        int x = sN.length();
//        System.out.println("x=" + x);

        for (int i = x; i >= 1 ; i--) {
            int iNk = (int) (iN / Math.pow(10, (i - 1)));
//            System.out.println("iNk=" + iNk + " при i=" + i);
            if ((iNk % 2) == 0) even++;
            else odd++;
        }

        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
