package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Нам повторы не нужны

Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.

Требования:
1.	Программа не должна выводить текст на экран.
2.	Программа не должна считывать значения с клавиатуры.
3.	Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей.
4.	Метод removeTheFirstNameDuplicates() должен удалять из словаря всех людей, имеющие одинаковые имена.
5.	Метод removeTheFirstNameDuplicates() должен вызывать метод removeItemFromMapByValue().

*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> people = new HashMap<>();
        people.put("Петров", "Василий");
        people.put("Моисеенко", "Алексей");
        people.put("Семиколенов", "Виктор");
        people.put("Родионов", "Михаил");
        people.put("Михайлова", "Светлана");
        people.put("Заречный", "Михаил");
        people.put("Кононова", "Светлана");
        people.put("Устименко", "Алексей");
        people.put("Сладкова", "Анна");
        people.put("Петрухина", "Ольга");
        
        return people;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Set<String> nameSet = new HashSet<>(map.values());
        for ( String name : nameSet) {
            int count = 0;
            for(Map.Entry<String, String> pair : map.entrySet()) {
                if (pair.getValue().equals(name)) count++;
            }
            if (count > 1) removeItemFromMapByValue(map, name);
        }
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        removeTheFirstNameDuplicates(createMap());
    }
}
