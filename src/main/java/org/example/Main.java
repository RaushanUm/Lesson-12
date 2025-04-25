package org.example;

public class Main {
    public static void main(String[] args) {
        String[][] correctArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };
        String[][] incorrectSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };
        String[][] incorrectDataArray = {
                {"1", "2", "3", "four"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        MyArrayTest tester = new MyArrayTest(correctArray);
        try {
            int sum = tester.processArray();
            System.out.println("Сумма элементов в правильном массиве: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Тестирование массива с неправильным размером:");
        tester = new MyArrayTest(incorrectSizeArray);
        try {
            int sum = tester.processArray();
            System.out.println("Сумма элементов в массиве с неправильным размером: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Тестирование массива с неправильными данными:");
        tester = new MyArrayTest(incorrectDataArray);
        try {
            int sum = tester.processArray();
            System.out.println("Сумма элементов в массиве с неправильными данными: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}

