package org.example.Lesson3.Ex3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Books book1 = new Books("Star Trek: Обратный отсчет", "Абрамс", 950, 2009, 240);
        Books book2 = new Books("Толстый и тонкий", "Чехов", 3000, 1883, 96);
        Books book3 = new Books("Книга", "Антонов", 200, 2023, 479);
        Books book4 = new Books("Ещекнига", "Бубочкин", 2222, 1959, 3);
        Books book5 = new Books("Незнайка", "Актото", 815, 2015, 127);
        Books book6 = new Books("Программирование", "Азимут", 1000, 2010, 1);
        List<Books> booksList = new ArrayList<>();
        booksList.add(book1);
        booksList.add(book2);
        booksList.add(book3);
        booksList.add(book4);
        booksList.add(book5);
        booksList.add(book6);
        List<String> searchName = new ArrayList<>();
        for (Books books : booksList) {
            if (books.getSurname().startsWith("А") && books.getYear() >= 2010) {
                if (primePagesCount(books.getPagesCount())) {
                    searchName.add(books.getName());
                }
            }
        }
        System.out.println(searchName);
    }
    public static boolean primePagesCount(int number) {
        if (number < 2) return true;
        for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
        return true;
    }
}
