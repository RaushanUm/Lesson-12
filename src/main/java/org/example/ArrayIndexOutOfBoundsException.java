package org.example;

public class ArrayIndexOutOfBoundsException {
    private int[] array;

    public ArrayIndexOutOfBoundsException(int[] array) {
        this.array = array;
    }

    public void processArray() {
        try {
            int value = array[4];
            System.out.println("Значение: " + value);
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            System.out.println("Ловим исключение: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3};

        org.example.ArrayIndexOutOfBoundsException exception;
        exception = new ArrayIndexOutOfBoundsException(myArray);

        exception.processArray();
    }
}
