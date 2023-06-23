package org.example.Lesson5;

import java.util.*;

//Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
public class ex2 {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Иван Иванов");
        name.add("Иван Иванов");
        name.add("Светлана Петрова");
        name.add("Кристина Белова");
        name.add("Кристина Белова");
        name.add("Анна Мусина");
        name.add("Анна Крутова");
        name.add("Анна Крутова");
        name.add("Анна Крутова");
        name.add("Анна Крутова");
        name.add("Петр Лыков");
        name.add("Петр Лыков");
        name.add("Павел Чернов");
        name.add("Петр Чернышов");
        name.add("Мария Федорова");
        name.add("Мария Федорова");
        name.add("Мария Федорова");
        name.add("Марина Светлова");
        name.add("Мария Савина");
        name.add("Мария Рыкова");
        name.add("Марина Лугова");
        name.add("Анна Владимирова");
        name.add("Иван Мечников");
        name.add("Петр Петин");
        name.add("Иван Ежов");

        Map<String, Integer> nameCount = new HashMap<>();
        for (String s : name) {
            if (nameCount.containsKey(s)) {
                nameCount.put(s, nameCount.get(s) + 1);
            } else {
                nameCount.put(s, 1);
            }
        }

        List<Map.Entry> sortedName = new ArrayList<>(nameCount.entrySet());
        Collections.sort(sortedName, new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return ((Integer) o2.getValue()).compareTo((Integer) (o1.getValue()));
            }
        });
        for (Map.Entry entry : sortedName)
            System.out.println(entry.getKey() + " - " + entry.getValue());

    }
}


