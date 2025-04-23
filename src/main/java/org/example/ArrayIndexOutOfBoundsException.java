package org.example;

public class ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};

        try {
            int value = array[4];
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Ловим исключение: " + e.getMessage());
        }
    }
}
