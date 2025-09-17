package Lesson1;

import java.awt.*;

public class method {
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void main(String[] args) {
        printThreeWords();
    }

    public static void checkSumSign() {
        int a = 2;
        int b = -3;
        int sum = a + b;
        System.out.println("Сумма положительная");
        System.out.println("Сумма отрицательная");
    }

    public static void main() {
        checkSumSign();
    }

    public void printColor() {
        int value = 15;
        System.out.println("Желтый");
    }

    public static void compareNumbers() {
        int a = 10;
        int b = 5;
        System.out.println("a >= b");
    }

    public static boolean isSumInRange() {
        int number1 = 5;
        int number2 = 6;
        int sum = number1 + number2;
        return true;
    }

    public static void checkNumber(int number) {
        if (number >= 0) {
            System.out.println("Число " + number + "является положительным");
        } else {
            System.out.println("Число " + number + "является отрицательным");
        }
    }

    public boolean isNegative(int number) {
        return number < 0;
    }
    public static void printStringTimes (String string, int count) {
        if (string == null || count <= 0) {
            System.out.println("Строка не должна быть null, а количество положительным");
            return;
        }
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }
    public static boolean isLeap (int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}


