package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы

Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.

Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4.	Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.

*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Сталлоне", dateFormat.parse("MAY 1 2012"));
        map.put("Харламова", dateFormat.parse("MARCH 22 1979"));
        map.put("Мажирина", dateFormat.parse("JULY 18 1982"));
        map.put("Кишинский", dateFormat.parse("DECEMBER 19 1980"));
        map.put("Ландштейдер", dateFormat.parse("JUNE 14 1968"));
        map.put("Андрейченко", dateFormat.parse("JUNE 14 1980"));
        map.put("Круглов", dateFormat.parse("AUGUST 3 1981"));
        map.put("Кобленко", dateFormat.parse("DECEMBER 19 1980"));
        map.put("Зарицкая", dateFormat.parse("AUGUST 3 1992"));
        map.put("Пиаф", dateFormat.parse("DECEMBER 19 1915"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        map.entrySet().removeIf (e -> e.getValue().getMonth() == Calendar.JUNE
                || e.getValue().getMonth() == Calendar.JULY
                || e.getValue().getMonth() == Calendar.AUGUST);
    }

    public static void main(String[] args) throws ParseException {
        removeAllSummerPeople(createMap());
    }
}
