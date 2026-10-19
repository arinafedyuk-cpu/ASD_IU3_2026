package ru.bmstu.lab1.task_8;

import java.util.Arrays;
import java.util.Scanner;
import ru.bmstu.lab1.common.ConsoleIo;

/** Задача 8. Фильтрация по знаку: выделить положительные и отрицательные числа, исключая нули. */
public final class Task8 {
    private Task8() {}

    /** Возвращает положительные и отрицательные элементы в двух массивах, сохраняя порядок. */
    public static int[][] solve(int[] values) {
        int[] positives = new int[values.length];
        int[] negatives = new int[values.length];
        int positiveCount = 0;
        int negativeCount = 0;
        for (int value : values) {
            if (value > 0) {
                positives[positiveCount++] = value;
            } else if (value < 0) {
                negatives[negativeCount++] = value;
            }
        }
        return new int[][] {
            Arrays.copyOf(positives, positiveCount), Arrays.copyOf(negatives, negativeCount)
        };
    }

    /** Читает данные из стандартного ввода и печатает только ответ задачи. */
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] values = ConsoleIo.readArray(scanner);
            int[][] result = solve(values);
            System.out.println(ConsoleIo.format(result[0]));
            System.out.println(ConsoleIo.format(result[1]));
        }
    }
}
