package org.example.Exceptions.Lesson;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество датарождения номертелефона пол");
        String userInput = scanner.nextLine();
        scanner.close();

        String[] values = userInput.split(" ");

        if (values.length != 6) {
            System.out.println("Введено недостаточно или слишком много данных. Проверьте ввод и попробуйте еще раз.");
            return;
        }

        String lastName = values[0];
        String firstName = values[1];
        String middleName = values[2];

        LocalDate birthDate;
        try {
            birthDate = LocalDate.parse(values[3], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        } catch (Exception e) {
            System.out.println("Неверный формат даты рождения. Проверьте ввод и попробуйте еще раз.");
            return;
        }

        long phoneNumber;
        try {
            phoneNumber = Long.parseLong(values[4]);
        } catch (NumberFormatException e) {
            System.out.println("Неверный формат номера телефона. Проверьте ввод и попробуйте еще раз.");
            return;
        }

        String gender = values[5];
        if (!gender.equalsIgnoreCase("f") && !gender.equalsIgnoreCase("m")) {
            System.out.println("Неверный формат пола. Проверьте ввод и попробуйте еще раз.");
            return;
        }

        String fileName = lastName + ".txt";
        try (FileWriter writer = new FileWriter(fileName)) {
            String data = lastName + firstName + middleName + birthDate + " " + phoneNumber + gender;
            writer.write(data);
            writer.flush();
            System.out.println("Данные успешно записаны в файл " + fileName);
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл. Проверьте доступ и повторите попытку.");
            e.printStackTrace();
        }
    }
}
