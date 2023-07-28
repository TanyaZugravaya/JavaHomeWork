package org.example.Exceptions;

public class ex3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            try {//добавили блок try для обработки когда пытаемся присвоить значение элементу массива с неверным индексом
                abc[3] = 9;
            } catch (IndexOutOfBoundsException ex) {
                System.out.println("Массив выходит за пределы своего размера!");
            }
            } catch (NullPointerException ex) {
                System.out.println("Указатель не может указывать на null!");
            } catch (Exception ex) {
                System.out.println("Что-то пошло не так...");
            }
        }

    public static void printSum(Integer a, Integer b) {// убрали FileNotFoundException т.к. метод не предполагает возникновение исключений
        // и это искючение не нужно пробрасывать

        System.out.println(a + b);
    }

}
