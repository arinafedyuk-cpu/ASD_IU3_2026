package ru.bmstu.lab1.task_7;

import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 7. Второй максимум: найти второй по величине элемент; все элементы различны. */
public final class Task7 {
    private Task7() {}

    private static final int INITIAL_ELEMENTS = 2;

    /** Возвращает второй максимум массива из как минимум двух различных элементов. */
    public static int solve(int[] values) {
        int maximum = Math.max(values[0], values[1]);
        int secondMaximum = Math.min(values[0], values[1]);
        // Инициализация реальными элементами работает и для Integer.MIN_VALUE.
        for (int index = INITIAL_ELEMENTS; index < values.length; index++) {
            if (values[index] > maximum) {
                secondMaximum = maximum;
                maximum = values[index];
            } else if (values[index] > secondMaximum) {
                secondMaximum = values[index];
            }
        }
        return secondMaximum;
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            System.out.println(solve(values));
        }
    }
}
