package org.example;

public class Main {
    public static void main(String[] args)  {
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

        try {
            int sum = MyArrayTest.testArray(correctArray);
            System.out.println("Сумма элементов в правильном массиве: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Тестирование массива с неправильным размером:");
        try {
            int sum = MyArrayTest.testArray(incorrectSizeArray);
            System.out.println("Сумма элементов в массиве с неправильным размером: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }

        System.out.println("Тестирование массива с неправильными данными:");
        try {
            int sum = MyArrayTest.testArray(incorrectDataArray);
            System.out.println("Сумма элементов в массиве с неправильными данными: " + sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }
}